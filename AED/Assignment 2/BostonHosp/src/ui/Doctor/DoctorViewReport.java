
package ui.Doctor;

import ui.Patient.ViewEncounterDetails;
import model.Encounter;
import model.Encounterhistory;
import model.Patient;
import model.PatientDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

 
public class DoctorViewReport extends javax.swing.JPanel {
    
    JPanel workArea;
    PatientDirectory patientDirectory;
    Patient selectedPatient;
    /**
     * Creates new form PatientViewReport
     */
    public DoctorViewReport(JPanel workArea, PatientDirectory patientDirectory) {
        initComponents();
        this.workArea = workArea;
        this.patientDirectory = patientDirectory;
        
        populateCombo();
    }
    
    public void refreshTable(Patient selectedPatient) {
        Encounterhistory encounterHistory = selectedPatient.getEncounterhistory() ;
        
        DefaultTableModel model = (DefaultTableModel)tblEncounterDetails.getModel();
        model.setRowCount(0);
        
        for(Encounter e : encounterHistory.getEncounterhistory()){
            Object row[] = new Object[4];
            row[0] = e;  
            row[1] = e.getPatient().getAge(); 
            row[2] = e.getVitalSign().getBloodPressure();
            row[3] = e.getCurrentHealthStatus();    
            model.addRow(row);
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounterDetails = new javax.swing.JTable();
        btnViewMoreDetails = new javax.swing.JButton();
        cmbPatients = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_physical_therapy_25px.png"))); // NOI18N
        lblTitle.setText("Select Patient");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 120, 30));

        jScrollPane1.setForeground(new java.awt.Color(51, 51, 255));

        tblEncounterDetails.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblEncounterDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Encounter Date", "Age at Encounter", "Blood pressure", "Results"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEncounterDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 708, 188));

        btnViewMoreDetails.setBackground(new java.awt.Color(204, 204, 255));
        btnViewMoreDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnViewMoreDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_view_35px.png"))); // NOI18N
        btnViewMoreDetails.setText("View more details");
        btnViewMoreDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMoreDetailsActionPerformed(evt);
            }
        });
        add(btnViewMoreDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, -1, -1));

        cmbPatients.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPatients.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPatientsActionPerformed(evt);
            }
        });
        add(cmbPatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 169, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblTitle1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("View Patient Reports");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(lblTitle1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewMoreDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMoreDetailsActionPerformed
        
        int selectedRow = tblEncounterDetails.getSelectedRow();
        if(selectedRow<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Encounter selectedEncounter = (Encounter) tblEncounterDetails.getValueAt(selectedRow, 0);
        
        ViewEncounterDetails vd = new ViewEncounterDetails(workArea, selectedEncounter);
       
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewMoreDetailsActionPerformed

    private void cmbPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPatientsActionPerformed
        
        selectedPatient = (Patient) cmbPatients.getSelectedItem();
        if(selectedPatient != null)
            refreshTable(selectedPatient);
        
    }//GEN-LAST:event_cmbPatientsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewMoreDetails;
    private javax.swing.JComboBox<Object> cmbPatients;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTable tblEncounterDetails;
    // End of variables declaration//GEN-END:variables

    private void populateCombo() {
        
        cmbPatients.removeAllItems();
        for(Patient p : patientDirectory.getPatientDirectory()){
            cmbPatients.addItem(p);
        }
    }
}
