
package background;

import codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Registration extends javax.swing.JFrame {
    
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rset = null;
    

    public Registration() {
        initComponents();
        con = DBconnect.connect();
        tabledata();
    }

   public void tabledata()
   {
       
       try 
       {
           String sql = "SELECT Sno,Name,Address,Gender,Grade,TP,email,NIC FROM students" ;
           pst = con.prepareStatement(sql);
           rset = pst.executeQuery();
           table1.setModel(DbUtils.resultSetToTableModel(rset));
       }
       
       
       catch (Exception e) 
       {
           JOptionPane.showMessageDialog(null,e);
       }
       
   
   }
    
    public void dataload()
    {
     int row = table1.getSelectedRow();
     String Sno = table1.getValueAt(row, 0).toString();
     String Name = table1.getValueAt(row, 1).toString();
     String Address = table1.getValueAt(row, 2).toString();
     String Gender = table1.getValueAt(row, 3).toString();
     String Grade = table1.getValueAt(row, 4).toString();
     String Tel = table1.getValueAt(row, 5).toString();
     String email = table1.getValueAt(row, 6).toString();
     String NIC = table1.getValueAt(row, 7).toString();
     
     snobox.setText(Sno);
     namebox.setText(Name);
     addressbox.setText(Address);
     genderbox.setSelectedItem(Gender);
     gradebox.setSelectedItem(Grade);
     telphonebox.setText(Tel);
     emailbox1.setText(email);
     NICbox.setText(NIC);
     
    }
    
    
    public void search()
    {
        String Search = searchbox.getText();
        
        
        try 
        {
            String sql = "SELECT * FROM students WHERE Name LIKE '%"+Search+"%' OR Sno LIKE '%"+Search+"%' OR Address LIKE '%"+Search+"%' OR Grade LIKE '"+Search+"'" ;
            pst = con.prepareStatement(sql);
            rset = pst.executeQuery(sql);
            table1.setModel(DbUtils.resultSetToTableModel(rset));
            
        } 
        
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    public void update()
    {
    
        String Sno = snobox.getText();
        String name = namebox.getText();
        String address = addressbox.getText();
        String gender = genderbox.getSelectedItem().toString();
        String grade = gradebox.getSelectedItem().toString();
        String tel = telphonebox.getText();
        String email = emailbox1.getText();
        String nic = NICbox.getText(); 
        
        
        try 
        {
            String sql = "UPDATE students SET Name='"+name+"',Address='"+address+"', Gender='"+gender+"', Grade='"+grade+"',TP='"+tel+"',email='"+email+"', NIC='"+nic+"' WHERE Sno='"+Sno+"'";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
        } catch (Exception e)
        {
             JOptionPane.showMessageDialog(null, "cant Updated");
        }
    
    }
    
    public void clear()
    {
        searchbox.setText("");
        snobox.setText("StudentNo");
        namebox.setText("");
        addressbox.setText("");
        genderbox.setSelectedIndex(0);
        gradebox.setSelectedIndex(0);
        telphonebox.setText("");
        emailbox1.setText("");
        NICbox.setText("");
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        searchbox = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addressbox = new javax.swing.JTextField();
        namebox = new javax.swing.JTextField();
        genderbox = new javax.swing.JComboBox();
        gradebox = new javax.swing.JComboBox();
        NICbox = new javax.swing.JTextField();
        telphonebox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailbox1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        insertbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        snobox = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        mainmenubtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });
        jPanel3.add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 355, 35));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 430, 80));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Name");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 82, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Address");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Grade");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 176, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tel No");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 225, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("NIC");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Gender");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 125, -1, -1));

        addressbox.setBackground(new java.awt.Color(204, 204, 255));
        addressbox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addressbox.setToolTipText("Enter Addres");
        addressbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel4.add(addressbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 71, 280, 32));

        namebox.setBackground(new java.awt.Color(204, 204, 255));
        namebox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        namebox.setToolTipText("Enter Your Name");
        namebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel4.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 21, 280, 32));

        genderbox.setBackground(new java.awt.Color(204, 204, 255));
        genderbox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        genderbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        genderbox.setToolTipText("Select Your Gender");
        genderbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel4.add(genderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 121, 280, 34));

        gradebox.setBackground(new java.awt.Color(204, 204, 255));
        gradebox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        gradebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..............", "Grade 10", "Grade 11", "Grade 12", "Grade 13", "O/L Revision", "A/L Revision" }));
        gradebox.setToolTipText("Select Your Grade");
        gradebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel4.add(gradebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 172, 280, 34));

        NICbox.setBackground(new java.awt.Color(204, 204, 255));
        NICbox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        NICbox.setToolTipText("Enter Your Email");
        NICbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel4.add(NICbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 310, 280, 34));

        telphonebox.setBackground(new java.awt.Color(204, 204, 255));
        telphonebox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        telphonebox.setToolTipText("Enter Telephone number");
        telphonebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel4.add(telphonebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 214, 280, 38));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("email");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 271, -1, -1));

        emailbox1.setBackground(new java.awt.Color(204, 204, 255));
        emailbox1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        emailbox1.setToolTipText("Enter Your Email");
        emailbox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel4.add(emailbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 259, 280, 34));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 430, 360));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        insertbtn.setBackground(new java.awt.Color(153, 153, 255));
        insertbtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        insertbtn.setText("INSERT");
        insertbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(255, 102, 102));
        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(0, 153, 51));
        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(51, 255, 255));
        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        clearbtn.setText("CLEAR");
        clearbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 255, 102));
        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 430, 110));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        snobox.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        snobox.setForeground(new java.awt.Color(51, 51, 51));
        snobox.setText("StudentNo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("StudentNo");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(snobox)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(snobox))
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 430, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 660));

        jScrollPane1.setBackground(new java.awt.Color(153, 255, 51));

        table1.setBackground(new java.awt.Color(204, 204, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.setRowHeight(25);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        table1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 710, 590));

        mainmenubtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mainmenubtn.setText("HOME");
        mainmenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenubtnActionPerformed(evt);
            }
        });
        jPanel1.add(mainmenubtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 610, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtnActionPerformed
        
        String name;
        String address;
        String gender;
        String grade;
        int tel;
        String email;
        String nic;
        
        name = namebox.getText();
        address = addressbox.getText();
        gender = genderbox.getSelectedItem().toString();
        grade = gradebox.getSelectedItem().toString();
        tel = Integer.parseInt(telphonebox.getText());
        email = emailbox1.getText();
        nic = NICbox.getText();
        
        
        try 
        {
            String sql = "INSERT INTO students(Name,Address,Gender,Grade,TP,email,NIC) VALUES ('"+name+"','"+address+"','"+gender+"','"+grade+"','"+tel+"','"+email+"','"+nic+"')";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"entered data inseted ");
        } 
        
        
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,e);
            
        }
        tabledata();
        
    }//GEN-LAST:event_insertbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
       clear();
    }//GEN-LAST:event_clearbtnActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        dataload();
    }//GEN-LAST:event_table1MouseClicked

    private void table1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table1KeyReleased
       dataload();
    }//GEN-LAST:event_table1KeyReleased

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
      search();
    }//GEN-LAST:event_searchboxKeyReleased

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
     update();
     tabledata();
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
       int check = JOptionPane.showConfirmDialog(null," do you want to delete ! ");
       
       if(check==0)
       {
           String sno = snobox.getText();
           try 
           {
              String sql = "DELETE  FROM students WHERE Sno='"+sno+"'";
              pst = con.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null, "deleted");
               
           } 
           
           
           catch (Exception e) {
               
               JOptionPane.showMessageDialog(null, "cant delete");
           }
       }
       tabledata();
       clear();
    }//GEN-LAST:event_deletebtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void mainmenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenubtnActionPerformed
      setVisible(false);
      Homepage load = new Homepage();
      load.setVisible(true);
    }//GEN-LAST:event_mainmenubtnActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NICbox;
    private javax.swing.JTextField addressbox;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField emailbox1;
    private javax.swing.JButton exitbtn;
    private javax.swing.JComboBox genderbox;
    private javax.swing.JComboBox gradebox;
    private javax.swing.JButton insertbtn;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainmenubtn;
    private javax.swing.JTextField namebox;
    private javax.swing.JTextField searchbox;
    private javax.swing.JLabel snobox;
    private javax.swing.JTable table1;
    private javax.swing.JTextField telphonebox;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
