package example.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.beans.ArticleData;
import example.hibernate.beans.HibernateUtlis;


public class ConstructorExpressionMain {

	public static void main(String[] args) {
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			String hqlQuery= "select new example.hibernate.beans.ArticleData(a.author,a.publishedOn) from Article a";
			Query<ArticleData> qr = session.createQuery(hqlQuery,ArticleData.class);
			List<ArticleData> articleData= qr.list();
			articleData.stream().forEach(data->System.out.println(data));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
