/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIPackage;

import ClassPackage.EmployeeClass;
import javax.swing.JOptionPane;

public class EmployeeForm extends javax.swing.JFrame {

    
    public EmployeeForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmployeeId = new javax.swing.JTextField();
        txtEmployeeName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        cmbDepartment = new javax.swing.JComboBox<>();
        cmbDesignation = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        btnBackM1 = new javax.swing.JButton();
        txtEPF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDep = new javax.swing.JTextField();
        txtDes = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Employee Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 6, 191, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Employee Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 113, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Employee Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 208, 47, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 246, 82, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Department");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 361, 116, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Designation");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 436, 116, -1));

        txtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 240, -1));

        txtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 240, -1));

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 201, 71, -1));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 241, -1, -1));

        cmbDepartment.setBackground(new java.awt.Color(255, 204, 204));
        cmbDepartment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "Finance" }));
        cmbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartmentActionPerformed(evt);
            }
        });
        jPanel1.add(cmbDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 358, -1, -1));

        cmbDesignation.setBackground(new java.awt.Color(255, 204, 204));
        cmbDesignation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbDesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Officer" }));
        cmbDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDesignationActionPerformed(evt);
            }
        });
        jPanel1.add(cmbDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, -1));

        btnRegister.setBackground(new java.awt.Color(255, 204, 204));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setText("Register ");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 100, -1));

        btnBackM1.setBackground(new java.awt.Color(255, 204, 204));
        btnBackM1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBackM1.setText("Main Menu");
        btnBackM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackM1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBackM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, -1, -1));

        txtEPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEPFActionPerformed(evt);
            }
        });
        jPanel1.add(txtEPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 240, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("EPF");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Add Departments");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 6, 137, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Department");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 58, 108, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Designation");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 58, 97, -1));

        txtDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepActionPerformed(evt);
            }
        });
        jPanel2.add(txtDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 58, 209, -1));

        txtDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesActionPerformed(evt);
            }
        });
        jPanel2.add(txtDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 58, 209, -1));

        btnEnter.setBackground(new java.awt.Color(255, 204, 204));
        btnEnter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        jPanel2.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 55, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepActionPerformed

    private void txtDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        String data = txtDep.getText();
        String data2 = txtDes.getText();
        
        if(txtDep.getText().isEmpty()|| txtDes.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fields Cannot be Empty", "Employee Form",
                    JOptionPane.ERROR_MESSAGE);
        }else{
                    cmbDepartment.addItem(data);
                    cmbDesignation.addItem(data2);
        JOptionPane.showMessageDialog(null, "Successfully Added Depatemt and Designation", 
                "Employee Form", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void txtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIdActionPerformed

    private void txtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void cmbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepartmentActionPerformed

    private void cmbDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDesignationActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
         if(txtEmployeeId.getText().isEmpty() || 
                txtEmployeeName.getText().isEmpty() || 
                 txtEPF.getText().isEmpty() ||
                txtAge.getText().isEmpty() || 
                txtAddress.getText().isEmpty() || 
                cmbDepartment.getSelectedItem().toString().isEmpty() || 
                cmbDesignation.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fields Cannot be Empty", 
                    "New Employee Form", JOptionPane.WARNING_MESSAGE);
        }else{
            String EmpId = txtEmployeeId.getText();
            String EmpName = txtEmployeeName.getText();
            int EPF = Integer.parseInt(txtEPF.getText());
            int Age = Integer.parseInt(txtAge.getText());
            String Address = txtAddress.getText();
            String Department = cmbDepartment.getSelectedItem().toString();
            String Designation = cmbDesignation.getSelectedItem().toString();
            
            EmployeeClass newEmp = new EmployeeClass(EmpId, EmpName, EPF, Age, Address, Department, Designation);
            if(newEmp.addEmployee()){
                JOptionPane.showMessageDialog(null, "Employee Added Successfully", 
                        "New Employee Form", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Something Went Worng!", "New Employee Form",
                        JOptionPane.ERROR_MESSAGE);
            }   
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackM1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackM1ActionPerformed

    private void txtEPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEPFActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackM1;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbDepartment;
    private javax.swing.JComboBox<String> cmbDesignation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDep;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtEPF;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtEmployeeName;
    // End of variables declaration//GEN-END:variables
}
