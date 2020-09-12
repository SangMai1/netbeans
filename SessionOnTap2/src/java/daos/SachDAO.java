/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import helper.HibenaUtil;
import java.util.List;
import models.LoaiSach;
import models.Sach;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SANG
 */
public class SachDAO {
    public int add(Sach s){
        try {
            Session session = HibenaUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.persist(s);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("EEError"+e.toString());
            return -1;
        }
        return 1;
    }
    
    public int update(Sach s){
        try {
            Session session = HibenaUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(s);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("error"+e.toString());
            return -1;
        }
        return 1;
    }
    
    public int delete(String maSach){
        try {
            Session session = HibenaUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            Sach s = (Sach) session.get(Sach.class, maSach);
            session.delete(s);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("error"+e.toString());
            return -1;
        }
        return 1;
    }
    
    public Sach getById(String id){
        Sach s = null;
        try {
            Session session = HibenaUtil.getSessionFactory().openSession();
            s = (Sach) session.get(Sach.class, id);
        } catch (Exception e) {
            System.out.println("eeroe"+e.toString());
            return null;
        }
        return s;
    }
    
    public List<Sach> getAll(){
        Session session = HibenaUtil.getSessionFactory().openSession();
        return session.createCriteria(Sach.class).list();
    }
    
    public List<Sach> getOne(String tenSach){
        Session session = HibenaUtil.getSessionFactory().openSession();
        return  session.createFilter(Sach.class, tenSach).list();
    }
    public static void main(String[] args) {
        SachDAO dao = new SachDAO();
        List<Sach> s = dao.getAll();
        for (Sach sach : s) {
            System.out.println(sach);
        }
    }
}
