package com.MavenProject.LaptopMapping;


import java.util.List;

import com.Laptop.Laptops;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfiguration af = new AnnotationConfiguration();
        af.configure("./Resources/Laptop.cfg.xml");
        SessionFactory sf = af.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction trns = ses.beginTransaction();
        
//      OneToMany  
        
       Query q1 = ses.createQuery("Select lap from Laptops lap");
        List <Laptops> li =q1.list();
        
        li.stream().forEach(temp -> {
        	
        	System.out.println(temp.getLap_Id()+" , "+temp.getLap_Name()+" , "+temp.getLap_Owner());
       	temp.getLapsdesc().stream().forEach(data -> System.out.println(data.getLap_Model()+" -> "+data.getLap_Price()));
        
        });
        
        trns.commit();
        System.out.println("Done");
        
    }
}
