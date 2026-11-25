package example.hibernate.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Actor_Master")
public class Actor {
	@Id
	@Column(name="actor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer actorId;
	@Column(name="actor_name",length = 50)
	private String name;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy="actors")//Indicating this END as INVERSE side 
//	@Column(name="movie_name")
	private List<Movie> movies; 
	public Actor() {
		// TODO Auto-generated constructor stub
	}
	public Actor(Integer actorId, String name, List<Movie> movies) {
		super();
		this.actorId = actorId;
		this.name = name;
		this.movies = movies;
	}
	public Integer getActorId() {
		return actorId;
	}
	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", name=" + name + ", movies=" + movies + "]";
	}
	
}
