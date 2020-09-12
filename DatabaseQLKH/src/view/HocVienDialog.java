/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import model.HocVien;
import model.HocVienDAO;
import model.KhoaHoc;
import model.KhoaHocDAO;
import model.NguoiHoc;
import model.NguoiHocDAO;


/**
 *
 * @author SANG
 */
public class HocVienDialog extends javax.swing.JDialog {
    NguoiHocDAO nghdao = new NguoiHocDAO();
    HocVienDAO hvdao = new HocVienDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();
    KhoaHoc khoaHoc;
    Object[] rowData;
    static double diem;
    public static int rowSelect = 0;
    public KhoaHoc maKH;
    private boolean isFillData = false;
    private HashMap<Integer,Double> hocvienUpdate = new HashMap<>();
    private HashMap<Integer,Double> hocvienDelete = new HashMap<>();
    /**
     * Creates new form HocVienDialog
     */
    public HocVienDialog(java.awt.Frame parent, boolean modal, KhoaHoc khoaHocChoose) {
        super(parent, modal);
        initComponents();
        this.khoaHoc = khoaHocChoose;
        getCombobox();
        fillData();
        setLocationRelativeTo(null);
        tbTableHocVien.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if(!isFillData){
                    int row = e.getFirstRow();
                    int col = e.getColumn();
                    int maHocVien = (int)tbTableHocVien.getValueAt(row, 0);
                    Double mark = Double.valueOf(tbTableHocVien.getValueAt(row, 3).toString());
                    boolean isDelete = (boolean) tbTableHocVien.getValueAt(row, 4);
                    if(col==4){
                        if (isDelete) {
                            Double result = hocvienUpdate.get(maHocVien);
                            if (result!=null) {
                                hocvienDelete.put(maHocVien, mark);
                            }else{
                                hocvienDelete.put(maHocVien, null);
                            }
                        }else{
                            Double result = hocvienDelete.get(maHocVien);
                            if(result!=null){
                                hocvienUpdate.put(maHocVien, mark);
                            }
                            hocvienDelete.remove(maHocVien);
                        }
                    }else if(col==3){
                        if(isDelete){
                            hocvienDelete.put(maHocVien, mark);
                        }else{
                            hocvienUpdate.put(maHocVien, mark);
                        }
                    }
                }
            }
        });
        
    }
    
    public void getCombobox(){
        DefaultComboBoxModel<NguoiHoc> model = (DefaultComboBoxModel) cboHocVien.getModel();
        model.removeAllElements();
        List<NguoiHoc> ee = nghdao.getCourse(khoaHoc);
        for (NguoiHoc nh : ee) {
            model.addElement(nh);
        }
        if (ee.size()==0) {
            btnThem.setEnabled(false);
            cboHocVien.setEnabled(false);
        }else{
            btnThem.setEnabled(true);
            cboHocVien.setEnabled(true);
        }
    }
    
    public HocVien getModel(){
        HocVien hv = new HocVien();
        hv.setMaKH(khoaHoc);
//        System.out.println("aaaaaaaa"+khoaHoc);
        hv.setNguoihoc((NguoiHoc) cboHocVien.getSelectedItem());
        hv.setDiem(Double.parseDouble(txtDiem.getText()));
        return hv;
    }
    
    public void fillData(){
        isFillData = true;
        DefaultTableModel tbModel = (DefaultTableModel) tbTableHocVien.getModel();
        tbModel.setRowCount(0);
        List<HocVien> lsHocVien = hvdao.getAllHocVienByMaKhoaHoc(khoaHoc.getMaKH());
//        System.out.println("size:"+lsHocVien.size());
        for (HocVien hv: lsHocVien) {
            rowData = new Object[5];
            rowData[0] = hv.getMaHV();
            rowData[1] = hv.getNguoihoc().getMaNH();
            rowData[2] = hv.getNguoihoc().getHoTen();
            diem = hv.getDiem();
            rowData[3] = diem;
            rowData[4] = false;
//            tbModel.addRow(rowData);
            if (rdTatCa.isSelected()) {
                tbModel.addRow(rowData);
            }
            else if (rdDaNhapDiem.isSelected() && diem >= 0) {
                tbModel.addRow(rowData);
            }
            else if (rdChuaNhapDiem.isSelected() && diem < 0) {
                tbModel.addRow(rowData);
            }
        }
//        if (rdDaNhapDiem.isSelected() && diem >= 0) {
//            tbModel.addRow(rowData);
//        }
//        else if (rdChuaNhapDiem.isSelected() && diem < 0) {
//            tbModel.addRow(rowData);
//        }
        isFillData = false;
    }
    
    public HocVien getAtPoint(int pos){
        HocVien hv = new HocVien();
        hv.setMaHV((int) tbTableHocVien.getValueAt(pos, 0));
        hv.setNguoihoc(new NguoiHoc(tbTableHocVien.getValueAt(pos, 1).toString(), tbTableHocVien.getValueAt(pos, 2).toString()));
        hv.setDiem((double) tbTableHocVien.getValueAt(pos, 3));
        return hv;
    }
    
    public void updateHocVien(){
        for (Map.Entry<Integer, Double> entry : hocvienDelete.entrySet()) {
            hvdao.del(entry.getKey());
        }
        for (Map.Entry<Integer, Double> entry : hocvienUpdate.entrySet()) {
            hvdao.edit(entry.getKey(), entry.getValue());
        }
        fillData();
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
        jLabel1 = new javax.swing.JLabel();
        cboHocVien = new javax.swing.JComboBox<>();
        txtDiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTableHocVien = new javax.swing.JTable();
        rdTatCa = new javax.swing.JRadioButton();
        rdDaNhapDiem = new javax.swing.JRadioButton();
        rdChuaNhapDiem = new javax.swing.JRadioButton();
        btnCapNhat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("HỌC VIÊN KHÁC");

        cboHocVien.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cboHocVienFocusGained(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("HỌC VIÊN TRONG CỦA KHÓA");

        tbTableHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HV", "Mã NH", "Họ và tên", "Điểm", "Xóa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTableHocVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTableHocVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTableHocVien);

        buttonGroup1.add(rdTatCa);
        rdTatCa.setSelected(true);
        rdTatCa.setText("Tất cả");
        rdTatCa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdTatCaItemStateChanged(evt);
            }
        });
        rdTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdTatCaMouseClicked(evt);
            }
        });

        buttonGroup1.add(rdDaNhapDiem);
        rdDaNhapDiem.setText("Đã nhập điểm");
        rdDaNhapDiem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdDaNhapDiemItemStateChanged(evt);
            }
        });
        rdDaNhapDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdDaNhapDiemMouseClicked(evt);
            }
        });

        buttonGroup1.add(rdChuaNhapDiem);
        rdChuaNhapDiem.setText("Chưa nhập điểm");
        rdChuaNhapDiem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdChuaNhapDiemItemStateChanged(evt);
            }
        });
        rdChuaNhapDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdChuaNhapDiemMouseClicked(evt);
            }
        });

        btnCapNhat.setText("CẬP NHẬT");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCapNhat)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rdTatCa)
                            .addGap(44, 44, 44)
                            .addComponent(rdDaNhapDiem)
                            .addGap(32, 32, 32)
                            .addComponent(rdChuaNhapDiem))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cboHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(btnThem))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboHocVien)
                    .addComponent(txtDiem))
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCapNhat)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdTatCa)
                    .addComponent(rdDaNhapDiem)
                    .addComponent(rdChuaNhapDiem))
                .addGap(119, 119, 119))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboHocVienFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboHocVienFocusGained
        // TODO add your handling code here:
        getCombobox();
    }//GEN-LAST:event_cboHocVienFocusGained

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        HocVien hv = getModel();
        if (hvdao.add(hv) > 0) {
            JOptionPane.showMessageDialog(this, "them thanh cong");
            fillData();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void rdTatCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdTatCaMouseClicked
        // TODO add your handling code here:
//
//        if (rdTatCa.isSelected()) {
//                fillData();
//            }
    }//GEN-LAST:event_rdTatCaMouseClicked

    private void rdDaNhapDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdDaNhapDiemMouseClicked
        // TODO add your handling code here:
