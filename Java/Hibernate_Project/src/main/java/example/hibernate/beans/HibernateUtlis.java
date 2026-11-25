package example.hibernate.beans;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Actor;
import example.hibernate.entity.Article;
import example.hibernate.entity.CricketPlayer;
import example.hibernate.entity.CricketTeam;
import example.hibernate.entity.Employee;
import example.hibernate.entity.Movie;
import example.hibernate.entity.Passport;

public class HibernateUtlis {
	public static SessionFactory getSessionFactory() {
		return new Configuration()
				.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
				.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate")
				.setProperty("hibernate.connection.username", "root")
				.setProperty("hibernate.connection.password", "root")
				.setProperty("hibernate.hbm2ddl.auto", "update")
				.setProperty("hibernate.show_sql", "true")
				.addAnnotatedClasses(
						Article.class,
						Passport.class,
						Employee.class,
						CricketPlayer.class,
						CricketTeam.class,
						Actor.class,
						Movie.class
						)
				.buildSessionFactory();
		
	}
}
