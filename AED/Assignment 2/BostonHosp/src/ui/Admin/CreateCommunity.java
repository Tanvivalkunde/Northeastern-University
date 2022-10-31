
package ui.Admin;

import model.Community;
import model.HealthcareSystem;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Tanvi
 */
public class CreateCommunity extends javax.swing.JPanel {

    List<Community> communities;
    HealthcareSystem healthcareSystem;
    JPanel workArea;
    
    /**
     * Creates new form CreateProductJPanel
     */
    public CreateCommunity(JPanel workArea, HealthcareSystem healthcareSystem) {
        initComponents();
        this.healthcareSystem = healthcareSystem;
        this.communities = healthcareSystem.getCity().getCommunities();
        this.workArea = workArea;
        
        txtCity.setText(healthcareSystem.getCity().getName());
        txtCity.setEditable(false);  
    }

    /**s
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblProductName1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lblProductName1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProductName1.setText(" Name");

        txtName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("City");

        txtCity.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 51, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_community_grants_35px.png"))); // NOI18N
        btnAdd.setText("Add Community");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmail)
                    .addComponent(lblProductName1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnAdd)
                .addGap(59, 59, 59))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 350, 290));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_prev_48px.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblTitle1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("Creating new community");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(lblTitle1)
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 60));
    }// </editor-fold>//GEN-END:initComponents
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        if(txtName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Community Name cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Community community = new Community(txtName.getText(), healthcareSystem.getCity().getName());
       
        communities.add(community);
        JOptionPane.showMessageDialog(this, "Community successfully added", "Information", JOptionPane.INFORMATION_MESSAGE);
        backAction();
}//GEN-LAST:event_btnAddActionPerformed
    private void backAction() {
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageCommunity manageCommunity = (ManageCommunity) component;
        manageCommunity.refreshTable();
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblProductName1;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
