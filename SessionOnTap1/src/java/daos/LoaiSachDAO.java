/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import Helper.HibernateUtil;
import java.util.List;
import models.LoaiSach;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SANG
 */
public class LoaiSachDAO {
    public int add(LoaiSach ls){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(ls);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("error"+e.toString());
            return -1;
        }
        return 1;
    }
    
    public int update(LoaiSach ls){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(ls);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("error"+e.toString());
            return -1;
        }
        return 1;
    }
    
    public int delete(int maLoaiSach){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            LoaiSach ls = (LoaiSach) session.get(LoaiSach.class, maLoaiSach);
            session.delete(ls);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("error"+e.toString());
            return -1;
        }
        return 1;
    }
    
    public LoaiSach getById(int maLoaiSach){
        LoaiSach ls = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            ls = (LoaiSach) session.get(LoaiSach.class, maLoaiSach);
        } catch (Exception e) {
            return null;
        }
        return ls;
    }
    
    public List<LoaiSach> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(LoaiSach.class).list();
    }
}
