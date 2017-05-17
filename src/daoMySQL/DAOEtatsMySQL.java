/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.DAOEtats;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import transfertObject.Etat;


/**
 *
 * @author E
 */
public class DAOEtatsMySQL implements DAOEtats {
    private static DAOEtatsMySQL uniqueInstance = new DAOEtatsMySQL();

    public static DAOEtatsMySQL getInstance() {
        return uniqueInstance;
    }

    @Override
    public ArrayList<Etat> selectEtat() {
        ArrayList<Etat> myList = new ArrayList<>();
        String req = "SELECT * FROM etats";
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (res.next()) {
                myList.add(new Etat(res.getInt("identEtat"),res.getString("DenomEtat")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.exit(-1);
        }
        return myList;
    }
}
