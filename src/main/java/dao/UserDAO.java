package dao;

import entity.User;
import hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserDAO {
    List<User> get(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery("FROM User ");
        List<User> out = q.list();
        s.close();
        return out;
    }
    User getByLogin(String login){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery("FROM User WHERE login='"+login+"'");
        User out = (User)q.uniqueResult();
        s.close();
        return out;
    }
    void update(User u){
        //todo
    }
    void add(User u){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        s.save(u);
        s.getTransaction().commit();
        s.close();
   }
}
