package example.hibernate.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="CricketTeam_Master")
public class CricketTeam {
	@Id
	@Column(name="team_id",length =3)
	private String teamId;
	@Column(name="team_name" , length = 30)
	private String name; 
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="team_id")//A foreign key column from CricketPlayer_Master  that refers to
	private List<CricketPlayer> players;
	public CricketTeam() {
		// TODO Auto-generated constructor stub
	}
	public CricketTeam(String teamId, String name, List<CricketPlayer> players) {
		super();
		this.teamId = teamId;
		this.name = name;
		this.players = players;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<CricketPlayer> getPlayers() {
		return players;
	}
	public void setPlayers(List<CricketPlayer> players) {
		this.players = players;
	}
	public void addPlayer(CricketPlayer player) {
		//This is utility method meant for adding a one player at a time
		players.add(player);
	}
	@Override
	public String toString() {
		return "CricketTeam [teamId=" + teamId + ", name=" + name + ", players=" + players + "]";
	}
	
}
