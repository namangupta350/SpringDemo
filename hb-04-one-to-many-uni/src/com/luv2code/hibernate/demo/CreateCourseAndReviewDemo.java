package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateCourseAndReviewDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// start a transaction
						session.beginTransaction();
							
						
						// create some courses
						Course tempCourse = new Course("Spring Mvc - Begginer to expert");
						
						
						tempCourse.addReview(new Review("what a great course every detail is covered"));
						tempCourse.addReview(new Review("even REST API is included WOW!"));
						tempCourse.addReview(new Review("You should have added some frontend part too"));
						
						//saving the session
						System.out.println(" Saving the course");
						System.out.println(tempCourse);
						System.out.println(tempCourse.getReviews());
						
						session.save(tempCourse);
						
						int theId=13;
						
						Course tempCourse2 = session.get(Course.class,theId);
						
						System.out.println(tempCourse2);
						
						System.out.println(tempCourse2.getReviews());
						
						// commit transaction
						session.getTransaction().commit();
						
			System.out.println("Done!");
			
		}
		finally {
			factory.close();
		}
	}

}





