package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.beans.HibernateUtlis;
import example.hibernate.entity.Passport;

public class CreatePassportMain {

	public static void main(String[] args) {
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			Passport p1=new Passport("P1","Ankit Bhujbal","Saswad");
			Passport p2=new Passport("p2","Harsh Rabdhave","Baramati");
			Transaction tx=session.beginTransaction();
				session.persist(p1);
				session.persist(p2);
			tx.commit();
			System.out.println("Passport created...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
