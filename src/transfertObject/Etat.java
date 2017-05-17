/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfertObject;

/**
 *
 * @author E
 */
public class Etat {

    public Etat(int identEtat, String denomEtat) {
        this.identEtat = identEtat;
        this.denomEtat = denomEtat;
    }

    public int getIdentEtat() {
        return identEtat;
    }

    public String getDenomEtat() {
        return denomEtat;
    }

    public void setIdentEtat(int identEtat) {
        this.identEtat = identEtat;
    }

    public void setDenomEtat(String denomEtat) {
        this.denomEtat = denomEtat;
    }

    @Override
    public String toString() {
        return denomEtat;
    }

    private int identEtat;
    private String denomEtat;
}
