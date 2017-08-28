package dao;

import entity.Item;
import hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ItemDAO {
    List<Item> get(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Query q = s.createQuery("FROM Item");
        List<Item> out = q.list();
        s.close();
        return out;
    }
    Item getById(int id){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Query q = s.createQuery("FROM Item WHERE id="+id);
        Item out = (Item)q.uniqueResult();
        s.close();
        return out;
    }
}
