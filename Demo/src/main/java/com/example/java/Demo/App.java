package com.example.java.Demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
  	Student stud = new Student();
    	
    	stud.setRollno(102);
    	stud.setName("vaish");
    	stud.setMarks(97);
    	
//    	Student stud = null;
    	
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction tx = s.beginTransaction();
    	
    	//to fetch data
//    	stud = s.get(Student.class,101);
    	
    	//Saving object data 
        s.save(stud);
    	
    	tx.commit();
        System.out.println(stud);
        
        
    }
}
