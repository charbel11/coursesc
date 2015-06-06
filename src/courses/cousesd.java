/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package courses;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JFrame;

public class cousesd extends javax.swing.JDialog {

  
    private Connection con;
    private int crs_id;
    
    public cousesd(java.awt.Frame parent, boolean modal, Connection con, int crs_id) {
        super(parent, modal);
        initComponents();
        this.setTitle("cousesd");
        this.setLocationRelativeTo(this);
        this.con = con;
        this.crs_id = crs_id;
        populate();
    }
    private void populate() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs
                    = stmt.executeQuery("Select * "
                            + "From tbl_courses Where crs_id =" + crs_id);
            if (rs.next()) {
                code.setText(rs.getString("crs_code"));
                name.setText(rs.getString("crs_name"));
                descrip.setText(rs.getString("crs_description"));
                major.setSelectedItem(rs.getString("crs_type"));
                nbofc.setSelectedItem(rs.getString("crs_nb_credits"));
                if(rs.getString("crs_lab").equals("Yes")){
                    chlab.setSelected(true);
                }else{
                    chlab.setSelected(false);
                }
                
               
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coursesPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("coursesPU").createEntityManager();
        tblCoursesQuery = java.beans.Beans.isDesignTime() ? null : coursesPUEntityManager.createQuery("SELECT t FROM TblCourses t");
        tblCoursesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tblCoursesQuery.getResultList();
        coursecode = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        coursename = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        description = new javax.swing.JLabel();
        descrip = new javax.swing.JTextField();
        type = new javax.swing.JLabel();
        major = new javax.swing.JComboBox();
        nbofcredits = new javax.swing.JLabel();
        nbofc = new javax.swing.JComboBox();
        chlab = new javax.swing.JCheckBox();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        coursecode.setText("Course Code:");

        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeKeyTyped(evt);
            }
        });

        coursename.setText("Course Name:");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        description.setText("Description:");

        descrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripActionPerformed(evt);
            }
        });
        descrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripKeyTyped(evt);
            }
        });

        type.setText("Type:");

        major.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Major", "Elective" }));

        nbofcredits.setText("Number Of Credits:");

        nbofc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        nbofc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbofcActionPerformed(evt);
            }
        });

        chlab.setText("Lab");
        chlab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chlabActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chlab)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coursecode)
                            .addComponent(coursename))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(description)
                            .addComponent(type))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descrip, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nbofcredits)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nbofc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coursecode)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coursename)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(description)
                    .addComponent(descrip, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type)
                    .addComponent(major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nbofcredits)
                    .addComponent(nbofc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chlab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(save)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
             
    }//GEN-LAST:event_codeActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:                
    }//GEN-LAST:event_nameActionPerformed

    private void descripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        if (code.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Enter A Course Code", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else if (name.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Enter A Course Name", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            String Code = code.getText();
            String Name = name.getText();
            String Description = descrip.getText();
            String Type= major.getSelectedItem().toString();
            int NumberOfCredit= Integer.parseInt(nbofc.getSelectedItem().toString());
            String lab;
            if (!chlab.isSelected()) {
                lab = "No";
            } else {
                lab = "Yes";
            }
            
            try {
                PreparedStatement pstmt;
                if(crs_id==0){
                       pstmt = con.prepareStatement("Insert Into "
                                + "tbl_courses (crs_code,"
                                + "crs_name, crs_description, "
                                + "crs_type, crs_nb_credits, "
                                + "crs_lab) "
                                + "Values ( '" + code + "', "
                                + "'" + name + "', '" + description+ "', '"
                                + type + "', " + nbofcredits + ", '"
                                + chlab + "')");
                }else{
                    pstmt = con.prepareStatement("Update tbl_courses "
                            + "Set crs_code = '" + code + "', "
                            + "crs_name = '" + name + "', "
                            + "crs_description = '" + description + "', "
                            + "crs_type = '" + type + "', "
                            + "crs_nb_credits= " + nbofcredits + ", "
                            + "crs_lab = '" + chlab + "'" 
                            + "Where crs_id = " + crs_id);
                }
                pstmt.execute();
                this.dispose();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void codeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyTyped
        // TODO add your handling code here:
         if ((!Character.isDigit(evt.getKeyChar())|| code.getText().length() > 5)
             &&(Character.isDigit(evt.getKeyChar())|| code.getText().length() > 5)) {
            evt.consume();
         }
    }//GEN-LAST:event_codeKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        // TODO add your handling code here:
        if ((!Character.isDigit(evt.getKeyChar())|| name.getText().length() > 39)
            && (Character.isDigit(evt.getKeyChar())|| name.getText().length() > 39)  ) {
            evt.consume();
        }
    }//GEN-LAST:event_nameKeyTyped

    private void descripKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripKeyTyped
        // TODO add your handling code here:
         if ((!Character.isDigit(evt.getKeyChar())|| descrip.getText().length() > 249)
          &&(Character.isDigit(evt.getKeyChar())|| descrip.getText().length() > 249)   ) {
            evt.consume();
        }
    }//GEN-LAST:event_descripKeyTyped

    private void nbofcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbofcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbofcActionPerformed

    private void chlabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chlabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chlabActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(cousesd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cousesd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cousesd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cousesd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cousesd dialog = new cousesd(new javax.swing.JFrame(), true, null, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chlab;
    private javax.swing.JTextField code;
    private javax.swing.JLabel coursecode;
    private javax.swing.JLabel coursename;
    private javax.persistence.EntityManager coursesPUEntityManager;
    private javax.swing.JTextField descrip;
    private javax.swing.JLabel description;
    private javax.swing.JComboBox major;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox nbofc;
    private javax.swing.JLabel nbofcredits;
    private javax.swing.JButton save;
    private java.util.List<courses.TblCourses> tblCoursesList;
    private javax.persistence.Query tblCoursesQuery;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
