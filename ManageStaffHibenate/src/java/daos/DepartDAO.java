/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import Helper.HibernateUtil;
import java.util.List;
import models.Departs;
import models.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SANG
 */
public class DepartDAO {
    public int add(Departs departs) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.persist(departs);
            trans.commit();
        } catch (Exception e) {
            System.out.println("error" + e.toString());
            return -1;
        }
        return 1;
    }
    
    public int update(Departs departs) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            session.saveOrUpdate(departs);
            trans.commit();
        } catch (Exception e) {
            System.out.println("error" + e.toString());
            return -1;
        }
        return 1;
    }
    
    public int delete(String id){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction trans = session.beginTransaction();
            Departs departs = (Departs) session.get(Departs.class, id);
            session.delete(departs);
            trans.commit();
        } catch (Exception e) {
            System.out.println("error" + e.toString());
            return -1;
        }
        return 1;
    }
    
    public Departs findById(String id){
        Departs departs = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            departs = (Departs) session.get(Departs.class, id);
        } catch (Exception e) {
            return null;
        }
        return departs;
    }
    
    public List<Departs> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(Departs.class).list();
    }
    
    public List<Departs> getAllById(String id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Departs where id like:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", "%"+id+"%");
        return query.list();
    }
}
