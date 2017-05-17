/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import transfertObject.Etat;

/**
 *
 * @author E
 */
public class TableModelEtats extends AbstractTableModel {

    public TableModelEtats(ArrayList<Etat> myList) {
        this.myList = myList;
    }

    @Override
    public int getRowCount() {
        return myList.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Etat myEtat = myList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return myEtat.getIdentEtat();
            case 1:
                return myEtat.getDenomEtat();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }
    private ArrayList<Etat> myList;
    String[] columnName = {"Ident Etat", "Denom Etat"};
}
