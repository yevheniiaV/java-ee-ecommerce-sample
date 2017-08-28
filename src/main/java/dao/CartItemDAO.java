package dao;

import entity.Cartitem;
import hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CartItemDAO {

    List<Cartitem> get(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Query q = s.createQuery("FROM Cartitem");
        List<Cartitem> out = q.list();
        s.close();
        return out;
    }

    List<Cartitem> getByUser(int user_id){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Query q = s.createQuery("FROM Cartitem WHERE user=" + user_id);
        List<Cartitem> out = q.list();
        s.close();
        return out;
    }

    Cartitem getByItem(int item_id){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Query q = s.createQuery("FROM Cartitem WHERE item=" + item_id);
        Cartitem out = (Cartitem) q.uniqueResult();
        s.close();
        return out;
    }

    void add(Cartitem ci){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        s.save(ci);
        s.getTransaction().commit();
        s.close();
    }

    void updateAddingQuantityOfItem(int item_id){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query query = s.createQuery("UPDATE Cartitem SET quantity = quantity + 1 WHERE item=" + item_id);
        query.executeUpdate();
        s.getTransaction().commit();
        s.close();
    }

    void updateSubstractingQuantityOfItem(int item_id){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query query = s.createQuery("UPDATE Cartitem SET quantity = quantity - 1 WHERE item=" + item_id);
        query.executeUpdate();
        s.getTransaction().commit();
        s.close();
    }

}