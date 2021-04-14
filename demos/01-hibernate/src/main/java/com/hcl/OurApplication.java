package com.hcl;

import org.hibernate.Session;

import com.hcl.model.Robot;

//Video: "Hibernate and Java Persistence API (JPA)" O'reilly course (Kevin Bowersox)
// https://learning.oreilly.com/videos/hibernate-and-java/9781771373494/
// Book: "Java Persistence with Hibernate" (Christian Bauer)
// https://learning.oreilly.com/library/view/java-persistence-with/9781617290459/
public class OurApplication {
	
    static Session hibernateSession;

	public static void main(String[] args) {
		
        hibernateSession = HibernateUtils
                .buildSessionFactory()
                .openSession();
        hibernateSession.beginTransaction();
        
        System.out.println("========");
        
        Robot r1 = new Robot();
        //r1.setId(55);
        r1.setName("threepio");
        // at this stage, r1 is "transient"
        
        hibernateSession.save(r1); // it moves from "transient" to "persistent" state
        hibernateSession.getTransaction().commit();
        hibernateSession.beginTransaction();
        r1 = hibernateSession.find(Robot.class, 1);
        System.out.println("r1: " + r1);
        hibernateSession.getTransaction().commit();


	}

}
