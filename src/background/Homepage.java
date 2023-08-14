
package background;
public class Homepage extends javax.swing.JFrame {
    public Homepage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        coursebtn = new javax.swing.JButton();
        timetablebtn = new javax.swing.JButton();
        ictstudentbtn = new javax.swing.JButton();
        coursestudentbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Wide Latin", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ITedu");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 340, 80));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Balangoda");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/book.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 6));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 390, 180));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 660));

        coursebtn.setBackground(new java.awt.Color(0, 255, 255));
        coursebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        coursebtn.setText("Courses");
        coursebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        coursebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursebtnActionPerformed(evt);
            }
        });
        jPanel1.add(coursebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, 190, 40));

        timetablebtn.setBackground(new java.awt.Color(51, 255, 255));
        timetablebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timetablebtn.setText("Time Table");
        timetablebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        timetablebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timetablebtnActionPerformed(evt);
            }
        });
        jPanel1.add(timetablebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 190, 40));

        ictstudentbtn.setBackground(new java.awt.Color(0, 255, 255));
        ictstudentbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ictstudentbtn.setText("ICT Student");
        ictstudentbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        ictstudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ictstudentbtnActionPerformed(evt);
            }
        });
        jPanel1.add(ictstudentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 190, 40));

        coursestudentbtn.setBackground(new java.awt.Color(0, 255, 255));
        coursestudentbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        coursestudentbtn.setText("Course Student");
        coursestudentbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        coursestudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursestudentbtnActionPerformed(evt);
            }
        });
        jPanel1.add(coursestudentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 190, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/studentimg3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/download.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 200, 180));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/images.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/courseimg.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 220, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coursestudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursestudentbtnActionPerformed
        setVisible(false);
        CourseStudent view = new CourseStudent();
        view.setVisible(true);
    }//GEN-LAST:event_coursestudentbtnActionPerformed

    private void ictstudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ictstudentbtnActionPerformed
        setVisible(false);
        Registration view = new Registration();
        view.setVisible(true);
    }//GEN-LAST:event_ictstudentbtnActionPerformed

    private void timetablebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timetablebtnActionPerformed
        setVisible(false);
        Timetable view = new Timetable();
        view.setVisible(true);
    }//GEN-LAST:event_timetablebtnActionPerformed

    private void coursebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursebtnActionPerformed
        setVisible(false);
        course view = new course();
        view.setVisible(true);
    }//GEN-LAST:event_coursebtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coursebtn;
    private javax.swing.JButton coursestudentbtn;
    private javax.swing.JButton ictstudentbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton timetablebtn;
    // End of variables declaration//GEN-END:variables
}
