package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.beans.HibernateUtlis;
import example.hibernate.entity.Article;

public class RetrieveArticleMain {

	public static void main(String[] args) {
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			Class<Article> entityClass=Article.class;
			Integer id=2;
			Article foundArticle=session.find(entityClass, 2);
			if(foundArticle!= null)
				System.out.println("Data Found Successfully..... " + foundArticle);
			else
				System.out.println("Article Not Found");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
