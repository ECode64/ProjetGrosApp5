/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import transfertObject.Appareil;
import dao.DAOAppareils;
import transfertObject.Categorie;
import transfertObject.Etat;

/**
 *
 * @author E
 */
public class DAOAppareilsMySQL implements DAOAppareils {

    private static DAOAppareilsMySQL uniqueInstance = new DAOAppareilsMySQL();

    public static DAOAppareilsMySQL getInstance() {
        return uniqueInstance;
    }

    @Override
    public ArrayList<Appareil> selectAppareils() {
        ArrayList<Appareil> myList = new ArrayList<>();
        String req = "select IdentApp, DescrApp, IdentLoc, A.IdentCat,DenomCat,"
                + "A.IdentEtat, DenomEtat, DateArrivee from appareils  A, etats E, Categories C"
                + " where A.IdentEtat = E.IdentEtat and A.IdentCat = C.IdentCat"
                + " order by 1 ";
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (res.next()) {
                myList.add(new Appareil(res.getString(1), res.getString(2),res.getString(3),
                        new Categorie (res.getInt(4), res.getString(5)),
                        new Etat (res.getInt(6),res.getString(7)), res.getDate(8)));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.exit(-1);
        }
        return myList; 
    }
}
