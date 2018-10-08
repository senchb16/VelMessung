
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class CellRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel(value.toString());
        label.setOpaque(true);
        if(column == 5){
            int übertretung = (Integer)value;
            if(übertretung>=30){
            label.setBackground(Color.red);
           }
           else if(übertretung>=20){
            label.setBackground(Color.orange);
           }
           else if(übertretung>=10){
            label.setBackground(Color.yellow);
           }
           else if(übertretung<10){
            label.setBackground(Color.blue);
           }
           else{
            label.setBackground(Color.green);
           }
     
           
            
           }
           if(isSelected){
            label.setBackground(Color.lightGray);
           }
         return label;
       
       
//        switch(column){
//            case 0: label.setText(m.getDate().toString());break;
//            case 1: label.setText(m.getTime().toString());break;
//            case 2: label.setText(m.getKennzeichen());break;
//            case 3: label.setText(""+m.getVgemessen());break;
//            case 4: label.setText(""+m.getVerlaubt());break;
//            case 5: label.setText(""+(m.getVgemessen()-m.getVerlaubt()));break;
//            
//        }
//        label.setOpaque(true);
//       
//        
//        if(m.getVgemessen()-m.getVerlaubt()>=30){
//            label.setBackground(Color.red.brighter().brighter());
//        }
//        else if(m.getVgemessen()-m.getVerlaubt()>=20){
//            label.setBackground(Color.orange.brighter());
//        }
//        else if(m.getVgemessen()-m.getVerlaubt()>=10){
//            label.setBackground(Color.yellow.brighter());
//        }
//        else if(m.getVgemessen()-m.getVerlaubt()<10){
//            label.setBackground(Color.blue.brighter());
//        }
//        else{
//            label.setBackground(Color.green.brighter());
//        }
//     
//        if(isSelected){
//            label.setBackground(Color.lightGray);
//        }
        
        
        
       
        
       
    }
    
}
