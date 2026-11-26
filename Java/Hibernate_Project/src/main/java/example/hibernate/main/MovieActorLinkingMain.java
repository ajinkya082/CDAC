package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.beans.HibernateUtlis;

public class MovieActorLinkingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