//        if (diem >= 0) {
//            fillData();
//        }
    }//GEN-LAST:event_rdDaNhapDiemMouseClicked

    private void rdChuaNhapDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdChuaNhapDiemMouseClicked
        // TODO add your handling code here:
//        if ( diem < 0) {
//                fillData();
//            }
    }//GEN-LAST:event_rdChuaNhapDiemMouseClicked

    private void tbTableHocVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableHocVienMouseClicked
        // TODO add your handling code here:
        rowSelect = tbTableHocVien.rowAtPoint(evt.getPoint());
//        col = tbTableHocVien.columnAtPoint(evt.getPoint());
        HocVien hv = getAtPoint(rowSelect);
        
        
    }//GEN-LAST:event_tbTableHocVienMouseClicked

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        updateHocVien();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void rdDaNhapDiemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdDaNhapDiemItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            fillData();
        }
    }//GEN-LAST:event_rdDaNhapDiemItemStateChanged

    private void rdTatCaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdTatCaItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            fillData();
        }
    }//GEN-LAST:event_rdTatCaItemStateChanged

    private void rdChuaNhapDiemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdChuaNhapDiemItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            fillData();
        }
    }//GEN-LAST:event_rdChuaNhapDiemItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowClosing
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     FrKhoaHoc.main(args);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboHocVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdChuaNhapDiem;
    private javax.swing.JRadioButton rdDaNhapDiem;
    private javax.swing.JRadioButton rdTatCa;
    private javax.swing.JTable tbTableHocVien;
    private javax.swing.JTextField txtDiem;
    // End of variables declaration//GEN-END:variables
}
