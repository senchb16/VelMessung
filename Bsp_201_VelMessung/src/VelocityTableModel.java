
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph
 */
public class VelocityTableModel extends AbstractTableModel {
    
    private static final String[] COLNAMES = {"Datum","Uhrzeit","Kennzeichen","Gemessen","Erlaubt","Übertretung"};
    private ArrayList<Measurement> messungen = new ArrayList<>();
   
    public String getColumnNames(int column){
        return COLNAMES[column];
    }
    @Override
    public int getRowCount() {
        return messungen.size();
    }

    @Override
    public int getColumnCount() {
        return COLNAMES.length;
    }
    
    @Override
    public String getColumnName(int column){
        return COLNAMES[column];
    }

    @Override
    public Object getValueAt(int rowindex, int columnindex) {
       Measurement m = messungen.get(rowindex);
       switch(columnindex){
           case 0: return m.getDate().toString();
           case 1: return m.getTime().toString();
           case 2: return m.getKennzeichen();
           case 3: return m.getVgemessen();
           case 4: return m.getVerlaubt();
           case 5: return m.getVgemessen()<m.getVerlaubt() ? "-" :m.getVgemessen()-m.getVerlaubt();
           default: return "???";
       }
    }

    public void add(Measurement me) {
        messungen.add(me);
        fireTableRowsInserted(messungen.size()-1, messungen.size()-1);
    }

    public void delete(int i) {
       this.messungen.remove(messungen.get(i));
        fireTableRowsDeleted(messungen.size()-1, messungen.size()-1);
    }

    public double getAvg() {
       int sum = 0;
       int count=0;
        for (Measurement m: messungen) {
            sum += m.getVgemessen()<m.getVerlaubt()? 0:m.getVgemessen()-m.getVerlaubt();
            count+=m.getVgemessen()<m.getVerlaubt()? 0:1;
        }
        
     double avg = sum / count;
     
     return avg;
    }
    
}
