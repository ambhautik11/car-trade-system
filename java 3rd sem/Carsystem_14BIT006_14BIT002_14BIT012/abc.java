package abcmain;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;
//import java.net.MalformedURLException;


public class abc extends javax.swing.JApplet implements ActionListener {

    @Override
    public void init() {
       // bhautik ni comment. lol lol llol
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
            java.util.logging.Logger.getLogger(abc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        getContentPane().setBackground(Color.BLACK);
        this.setSize(550, 350);
        
        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(this::initComponents);
        } catch (InterruptedException | InvocationTargetException ex) {
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Buy = new javax.swing.JButton();
        Sell = new javax.swing.JButton();
        Register = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        Description = new javax.swing.JTextField();
        Buy_Car_Query = new javax.swing.JTextField();
        Sell_Car_Query = new javax.swing.JTextField();
        View = new javax.swing.JButton();
        View_Model_Text = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(550, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buy.setBackground(new java.awt.Color(255, 255, 255));
        Buy.setForeground(new java.awt.Color(0, 0, 255));
        Buy.setText("Buy Car");
        Buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyCars(evt);
            }
        });
        getContentPane().add(Buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        Sell.setBackground(new java.awt.Color(255, 255, 255));
        Sell.setForeground(new java.awt.Color(0, 0, 255));
        Sell.setText("Sell Car");
        Sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellCar(evt);
            }
        });
        getContentPane().add(Sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        Register.setBackground(new java.awt.Color(255, 255, 255));
        Register.setForeground(new java.awt.Color(0, 0, 255));
        Register.setText("Register");
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Registration(evt);
            }
        });
        getContentPane().add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        Title.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 255, 255));
        Title.setText("Welcome to KBH Cars");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        Description.setBackground(new java.awt.Color(0, 0, 0));
        Description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Description.setForeground(new java.awt.Color(153, 255, 0));
        Description.setText("Your One Stop Destination for Online Car Buying-Selling");
        Description.setBorder(null);
        getContentPane().add(Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        Buy_Car_Query.setBackground(new java.awt.Color(0, 0, 0));
        Buy_Car_Query.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Buy_Car_Query.setForeground(new java.awt.Color(255, 51, 102));
        Buy_Car_Query.setText("WANT YO BUY CAR? click below.");
        Buy_Car_Query.setBorder(null);
        getContentPane().add(Buy_Car_Query, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, -1));

        Sell_Car_Query.setBackground(new java.awt.Color(0, 0, 0));
        Sell_Car_Query.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sell_Car_Query.setForeground(new java.awt.Color(255, 102, 255));
        Sell_Car_Query.setText("WANT TO SELL CAR? click below.");
        Sell_Car_Query.setBorder(null);
        getContentPane().add(Sell_Car_Query, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 270, -1));

        View.setBackground(new java.awt.Color(255, 255, 255));
        View.setForeground(new java.awt.Color(0, 0, 204));
        View.setText("View Models");
        View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewModels(evt);
            }
        });
        getContentPane().add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        View_Model_Text.setBackground(new java.awt.Color(0, 0, 0));
        View_Model_Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        View_Model_Text.setForeground(new java.awt.Color(255, 0, 0));
        View_Model_Text.setText("Have a look at our wide range of cars -->");
        View_Model_Text.setBorder(null);
        getContentPane().add(View_Model_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 260, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BuyCars(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyCars
            // TODO add your handling code here:
            JFrame frame = new JFrame();
            BuyCars newBuyCars = new BuyCars();
            frame.getContentPane().add(newBuyCars);
            frame.setVisible(true);
            frame.setSize(420, 350);
            newBuyCars.init();
            newBuyCars.start();
        
    }//GEN-LAST:event_BuyCars

    private void SellCar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellCar
        // TODO add your handling code here:
            JFrame frame = new JFrame();
            Registration newEntry = new Registration();
            frame.getContentPane().add(newEntry);
            frame.setVisible(true);
            frame.setSize(450, 350);
            newEntry.init();
            newEntry.start();
    }//GEN-LAST:event_SellCar

    private void Registration(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Registration
        // TODO add your handling code here:
            JFrame frame = new JFrame();
            Registration newEntry = new Registration();
            frame.getContentPane().add(newEntry);
            frame.setVisible(true);
            frame.setSize(450, 350);
            newEntry.init();
            newEntry.start();
    }//GEN-LAST:event_Registration

    private void ViewModels(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewModels
        // TODO add your handling code here:
        
        //KAUMIL - I TRIED CALLING HTML PAGE FROM BUTTON ACTION BUT NO RESULTS
        //KAUMIL - IF YOU GOT NEWER METHODS, TRY AND IMPLEMENT IT
        
        /*try {
            URL url = new URL("C:\\Users\\Gryffin\\Documents\\NetBeansProjects\\abc\\src\\abcmain\\ModelDisplay.html");
            getAppletContext().showDocument(url,"_blank");
        } catch (MalformedURLException ex) {
            showStatus("Not Found");
        }
        */
        
    }//GEN-LAST:event_ViewModels


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buy;
    private javax.swing.JTextField Buy_Car_Query;
    private javax.swing.JTextField Description;
    private javax.swing.JButton Register;
    private javax.swing.JButton Sell;
    private javax.swing.JTextField Sell_Car_Query;
    private javax.swing.JLabel Title;
    private javax.swing.JButton View;
    private javax.swing.JTextField View_Model_Text;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
