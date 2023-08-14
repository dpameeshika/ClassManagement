
package background;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        submitbtn = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 120, 40));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Wide Latin", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ITedu");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 340, 80));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Balangoda");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/book.jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 390, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 610));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USERNAME");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        submitbtn.setBackground(new java.awt.Color(255, 255, 51));
        submitbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitbtn.setText("SUBMIT");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, -1));

        username.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 260, 30));

        password.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 252, 260, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 610));

        setSize(new java.awt.Dimension(893, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
         String uname; //ITedu
         String pwrd; //123
         
         uname=username.getText();
         pwrd = password.getText();
         
         if(uname.equals("ITedu") && pwrd.equals("123"))
         {
             Homepage log = new Homepage();
             log.setVisible(true);
             this.dispose();             
         }    
         else
         {
             JOptionPane.showMessageDialog(null,"incorrect user name or password ");   
         }  
    }//GEN-LAST:event_submitbtnActionPerformed

    public static void main(String args[]) {      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
