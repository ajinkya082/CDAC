package example.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.beans.HibernateUtlis;
import example.hibernate.entity.Article;

public class CreateArticleMain {

	public static void main(String[] args) {
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			Article a=new Article(null,"Java Coffee Beans","James Goslin",LocalDate.of(2026, 5, 23));
			Transaction tx=session.beginTransaction();
				session.persist(a);
			tx.commit();
			System.out.println("Article Added....");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
