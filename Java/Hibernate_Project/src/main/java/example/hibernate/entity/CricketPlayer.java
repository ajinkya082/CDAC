package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CricketPlayer_Master")
public class CricketPlayer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="player_id")
	private Integer playerId;
	@Column(name="player_name" , length = 30)
	private String name;
	public CricketPlayer() {
		// TODO Auto-generated constructor stub
	}
	public CricketPlayer(Integer playerId, String name) {
		super();
		this.playerId = playerId;
		this.name = name;
	}
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CricketPlayer [playerId=" + playerId + ", name=" + name + "]";
	}

}
