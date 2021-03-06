/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import baitaphoadon.HoaDon;
import baitaphoadon.HoaDonDAO;
import baitaphoadon.KhachHang;
import baitaphoadon.KhachHangDAO;
import common.DateHelper;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SANG
 */
public class FrHoaDon extends javax.swing.JFrame {
    KhachHangDAO khdao = new KhachHangDAO();
    HoaDonDAO hddao = new HoaDonDAO();
    public int row = 0;
    public HashMap<String, Integer> khachhangselect;
    /**
     * Creates new form HoaDon
     */
    public FrHoaDon() {
        initComponents();
        getCombobox();
        fillData();
        btnXemChiTiet.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNgayMuaHang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboMaKhachHang = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtTrangThai = new javax.swing.JTextField();
        btnDel = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTableHoaDon = new javax.swing.JTable();
        btnXemChiTiet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("HÓA ĐƠN");

        jLabel2.setText("Mã hóa đơn");

        jLabel3.setText("Ngày mua hàng");

        jLabel4.setText("Mã khách hàng");

        jLabel5.setText("Trạng thái");

        btnDel.setText("Del");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        tbTableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Ngày mua hàng", "Mã khách hàng", "Trạng thái"
            }
        ));
        tbTableHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbTableHoaDonMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbTableHoaDon);

        btnXemChiTiet.setText("Xem Chi Tiet");
        btnXemChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnXemChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtNgayMuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cboMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset)
                            .addComponent(btnXemChiTiet))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtNgayMuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAdd)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        HoaDon hd = getModel();
        if (hddao.add(hd) > 0) {
            JOptionPane.showMessageDialog(this, "add thanh cong");
            fillData();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tbTableHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableHoaDonMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            row = tbTableHoaDon.rowAtPoint(evt.getPoint());
            HoaDon hd = getAtPoint(row);
            setModel(hd);
            String makhachhang = tbTableHoaDon.getValueAt(row, 2).toString();
            cboMaKhachHang.setSelectedIndex(khachhangselect.get(makhachhang));
            btnXemChiTiet.setEnabled(true);
        }
    }//GEN-LAST:event_tbTableHoaDonMousePressed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        HoaDon hd = getModel();
        if (hddao.edit(hd) > 0) {
            JOptionPane.showMessageDialog(this, "edit thanh cong");
            fillData();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        int p = Integer.valueOf(tbTableHoaDon.getValueAt(row, 0).toString());
        if (hddao.del(p) > 0) {
            JOptionPane.showMessageDialog(this, "xoa thanh cong");
            fillData();
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnXemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietActionPerformed
        // TODO add your handling code here:
        FrHoaDonChiTiet frmuahang = new FrHoaDonChiTiet();
        frmuahang.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnXemChiTietActionPerformed
    public void getCombobox(){
        DefaultComboBoxModel<KhachHang> model = (DefaultComboBoxModel) cboMaKhachHang.getModel();
        model.removeAllElements();
        khachhangselect = new HashMap<>();
        int count = 0;
        for (KhachHang kh : khdao.getAllKhachHang()) {
            khachhangselect.put(kh.getTen(), count);
            model.addElement(kh);
            ++count;
        }
    }
    public HoaDon getModel(){
        HoaDon hd = new HoaDon();
        hd.setMahoadon(Integer.parseInt(txtMaHoaDon.getText()));
        hd.setNgaymuahang(DateHelper.toDate(txtNgayMuaHang.getText()));
        hd.setMaKhachHang(new KhachHang(cboMaKhachHang.getSelectedItem().toString()));
        hd.setTrangthai(txtTrangThai.getText());
        return hd;
    }
    public HoaDon getAtPoint(int pos){
        HoaDon hd = new HoaDon();
        hd.setMahoadon(Integer.parseInt(tbTableHoaDon.getValueAt(pos, 0).toString()));
        hd.setNgaymuahang(DateHelper.toDate(tbTableHoaDon.getValueAt(pos, 1).toString()));
        cboMaKhachHang.setSelectedItem(khdao.getAllKhachHangByMaKhachHang(tbTableHoaDon.getValueAt(pos, 2).toString()));
        hd.setTrangthai(tbTableHoaDon.getValueAt(pos, 3).toString());
        return hd;
    }
    public void setModel(HoaDon hd){
        txtMaHoaDon.setText(hd.getMahoadon()+"");
        txtNgayMuaHang.setText(DateHelper.toString(hd.getNgaymuahang()));
//        cboMaKhachHang.setSelectedItem(khachhangselect.getMakhachhang());
        txtTrangThai.setText(hd.getTrangthai());
    }
    public void fillData(){
        DefaultTableModel tbModel = (DefaultTableModel) tbTableHoaDon.getModel();
        tbModel.setRowCount(0);
        for (HoaDon hd : hddao.getAllHoaDon()) {
            Object[] rowData = new Object[4];
            rowData[0] = hd.getMahoadon();
            rowData[1] = hd.getNgaymuahang();
            rowData[2] = hd.getMaKhachHang();
            rowData[3] = hd.getTrangthai();
            tbModel.addRow(rowData);
        }
    }
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
            java.util.logging.Logger.getLogger(HoaDonDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnXemChiTiet;
    private javax.swing.JComboBox<String> cboMaKhachHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTableHoaDon;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtNgayMuaHang;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}
