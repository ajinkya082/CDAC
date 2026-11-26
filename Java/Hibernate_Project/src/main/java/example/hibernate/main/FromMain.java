package example.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.beans.HibernateUtlis;
import example.hibernate.entity.Article;

public class FromMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			String hqlQuery= "from Article a";
			Query<Article> qr = session.createQuery(hqlQuery,Article.class);
			List<Article> allArticles= qr.list();
//			for(Article art:allArticles) {
//				System.out.println(art);
//			}
			allArticles.stream().forEach(art->System.out.println(art));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
