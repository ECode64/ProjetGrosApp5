/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import dao.DAOAppareils;
import dao.DAOCategories;
import daoMySQL.DAOAppareilsMySQL;
import daoMySQL.DAOCategoriesMySQL;
import daoMySQL.DAOEtatsMySQL;
import daoMySQL.DAOPannesMySQL;

/**
 *
 * @author E
 */
public class Factory {

    public static DAOAppareils getDAOAppareils() {
        return DAOAppareilsMySQL.getInstance();
    }

    public static DAOCategories getDAOCategories() {
        return DAOCategoriesMySQL.getInstance();
    }

    public static DAOPannesMySQL getDAOPannes() {
        return DAOPannesMySQL.getInstance();
    }

    public static DAOEtatsMySQL getDAOEtats() {
        return DAOEtatsMySQL.getInstance();
    }
}
