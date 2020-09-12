/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import helper.HibernateUtil;
import java.util.List;
import models.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SANG
 */
public class ProductDAO {
    public int add(Product p){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.persist(p);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("error"+e.toString());
            return -1;
        }
        return 1;
    }
    
    public int update(Product p){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(p);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("error"+e.toString());
            return -1;
        }
        return 1;
    }
    
    public int delete(String maSp){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            Product p = (Product) session.get(Product.class, maSp);
            session.delete(p);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("error"+e.toString());
            return -1;
        }
        return 1;
    }
    
    public Product getById(String maSP){
        Product p = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            p = (Product) session.get(Product.class, maSP);
        } catch (Exception e) {
            System.out.println("error"+e.toString());
            return null;
        }
        return p;
    }
    public List<Product> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(Product.class).list();
    }
    
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        List<Product> ls = dao.getAll();
        for (Product l : ls) {
            System.out.println(l);
        }
    }
}
