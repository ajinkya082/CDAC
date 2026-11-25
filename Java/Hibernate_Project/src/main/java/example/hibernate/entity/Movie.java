package example.hibernate.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Movie_Master")
public class Movie {//this END is OWNING side
	@Id
	@Column(name="movie_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movieId;
	@Column(name="movie_title" , length = 50)
	private String title;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="Movies_Actors",
			joinColumns = {@JoinColumn(name="movie_id")},
			inverseJoinColumns = {@JoinColumn(name="actor_id")}
			
	)
	private List<Actor>actors;
	public Movie() {
		//TODO Auto-generated constructor stub
	}
	public Movie(Integer movieId, String title, List<Actor> actors) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.actors = actors;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Actor> getActors() {
		return actors;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
		for(Actor currentActor:actors) {
			currentActor.getMovies().add(this);//setting both end of the association
		}
	}
	public void addActor(Actor actor) {
		actors.add(actor);
		actor.getMovies().add(this);//setting other end of the association
	}
	
	
}
