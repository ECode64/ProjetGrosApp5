/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author E
 */
public class Appareil {

    public Appareil() {
    }

    public Appareil(String identApp, String descrApp, String identLoc, Categorie caAppt, Etat etatApp, Date dateArrivee) {
        this.identApp = identApp;
        this.descrApp = descrApp;
        this.identLoc = identLoc;
        this.catApp = caAppt;
        this.etatApp = etatApp;
        this.dateArrivee = dateArrivee;
    }

    public String getIdentApp() {
        return identApp;
    }

    public String getDescrApp() {
        return descrApp;
    }

    public String getIdentLoc() {
        return identLoc;
    }

    public void setCatApp(Categorie catApp) {
        this.catApp = catApp;
    }

    public void setEtatApp(Etat etatApp) {
        this.etatApp = etatApp;
    }

    public Categorie getCatApp() {
        return catApp;
    }

    public Etat getEtatApp() {
        return etatApp;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setIdentApp(String identApp) {
        this.identApp = identApp;
    }

    public void setDescrApp(String descrApp) {
        this.descrApp = descrApp;
    }

    public void setIdentLoc(String identLoc) {
        this.identLoc = identLoc;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public String getDateArrivBE() {
        String tmp;
        if (this.dateArrivee == null) {
            tmp = "";
        } else {
            SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
            tmp = sm.format(dateArrivee);
        }
        return tmp;
    }

    @Override
    public String toString() {
        return identApp + " " + descrApp + " " + identLoc + " " + catApp + " " + etatApp + " " + getDateArrivBE();
    }

    private String identApp;
    private String descrApp;
    private String identLoc;
    private Categorie catApp;
    private Etat etatApp;

    private Date dateArrivee;
}
