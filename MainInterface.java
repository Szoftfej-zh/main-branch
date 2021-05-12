package rwcthv;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class MainInterface extends javax.swing.JFrame {

    ArrayList<Data> array;
    
    public MainInterface() {
        initComponents();
    }
    
    public MainInterface(ArrayList<Data> par) throws IOException {
        initComponents();
        
        array = par;
        setSize(1000,661);
        setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\Felhasználó\\Desktop\\Egyetem\\Szoftfej\\zh\\map.png")))));
                
        ImageIcon icon = new ImageIcon(ImageIO.read(new File("C:\\Users\\Felhasználó\\Desktop\\Egyetem\\Szoftfej\\zh\\arrow.png")));
        JLabel label = new JLabel();
        label.setIcon(icon);        
        
        double tempX, tempY;
        
        double widthMin = 16.175247, 
               widthMax = 22.849964, 
               heigthMin = 45.7276914859, 
               heigthMax = 48.5879048965;
        
        ArrayList<JPanel> arrowArray = new ArrayList<JPanel>();
        ArrayList<JLabel> labelArray = new ArrayList<JLabel>();
        ArrayList<ImageIcon> iconArray = new ArrayList<ImageIcon>();
        ArrayList<JTextField> textArray = new ArrayList<JTextField>();
        
        for (int i = 0; i < array.size(); i++) {
            textArray.add(new JTextField(array.get(i).getCity()));
        }
        
        for (int i = 0; i < array.size(); i++) {
            //Az elérési útvonal változhat!
            iconArray.add(new ImageIcon(ImageIO.read(new File("C:\\Users\\Felhasználó\\Desktop\\Egyetem\\Szoftfej\\zh\\arrow.png"))));
        }
        
        for (int i = 0; i < array.size(); i++) {
            labelArray.add(new JLabel());
            label.setIcon(iconArray.get(i));
        }
        
        for (int i = 0; i < array.size(); i++) {
            arrowArray.add(new JPanel());
            arrowArray.get(i).setSize(24,43);
            arrowArray.get(i).add(labelArray.get(i)); 
        }
        
        for (int i = 0; i < array.size(); i++) {                       
            tempY = array.get(i).getY();
            tempY = widthMax - tempY;
            tempY = (tempY / (widthMax - widthMin)) * 1000 -110;
            
            tempX = array.get(i).getX();
            tempX = heigthMax - tempX;
            tempX = ((tempX / (heigthMax - heigthMin)) * 661) - 43;
            
            arrowArray.get(i).setLocation((int)tempY, (int)tempX);
            textArray.get(i).setLocation((int)tempY, (int)tempX + 40);
            
            getContentPane().add(arrowArray.get(i));
            getContentPane().add(textArray.get(i));            
        }    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
