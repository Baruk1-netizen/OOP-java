package payroll;
public class payrollSystem extends javax.swing.JFrame {
public payrollSystem() {
        initComponents();
    }
   
@SuppressWarnings("unchecked")
   
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        EmployeeNameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        RatePerHourLabel = new javax.swing.JLabel();
        rateTextField = new javax.swing.JTextField();
        hourPerDayLabel = new javax.swing.JLabel();
        hourTextField = new javax.swing.JTextField();
        daysWorkedLabel = new javax.swing.JLabel();
        daysWorkedTextField = new javax.swing.JTextField();
        salaryLabel = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        deductionsLabel = new javax.swing.JLabel();
        taxLabel = new javax.swing.JLabel();
        taxTextField = new javax.swing.JTextField();
        phiHealthLabel = new javax.swing.JLabel();
        phiHealthTextField = new javax.swing.JTextField();
        sssLabel = new javax.swing.JLabel();
        sssTextField = new javax.swing.JTextField();
        totalDeductionLabel = new javax.swing.JLabel();
        totalDeductionTextField = new javax.swing.JTextField();
        computeButton = new javax.swing.JButton();
        netsalaryLabel1 = new javax.swing.JLabel();
        netSalaryTextField = new javax.swing.JTextField();
        grossSalaryLabel = new javax.swing.JLabel();
        finalDeductionLabel = new javax.swing.JLabel();
        grossSalaryTextField = new javax.swing.JTextField();
        finalDeductionTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(888, 290));

        TitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TitleLabel.setText("Simple Payroll System");

        EmployeeNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EmployeeNameLabel.setText("Employee Name: ");

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        RatePerHourLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RatePerHourLabel.setText("Rate Per Hour: ");

        hourPerDayLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hourPerDayLabel.setText("Hour Per Day:");

        hourTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourTextFieldActionPerformed(evt);
            }
        });

        daysWorkedLabel.setText("Number of days worked: ");

        daysWorkedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysWorkedTextFieldActionPerformed(evt);
            }
        });

        salaryLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salaryLabel.setText("GROSS SALARY :");

        salaryTextField.setEditable(false);
        salaryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryTextFieldActionPerformed(evt);
            }
        });

        deductionsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deductionsLabel.setForeground(new java.awt.Color(255, 0, 0));
        deductionsLabel.setText("DEDUCTION OF SALARY:");

        taxLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        taxLabel.setText("TAX 15% of Monthly Wage");

        taxTextField.setEditable(false);
        taxTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxTextFieldActionPerformed(evt);
            }
        });

        phiHealthLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phiHealthLabel.setText("Phihealth 5%");

        phiHealthTextField.setEditable(false);

        sssLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sssLabel.setText("SSS 2%");

        sssTextField.setEditable(false);

        totalDeductionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalDeductionLabel.setText("TOTAL DEDUCTION :");

        totalDeductionTextField.setEditable(false);

        computeButton.setBackground(new java.awt.Color(0, 51, 51));
        computeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        computeButton.setForeground(new java.awt.Color(255, 255, 255));
        computeButton.setText("Compute");
        computeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeButtonActionPerformed(evt);
            }
        });

        netsalaryLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        netsalaryLabel1.setText("NET SALARY :");

        netSalaryTextField.setEditable(false);

        grossSalaryLabel.setText("Gross Salary:");

        finalDeductionLabel.setText("Deduction:");

        grossSalaryTextField.setEditable(false);

        finalDeductionTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salaryLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(EmployeeNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RatePerHourLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hourPerDayLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(daysWorkedLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(rateTextField)
                    .addComponent(hourTextField)
                    .addComponent(daysWorkedTextField)
                    .addComponent(salaryTextField))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(computeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(taxLabel)
                            .addComponent(deductionsLabel)
                            .addComponent(phiHealthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sssLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalDeductionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phiHealthTextField)
                            .addComponent(taxTextField)
                            .addComponent(sssTextField)
                            .addComponent(totalDeductionTextField))))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(finalDeductionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(grossSalaryLabel)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grossSalaryTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalDeductionTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(netsalaryLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(netSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeNameLabel)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deductionsLabel)
                    .addComponent(grossSalaryLabel)
                    .addComponent(grossSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatePerHourLabel)
                    .addComponent(rateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taxLabel)
                    .addComponent(finalDeductionLabel)
                    .addComponent(finalDeductionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourPerDayLabel)
                    .addComponent(hourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phiHealthLabel)
                    .addComponent(phiHealthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysWorkedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sssLabel)
                    .addComponent(sssTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daysWorkedLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salaryLabel)
                            .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalDeductionLabel)
                            .addComponent(totalDeductionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(netsalaryLabel1)
                            .addComponent(netSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(computeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void hourTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hourTextFieldActionPerformed

    private void daysWorkedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysWorkedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysWorkedTextFieldActionPerformed

    private void salaryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryTextFieldActionPerformed

    private void taxTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxTextFieldActionPerformed

    private void computeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeButtonActionPerformed
        String employeeName = NameTextField.getText();
        double ratePerHour = Double.parseDouble(rateTextField.getText());
        double hoursPerDay = Double.parseDouble(hourTextField.getText());
        int daysWorked = Integer.parseInt(daysWorkedTextField.getText());

        // Calculate the gross salary
        int grossSalary = (int) (ratePerHour * hoursPerDay * daysWorked);
        salaryTextField.setText(String.valueOf(grossSalary));

        grossSalaryTextField.setText(String.valueOf(grossSalary));
        // Calculate the deductions
        int tax = (int) (0.15 * grossSalary);
        int philHealth = (int) (0.05 * grossSalary);
        int sss = (int) (0.02 * grossSalary);

        taxTextField.setText(String.valueOf(tax));
        phiHealthTextField.setText(String.valueOf(philHealth));
        sssTextField.setText(String.valueOf(sss));

        int totalDeduction = tax + philHealth + sss;
        totalDeductionTextField.setText(String.valueOf(totalDeduction));

        finalDeductionTextField.setText(String.valueOf(totalDeduction));
        // Calculate the net salary
        int netSalary = grossSalary - totalDeduction;
        netSalaryTextField.setText(String.valueOf(netSalary));
    }//GEN-LAST:event_computeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(payrollSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payrollSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payrollSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payrollSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payrollSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmployeeNameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel RatePerHourLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton computeButton;
    private javax.swing.JLabel daysWorkedLabel;
    private javax.swing.JTextField daysWorkedTextField;
    private javax.swing.JLabel deductionsLabel;
    private javax.swing.JLabel finalDeductionLabel;
    private javax.swing.JTextField finalDeductionTextField;
    private javax.swing.JLabel grossSalaryLabel;
    private javax.swing.JTextField grossSalaryTextField;
    private javax.swing.JLabel hourPerDayLabel;
    private javax.swing.JTextField hourTextField;
    private javax.swing.JTextField netSalaryTextField;
    private javax.swing.JLabel netsalaryLabel1;
    private javax.swing.JLabel phiHealthLabel;
    private javax.swing.JTextField phiHealthTextField;
    private javax.swing.JTextField rateTextField;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JLabel sssLabel;
    private javax.swing.JTextField sssTextField;
    private javax.swing.JLabel taxLabel;
    private javax.swing.JTextField taxTextField;
    private javax.swing.JLabel totalDeductionLabel;
    private javax.swing.JTextField totalDeductionTextField;
    // End of variables declaration//GEN-END:variables
}
