/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import dto.Student;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author BIM10-SAGER
 */
public class StudentTableModel extends AbstractTableModel {
    private ArrayList<Student> data = new ArrayList<>();
    String cols[] = new String[]{"Mã SV", "Họ", "Tên", "Năm sinh", "Giới tính"};
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return data.get(rowIndex).getMasv();
            case 1: return data.get(rowIndex).getHo();
            case 2: return data.get(rowIndex).getTen();
            case 3: return data.get(rowIndex).getNamSinh();
            case 4: return data.get(rowIndex).getGioiTinh();
            default: return null;
        }
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int i) {
        return cols[i]; //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Student> getData() {
        return data;
    }

    public void setData(ArrayList<Student> data) {
        this.data = data;
        fireTableDataChanged();
    }
}
