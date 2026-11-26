package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.beans.HibernateUtlis;
import example.hibernate.entity.Actor;

public class CreateActorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			Actor a1=new Actor(null,"Ajay Devgan",null);
			Actor a2=new Actor(null,"Tabbu",null);
			Actor a3=new Actor(null,"Yash",null);
			
			Transaction tx=session.beginTransaction();
				session.persist(a1);
				session.persist(a2);
				session.persist(a3);
			tx.commit();
			System.out.println("Actor added....");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
