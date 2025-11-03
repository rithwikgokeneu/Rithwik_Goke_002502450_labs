package ui.CustomerRole;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import model.SupplierDirectory;
import model.MasterOrderList;

public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private MasterOrderList masterOrderList;

    // Variables declaration - do not modify
    private javax.swing.JButton btnBrowseCatalog;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration

    public CustomerWorkAreaJPanel(JPanel upc, SupplierDirectory sd, MasterOrderList mol) {
        this.userProcessContainer = upc;
        this.supplierDirectory = sd;
        this.masterOrderList = mol;
        initComponents();
    }

    private void initComponents() {
        lblTitle = new javax.swing.JLabel();
        btnBrowseCatalog = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 240, 240));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logoPleaseBuySmall.png")));
        lblTitle.setText("Welcome Dear Customer!");
        lblTitle.setIconTextGap(20);

        btnBrowseCatalog.setText("Browse Product Catalog >>");
        btnBrowseCatalog.addActionListener((ActionEvent evt) -> btnBrowseCatalogActionPerformed(evt));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(btnBrowseCatalog))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTitle)
                .addGap(50, 50, 50)
                .addComponent(btnBrowseCatalog)
                .addContainerGap(300, Short.MAX_VALUE))
        );
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBrowseCatalog = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 240, 240));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logoPleaseBuySmall.png"))); // NOI18N
        lblTitle.setText("Welcome Dear Customer!");
        lblTitle.setIconTextGap(20);

        btnBrowseCatalog.setText("Browse Product Catalog >>");
        btnBrowseCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseCatalogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBrowseCatalog)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle)
                .addGap(81, 81, 81)
                .addComponent(btnBrowseCatalog)
                .addContainerGap(399, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnBrowseCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseCatalogActionPerformed
      BrowseProductsJPanel panel = new BrowseProductsJPanel(userProcessContainer, supplierDirectory, masterOrderList);
        userProcessContainer.add("BrowseProductsJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
}      
    }//GEN-LAST:event_btnBrowseCatalogActionPerformed
      
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseCatalog;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
