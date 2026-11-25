package example.hibernate.main;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.beans.HibernateUtlis;
import example.hibernate.entity.CricketPlayer;
import example.hibernate.entity.CricketTeam;

public class CricketTeamPlayerLinkingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory sf=HibernateUtlis.getSessionFactory();
				Session session=sf.openSession();
				){
			//Load the teams to ehich players are to be added
			CricketTeam teamInd=session.find(CricketTeam.class, "IND");
			CricketTeam teamNz=session.find(CricketTeam.class, "NZ");
			
			//Load the players which are to be added to teams
			CricketPlayer player1=session.find(CricketPlayer.class, 1);
			CricketPlayer player2=session.find(CricketPlayer.class, 2);
			CricketPlayer player3=session.find(CricketPlayer.class, 3);
			CricketPlayer player4=session.find(CricketPlayer.class, 4);
			CricketPlayer player5=session.find(CricketPlayer.class, 5);
			CricketPlayer player6=session.find(CricketPlayer.class, 6);
			
			List<CricketPlayer>indianPlayers=
					Arrays.asList(player1,player2,player3);
			Transaction tx=session.beginTransaction();
				teamInd.setPlayers(indianPlayers);
				teamNz.addPlayer(player4);
				teamNz.addPlayer(player5);
				teamNz.addPlayer(player6);
			tx.commit();
			
			System.out.println("Cricket Players linked to Cricket Teams...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
