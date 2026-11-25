package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.beans.HibernateUtlis;
import example.hibernate.entity.Article;

public class UpdateArticleMain {

	public static void main(String[] args) {
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			Class<Article> entityClass=Article.class;
			Integer id=2;
			Article foundArticle=session.find(entityClass, 3);
			if(foundArticle!= null) {
				Transaction tx=session.beginTransaction();
					foundArticle.setAuthor("Amar Panchal");
					foundArticle.setHeadLine("Personality Development");
				tx.commit();
				System.out.println("Article Updated");
			}else {
				System.out.println("Article not Found");
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
