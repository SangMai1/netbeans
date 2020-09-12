/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import Helper.HibernateUtil;
import java.util.List;
import models.Staffs;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SANG
 */
public class StaffDAO {
    public int add(Staffs sta) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.persist(sta);
            trans.commit();
        } catch (Exception e) {
            System.out.println("error" + e.toString());
            return -1;
        }
        return 1;
    }
    
    public int update(Staffs sta) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.saveOrUpdate(sta);
            trans.commit();
        } catch (Exception e) {
            System.out.println("error" + e.toString());
            return -1;
        }
        return 1;
    }
//    
    public int delete(String id){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            Staffs sta = (Staffs) session.get(Staffs.class, id);
            session.delete(sta);
            trans.commit();
        } catch (Exception e) {
            System.out.println("error" + e.toString());
            return -1;
        }
        return 1;
    }
    public List<Staffs> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(Staffs.class).list();
    }
    
    public Staffs findById(String id){
        Staffs sta = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            sta = (Staffs) session.get(Staffs.class, id);
        } catch (Exception e) {
            return null;
        }
        return sta;
    }
    
    public List<Staffs> getAllById(String name){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Staffs where name like:name";
        Query query = session.createQuery(hql);
        query.setParameter("name", "%"+name+"%");
        return query.list();
    }
}
