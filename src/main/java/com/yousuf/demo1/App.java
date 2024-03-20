package com.yousuf.demo1;

//import java.lang.module.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Data obj =new Data();
        obj.setId(1);
        obj.setName("Yousuf");
        Configuration con=new Configuration().configure().addAnnotatedClass(Data.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(obj);
        tx.commit();
        
    }
}
