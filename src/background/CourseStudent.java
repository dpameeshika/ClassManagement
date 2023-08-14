
package background;

import codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class CourseStudent extends javax.swing.JFrame {

   Connection con = null;
    PreparedStatement pst = null;
    ResultSet rset = null;
    

    public CourseStudent() {
        initComponents();
        con = DBconnect.connect();
        tabledata();
    }
    
    
    public void tabledata()
   {
       
       try 
       {
           String sql = "SELECT StNo,Name,Address,Gender,CourseCode,Tel,email,NIC FROM coursestudent" ;
           pst = con.prepareStatement(sql);
           rset = pst.executeQuery();
           table4.setModel(DbUtils.resultSetToTableModel(rset));
       }
       
       
       catch (Exception e) 
       {
           JOptionPane.showMessageDialog(null,e);
       }     
   
   }
    
    public void dataload()
    {
     int row = table4.getSelectedRow();
     String Sno = table4.getValueAt(row, 0).toString();
     String Name = table4.getValueAt(row, 1).toString();
     String Address = table4.getValueAt(row, 2).toString();
     String course = table4.getValueAt(row, 3).toString();
     String Grade = table4.getValueAt(row, 4).toString();
     String Tel = table4.getValueAt(row, 5).toString();
     String email = table4.getValueAt(row, 6).toString();
     String NIC = table4.getValueAt(row, 7).toString();
     
     stnobox.setText(Sno);
     namebox.setText(Name);
     addressbox.setText(Address);
     genderbox.setSelectedItem(course);
     coursebox.setSelectedItem(Grade);
     telphonebox.setText(Tel);
     emailbox1.setText(email);
     NICbox.setText(NIC);
     
    }
    
    
    public void search()
    {
        String Search = searchbox.getText();
        
        
        try 
        {
            String sql = "SELECT * FROM coursestudent WHERE Name LIKE '%"+Search+"%' OR StNo LIKE '%"+Search+"%' OR Address LIKE '%"+Search+"%' OR CourseCode LIKE '"+Search+"'" ;
            pst = con.prepareStatement(sql);
            rset = pst.executeQuery(sql);
            table4.setModel(DbUtils.resultSetToTableModel(rset));
            
        } 
        
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    
    
    
    public void update()
    {
    
        String Sno = stnobox.getText();
        String name = namebox.getText();
        String address = addressbox.getText();
        String gender = genderbox.getSelectedItem().toString();
        String course = coursebox.getSelectedItem().toString();
        String tel = telphonebox.getText();
        String email = emailbox1.getText();
        String nic = NICbox.getText(); 
        
        
        try 
        {
            String sql = "UPDATE coursestudent SET Name='"+name+"',Address='"+address+"', Gender='"+gender+"', CourseCode='"+course+"',Tel='"+tel+"',email='"+email+"', NIC='"+nic+"' WHERE Sno='"+Sno+"'";
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
        stnobox.setText("");
        namebox.setText("");
        addressbox.setText("");
        genderbox.setSelectedIndex(0);
        coursebox.setSelectedIndex(0);
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
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addressbox = new javax.swing.JTextField();
        stnobox = new javax.swing.JTextField();
        genderbox = new javax.swing.JComboBox();
        coursebox = new javax.swing.JComboBox();
        NICbox = new javax.swing.JTextField();
        telphonebox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailbox1 = new javax.swing.JTextField();
        namebox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        insertbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        snobox = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        mainmenubtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

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

        jPanel5.setBackground(new java.awt.Color(0, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student No");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Address");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Course");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tel No");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("NIC");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Gender");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        addressbox.setBackground(new java.awt.Color(204, 204, 255));
        addressbox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addressbox.setToolTipText("Enter Addres");
        addressbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel5.add(addressbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 280, 32));

        stnobox.setBackground(new java.awt.Color(204, 204, 255));
        stnobox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        stnobox.setToolTipText("Enter Your Name");
        stnobox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        stnobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stnoboxActionPerformed(evt);
            }
        });
        jPanel5.add(stnobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 280, 32));

        genderbox.setBackground(new java.awt.Color(204, 204, 255));
        genderbox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        genderbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        genderbox.setToolTipText("Select Your Gender");
        genderbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel5.add(genderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 280, 34));

        coursebox.setBackground(new java.awt.Color(204, 204, 255));
        coursebox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        coursebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..............", "C01", "C02", "C03", "C04", "C05", "C06", " " }));
        coursebox.setToolTipText("Select Your Grade");
        coursebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel5.add(coursebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 280, 34));

        NICbox.setBackground(new java.awt.Color(204, 204, 255));
        NICbox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        NICbox.setToolTipText("Enter Your Email");
        NICbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel5.add(NICbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 280, 34));

        telphonebox.setBackground(new java.awt.Color(204, 204, 255));
        telphonebox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        telphonebox.setToolTipText("Enter Telephone number");
        telphonebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel5.add(telphonebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 280, 38));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("email");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        emailbox1.setBackground(new java.awt.Color(204, 204, 255));
        emailbox1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        emailbox1.setToolTipText("Enter Your Email");
        emailbox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        jPanel5.add(emailbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 280, 34));

        namebox.setBackground(new java.awt.Color(204, 204, 255));
        namebox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        namebox.setToolTipText("Enter Your Name");
        namebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        namebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameboxActionPerformed(evt);
            }
        });
        jPanel5.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 280, 32));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Name");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 82, 30));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 730));

        table4.setBackground(new java.awt.Color(153, 255, 255));
        table4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        table4.setModel(new javax.swing.table.DefaultTableModel(
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
        table4.setRowHeight(25);
        table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table4MouseClicked(evt);
            }
        });
        table4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table4KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table4);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 670, 640));

        mainmenubtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mainmenubtn.setText("HOME");
        mainmenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenubtnActionPerformed(evt);
            }
        });
        jPanel1.add(mainmenubtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 670, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        search();
    }//GEN-LAST:event_searchboxKeyReleased

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtnActionPerformed

        String sno;
        String name;
        String address;
        String gender;
        String course;
        String tel;
        String email;
        String nic;

        sno = stnobox.getText();
        name = namebox.getText();
        address = addressbox.getText();
        gender = genderbox.getSelectedItem().toString();
        course = coursebox.getSelectedItem().toString();
        tel = telphonebox.getText();
        email = emailbox1.getText();
        nic = NICbox.getText();

        try
        {
            String sql = "INSERT INTO coursestudent(StNo,Name,Address,Gender,CourseCode,Tel,email,NIC) VALUES ('"+sno+"','"+name+"','"+address+"','"+gender+"','"+course+"','"+tel+"','"+email+"','"+nic+"')";
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

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        int check = JOptionPane.showConfirmDialog(null," do you want to delete ! ");

        if(check==0)
        {
            String Sno = stnobox.getText();
            try
            {
                String sql = "DELETE FROM coursestudent WHERE StNo='"+Sno+"'";
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

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        update();
        tabledata();
    }//GEN-LAST:event_updatebtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        clear();
    }//GEN-LAST:event_clearbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void table4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table4KeyReleased
         dataload();
    }//GEN-LAST:event_table4KeyReleased

    private void table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table4MouseClicked
        dataload();
    }//GEN-LAST:event_table4MouseClicked

    private void mainmenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenubtnActionPerformed
        setVisible(false);
        Homepage load = new Homepage();
        load.setVisible(true);
    }//GEN-LAST:event_mainmenubtnActionPerformed

    private void stnoboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stnoboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stnoboxActionPerformed

    private void nameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameboxActionPerformed

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NICbox;
    private javax.swing.JTextField addressbox;
    private javax.swing.JButton clearbtn;
    private javax.swing.JComboBox coursebox;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField emailbox1;
    private javax.swing.JButton exitbtn;
    private javax.swing.JComboBox genderbox;
    private javax.swing.JButton insertbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainmenubtn;
    private javax.swing.JTextField namebox;
    private javax.swing.JTextField searchbox;
    private javax.swing.JLabel snobox;
    private javax.swing.JTextField stnobox;
    private javax.swing.JTable table4;
    private javax.swing.JTextField telphonebox;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
