package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.beans.HibernateUtlis;
import example.hibernate.entity.CricketPlayer;

public class CreateCricketPlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			CricketPlayer player1=new CricketPlayer(null,"Ajinkya Raut");
			CricketPlayer player2=new CricketPlayer(null,"Rohit Sharma");
			CricketPlayer player3=new CricketPlayer(null,"Saurabh Shivankar");
			CricketPlayer player4=new CricketPlayer(null,"Paras Khomane");
			CricketPlayer player5=new CricketPlayer(null,"Yash Lonkar");
			CricketPlayer player6=new CricketPlayer(null,"Sanket Matre");
			
			Transaction tx=session.beginTransaction();
				session.persist(player1);
				session.persist(player2);
				session.persist(player3);
				session.persist(player4);
				session.persist(player5);
				session.persist(player6);
			tx.commit();
			System.out.println("Cricket Players created...");
		}
	}

}
