package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.beans.HibernateUtlis;
import example.hibernate.entity.Movie;

public class CreateMovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			Movie m1=new Movie(null,"Drishyam",null);
			Movie m2=new Movie(null,"Drishyam 2",null);
			Movie m3=new Movie(null,"KGF",null);
			
			Transaction tx=session.beginTransaction();
				session.persist(m1);
				session.persist(m2);
				session.persist(m3);
			tx.commit();
			System.out.println("Movies created...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
