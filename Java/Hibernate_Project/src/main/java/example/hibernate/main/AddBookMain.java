package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Book;

public class AddBookMain {

	public static void main(String[] args) {
		Session session=null;
		SessionFactory sf=null;
		try {
			Configuration conf=new Configuration();
			conf=conf.configure();
			sf=conf.buildSessionFactory();
			session=sf.openSession();
			
			Book bookObj=new Book(102,"3 Idiots","Ketan Bisen");
			Transaction tx=session.beginTransaction();
				session.persist(bookObj);
			tx.commit();
			System.out.println("Book added successfully");                                                                                                     
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
	}

}
