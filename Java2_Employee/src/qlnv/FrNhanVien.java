/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnv;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SANG
 */
public class FrNhanVien extends javax.swing.JFrame {
    EmployeeDAO edao = new EmployeeDAO();
    SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");
    File file = null;
    
    /**
     * Creates new form FrNhanVien
     */
    public FrNhanVien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblHinhanh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        cboPhongBan = new javax.swing.JComboBox<>();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        btnLuuLai = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHinhanh.setText("images");
        lblHinhanh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblHinhanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhanhMouseClicked(evt);
            }
        });

        jLabel2.setText("MA NHAN VIEN:");

        jLabel3.setText("TEN NHAN VIEN:");

        jLabel4.setText("NGAY SINH:");

        jLabel5.setText("GIOI TINH:");

        buttonGroup1.add(rdNam);
        rdNam.setSelected(true);
        rdNam.setText("NAM");

        buttonGroup1.add(rdNu);
        rdNu.setText("NU");

        jLabel6.setText("PHONG BAN:");

        cboPhongBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GIAM DOC", "NHAN SU", "HANH CHINH", "KE TOAN" }));
        cboPhongBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboPhongBanMouseClicked(evt);
            }
        });

        btnXoa.setText("XOA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTimKiem.setText("TIM KIEM");

        btnThemMoi.setText("THEM MOI");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnLuuLai.setText("LUU LAI");
        btnLuuLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuLaiActionPerformed(evt);
            }
        });

        btnSua.setText("SUA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        tbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma nv", "Ten nv", "Ngay sinh", "Gioi Tinh", "Phong ban", "Hinh anh"
            }
        ));
        tbTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lblHinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdNam)
                        .addGap(55, 55, 55)
                        .addComponent(rdNu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuuLai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdNam)
                            .addComponent(rdNu))
                        .addGap(24, 24, 24)
                        .addComponent(cboPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnTimKiem)
                        .addGap(5, 5, 5)
                        .addComponent(btnThemMoi)
                        .addGap(15, 15, 15)
                        .addComponent(btnLuuLai)
                        .addGap(15, 15, 15)
                        .addComponent(btnSua)
                        .addGap(25, 25, 25)
                        .addComponent(btnXoa)))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHinhanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhanhMouseClicked
        try {
            // TODO add your handling code here:
            JFileChooser fileChooser = new JFileChooser("C:\\Users\\SANG\\Documents\\NetBeansProjects\\Java2_Employee\\build\\classes\\images");
            fileChooser.showOpenDialog(null);
            file = fileChooser.getSelectedFile();
            System.out.println("file name:"+file.toString());
            
            Image image = ImageIO.read(file);
            lblHinhanh.setText("");
            lblHinhanh.setIcon(new ImageIcon(image.getScaledInstance(lblHinhanh.getWidth(), lblHinhanh.getHeight(), 0)));
        } catch (IOException ex) {
          
        }
        
    }//GEN-LAST:event_lblHinhanhMouseClicked
    public boolean checkValidate(){
        if (txtMaNhanVien.getText().isEmpty() || txtTenNhanVien.getText().isEmpty() || txtNgaySinh.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    public Employee getModel() throws ParseException{
        Employee ee = new Employee();
        ee.setMaNV(Integer.parseInt(txtMaNhanVien.getText()));
        ee.setTenNV(txtTenNhanVien.getText().trim());
        ee.setNgaysinh(date_format.parse(txtNgaySinh.getText()));
        boolean gt = false;
        if (rdNam.isSelected()) {
            gt = true;
        }
        ee.setGioiTinh(gt);
        ee.setPhongban(cboPhongBan.getSelectedItem().toString());
        if (file != null) {
            ee.setHinhanh(file.getName());
        } else {
            ee.setHinhanh("no images");
        }
        return ee;
    }
    public void fillData(){
        DefaultTableModel tbModel = (DefaultTableModel) tbTable.getModel();
        tbModel.setRowCount(0);
        for (Employee ee : edao.getAllEmployee()) {
            Object[] rowData = new Object[6];
            rowData[0] = ee.getMaNV();
            rowData[1] = ee.getTenNV();
            rowData[2] = ee.getNgaysinh();
            rowData[3] = ee.isGioiTinh();
            rowData[4] = ee.getPhongban();
            rowData[5] = ee.getHinhanh();
            tbModel.addRow(rowData);
        }
        
    }
    public void setModel(Employee ee){
        txtMaNhanVien.setText(ee.getMaNV()+"");
        txtTenNhanVien.setText(ee.getTenNV());
        txtNgaySinh.setText(date_format.format(ee.getNgaysinh()));
        boolean gioitinh = ee.isGioiTinh();
        if (gioitinh) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
        cboPhongBan.setSelectedItem(ee.getPhongban());
        
        ImageIcon icon = new ImageIcon(this.getClass().getResource("C:\\Users\\SANG\\Documents\\NetBeansProjects\\Java2_Employee\\build\\classes\\images"));
        Image img = icon.getImage().getScaledInstance(lblHinhanh.getWidth(), lblHinhanh.getHeight(), 0);
        lblHinhanh.setIcon(new ImageIcon(img));
    }
    public void fillDataFind(String find){
        DefaultTableModel tbModel = (DefaultTableModel) tbTable.getModel();
        tbModel.setRowCount(0);
        for (Employee ee : edao.getAllFindEmployee(find)) {
            Object[] rowData = new Object[6];
            rowData[0] = ee.getMaNV();
            rowData[1] = ee.getTenNV();
            rowData[2] = ee.getNgaysinh();
            rowData[3] = ee.isGioiTinh();
            rowData[4] = ee.getPhongban();
            rowData[5] = ee.getHinhanh();
            tbModel.addRow(rowData);
        }
    }
    private void btnLuuLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuLaiActionPerformed
        // TODO add your handling code here:
        if (!checkValidate()) {
            JOptionPane.showMessageDialog(this, "Ban chua nhap thong tin");
        } else {
            try {
                Employee ee = getModel();
                if (edao.add(ee) > 0) {
                    fillData();
                }
            } catch (ParseException ex) {
                Logger.getLogger(FrNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnLuuLaiActionPerformed
    public void reset(){
        txtMaNhanVien.setText("");
        txtTenNhanVien.setText("");
        txtNgaySinh.setText("");
        rdNam.setSelected(true);
        cboPhongBan.setSelectedIndex(0);
    }
    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (edao.del(Integer.parseInt(txtMaNhanVien.getText())) > 0) {
            fillData();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            // TODO add your handling code here:
            Employee ee = getModel();
            if (edao.edit(ee) > 0) {
                fillData();
            }
        } catch (ParseException ex) {
            Logger.getLogger(FrNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tbTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableMouseClicked
        // TODO add your handling code here:
        int rowData = tbTable.rowAtPoint(evt.getPoint());
        Employee ee = edao.getAtPointEmployee(rowData);
        setModel(ee);
        
        
    }//GEN-LAST:event_tbTableMouseClicked

    private void cboPhongBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboPhongBanMouseClicked
        // TODO add your handling code here:
        String find = cboPhongBan.getSelectedItem().toString();
        fillDataFind(find);
        
    }//GEN-LAST:event_cboPhongBanMouseClicked

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
            java.util.logging.Logger.getLogger(FrNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuuLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboPhongBan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHinhanh;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tbTable;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
}
