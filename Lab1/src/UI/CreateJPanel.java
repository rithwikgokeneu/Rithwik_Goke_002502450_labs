package UI;

import Model.Product;
import javax.swing.JOptionPane;

/**
 *
 * @author rithwikvarma
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Product product;
    public CreateJPanel(Product p) {
        initComponents();
        product = p;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        fieldDescription = new javax.swing.JTextField();
        lblAvailability = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        fieldPrice = new javax.swing.JTextField();
        fieldAvailability = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblManuStreet = new javax.swing.JLabel();
        lblManuUnit = new javax.swing.JLabel();
        lblManuCity = new javax.swing.JLabel();
        lblManuZipcode = new javax.swing.JLabel();
        fieldManuStreet = new javax.swing.JTextField();
        fieldManuUnit = new javax.swing.JTextField();
        fieldManuCity = new javax.swing.JTextField();
        fieldManuZipcode = new javax.swing.JTextField();
        lblShippingStreet = new javax.swing.JLabel();
        lblShippingUnit = new javax.swing.JLabel();
        lblShippingCity = new javax.swing.JLabel();
        lblShippingZipcode = new javax.swing.JLabel();
        fieldShippingUnit = new javax.swing.JTextField();
        fieldShippingCity = new javax.swing.JTextField();
        fieldShippingZipcode = new javax.swing.JTextField();
        fieldShippingStreet = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(204, 255, 204));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblTitle.setText("Create a Product");

        lblName.setText("Name");

        fieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNameActionPerformed(evt);
            }
        });

        lblDescription.setText("Description");

        lblAvailability.setText("Availability");

        lblPrice.setText("Price");

        jLabel1.setText("Manufacture Address");

        jLabel2.setText("Shipping Address");

        lblManuStreet.setText("Street Name");

        lblManuUnit.setText("Unit Number");

        lblManuCity.setText("City");

        lblManuZipcode.setText("Zip Code");

        fieldManuUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldManuUnitActionPerformed(evt);
            }
        });

        fieldManuZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldManuZipcodeActionPerformed(evt);
            }
        });

        lblShippingStreet.setText("Street Name");

        lblShippingUnit.setText("Unit Number");

        lblShippingCity.setText("City");

        lblShippingZipcode.setText("Zip Code");

        fieldShippingUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldShippingUnitActionPerformed(evt);
            }
        });

        fieldShippingZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldShippingZipcodeActionPerformed(evt);
            }
        });

        fieldShippingStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldShippingStreetActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblManuUnit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManuCity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManuZipcode, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManuStreet, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldManuStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(fieldManuUnit)
                            .addComponent(fieldManuCity)
                            .addComponent(fieldManuZipcode))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblShippingStreet)
                                .addGap(18, 18, 18)
                                .addComponent(fieldShippingStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(lblShippingUnit))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblShippingCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblShippingZipcode, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldShippingUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(fieldShippingCity)
                                    .addComponent(fieldShippingZipcode)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(18, 18, 18)
                                .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAvailability)
                                    .addComponent(lblPrice))
                                .addGap(150, 150, 150))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescription)
                                .addGap(18, 18, 18)
                                .addComponent(fieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(207, 207, 207))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescription))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvailability))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldManuStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManuStreet))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldManuUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManuUnit))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldManuCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManuCity))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldManuZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManuZipcode))
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldShippingStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShippingStreet))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldShippingUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShippingUnit))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldShippingCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShippingCity))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldShippingZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShippingZipcode))
                        .addGap(64, 64, 64))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNameActionPerformed

    private void fieldManuUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldManuUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldManuUnitActionPerformed

    private void fieldManuZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldManuZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldManuZipcodeActionPerformed

    private void fieldShippingUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldShippingUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldShippingUnitActionPerformed

    private void fieldShippingZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldShippingZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldShippingZipcodeActionPerformed

    private void fieldShippingStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldShippingStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldShippingStreetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        // Step 1: collect text from the field
        String name = fieldName.getText();
        String description = fieldDescription.getText();
        String avail = fieldAvailability.getText();
        String price = fieldPrice.getText();
        
        String manuStreet = fieldManuStreet.getText();
        String manuUnit = fieldManuUnit.getText();
        String manuCity = fieldManuCity.getText();
        String manuZipCode = fieldManuZipcode.getText();
        
        String shippingStreet = fieldShippingStreet.getText();
        String shippingUnit = fieldShippingUnit.getText();
        String shippingCity = fieldShippingCity.getText();
        String shippingZipCode = fieldShippingZipcode.getText();
        
        // step 2: put those information to product
        product.setName(name);
        product.setDescription(description);
        product.setAvailNum(avail);
        product.setPrice(price);
        
        
        product.getManufactureAddress().setStreetName(manuStreet);
        product.getManufactureAddress().setUnitNum(manuUnit);
        product.getManufactureAddress().setCity(manuCity);
        product.getManufactureAddress().setZipCode(manuZipCode);
        
        product.getShippingAddress().setStreetName(shippingStreet);
        product.getShippingAddress().setUnitNum(shippingUnit);
        product.getShippingAddress().setCity(shippingCity);
        product.getShippingAddress().setZipCode(shippingZipCode);
        
        // step 3: set a little pop-up message
        JOptionPane.showMessageDialog(this, "Successfully Saved");
        
        // step 4: clear all textfield
        fieldName.setText("");
        fieldDescription.setText("");
        fieldAvailability.setText("");
        fieldPrice.setText("");
        fieldManuStreet.setText("");
        fieldManuUnit.setText("");
        fieldManuCity.setText("");
        fieldManuZipcode.setText("");
        fieldShippingStreet.setText("");
        fieldShippingUnit.setText("");
        fieldShippingCity.setText("");
        fieldShippingZipcode.setText("");
        
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField fieldAvailability;
    private javax.swing.JTextField fieldDescription;
    private javax.swing.JTextField fieldManuCity;
    private javax.swing.JTextField fieldManuStreet;
    private javax.swing.JTextField fieldManuUnit;
    private javax.swing.JTextField fieldManuZipcode;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldPrice;
    private javax.swing.JTextField fieldShippingCity;
    private javax.swing.JTextField fieldShippingStreet;
    private javax.swing.JTextField fieldShippingUnit;
    private javax.swing.JTextField fieldShippingZipcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblManuCity;
    private javax.swing.JLabel lblManuStreet;
    private javax.swing.JLabel lblManuUnit;
    private javax.swing.JLabel lblManuZipcode;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblShippingCity;
    private javax.swing.JLabel lblShippingStreet;
    private javax.swing.JLabel lblShippingUnit;
    private javax.swing.JLabel lblShippingZipcode;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
