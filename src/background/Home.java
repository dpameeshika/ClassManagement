package background;


import background.CourseStudent;
import background.Registration;
import background.Timetable;
import background.course;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

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
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 390, 200));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 590));

        coursebtn.setBackground(new java.awt.Color(0, 255, 255));
        coursebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        coursebtn.setText("Courses");
        coursebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursebtnActionPerformed(evt);
            }
        });
        jPanel1.add(coursebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 190, 40));

        timetablebtn.setBackground(new java.awt.Color(51, 255, 255));
        timetablebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timetablebtn.setText("Time Table");
        timetablebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        timetablebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timetablebtnActionPerformed(evt);
            }
        });
        jPanel1.add(timetablebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 190, 40));

        ictstudentbtn.setBackground(new java.awt.Color(0, 255, 255));
        ictstudentbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ictstudentbtn.setText("ICT Student");
        ictstudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ictstudentbtnActionPerformed(evt);
            }
        });
        jPanel1.add(ictstudentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 190, 40));

        coursestudentbtn.setBackground(new java.awt.Color(0, 255, 255));
        coursestudentbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        coursestudentbtn.setText("Course Student");
        coursestudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursestudentbtnActionPerformed(evt);
            }
        });
        jPanel1.add(coursestudentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 190, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 230, 170));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentimg3.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 210, 210));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courseimg.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 220, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coursebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursebtnActionPerformed
        setVisible(false);
        course view = new course();
        view.setVisible(true);
        
    }//GEN-LAST:event_coursebtnActionPerformed

    private void timetablebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timetablebtnActionPerformed
       setVisible(false);
        Timetable view = new Timetable();
        view.setVisible(true);
    }//GEN-LAST:event_timetablebtnActionPerformed

    private void ictstudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ictstudentbtnActionPerformed
         setVisible(false);
        Registration view = new Registration();
        view.setVisible(true);
    }//GEN-LAST:event_ictstudentbtnActionPerformed

    private void coursestudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursestudentbtnActionPerformed
         setVisible(false);
        CourseStudent view = new CourseStudent();
        view.setVisible(true);
    }//GEN-LAST:event_coursestudentbtnActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coursebtn;
    private javax.swing.JButton coursestudentbtn;
    private javax.swing.JButton ictstudentbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton timetablebtn;
    // End of variables declaration//GEN-END:variables
}
