package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateInstructorDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			
			//create the object
			Instructor tempInstructor= 
					new Instructor("Suzan","Public","namangupta350@gmail.com");
			
			InstructorDetail tempInstructorDeatil = 
					new InstructorDetail("https://www.ngtechnoblog.com","Vedio Games");
			
			//associate the object
			tempInstructor.setInstructorDetail(tempInstructorDeatil);
			
			// start a transaction
			session.beginTransaction();
			
			
			// save objects of other class as Cascade type is ALL
			//save the instructor
			System.out.println("saving the instructor : "+tempInstructor);
			session.save(tempInstructor);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





