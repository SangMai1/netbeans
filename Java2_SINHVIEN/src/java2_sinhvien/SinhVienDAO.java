/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_sinhvien;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SANG
 */
public class SinhVienDAO extends SinhVien implements Serializable{
    
    List<SinhVien> lsSV = new ArrayList<>();

    public int addSinhVien(SinhVien sv){
        lsSV.add(sv);
        return 1;
    }
   public int count(){
       return lsSV.size();
   }
   public List<SinhVien> getAllSinhVien(){
       return lsSV;
   }
   public SinhVien find(String id){
       for (SinhVien sv : lsSV) {
           if (sv.getId().equalsIgnoreCase(id)) {
               return sv;
           }
       }
       return null;
   }
   public int del(String id){
       SinhVien sv = find(id);
       if (sv != null) {
           lsSV.remove(sv);
           return 1;
       }
       return -1;
   }
   public SinhVien getSinhVienPointAt(int position){
       return lsSV.get(position);
   }
   public int edit(SinhVien svNew){
       for (SinhVien sv : lsSV) {
           if (sv.getId().equalsIgnoreCase(svNew.getId())) {
               sv.setName(svNew.getName());
               sv.setBirthday(svNew.getBirthday());
               sv.setGender(svNew.isGender());
               sv.setLop(svNew.getLop());
               return 1;
           }
       }
       return -1;
   }
   public List<SinhVien> getFind(String find){
       List<SinhVien> lsFind = new ArrayList<>();
       for (SinhVien svn : lsSV) {
           if (svn.getId().contains(find)) {
               lsFind.add(svn);
           }
       }
       return lsFind;
   }
   public void saveFile(){
       try {
           FileOutputStream oos = new FileOutputStream("E:\\SinhVien\\sinhvien.txt");
           ObjectOutputStream dos = new ObjectOutputStream(oos);
           dos.writeObject(oos);
           dos.close();
           System.out.println("Luu thanh cong");
       } catch (Exception e) {
           System.out.println("ERROR:"+e.toString());
       }
   }
   public void readFile(){
       try {
           List s = new ArrayList();
           FileInputStream doc = new FileInputStream("E:\\SinhVien\\sinhvien.txt");
           ObjectInputStream red = new ObjectInputStream(doc);
           s = (List) red.readObject();
           System.out.println(s.toString());
           red.close();
       } catch (Exception e) {
           System.out.println("ERROR"+e.toString());
       }
   }
}
