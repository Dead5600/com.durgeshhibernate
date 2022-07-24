package manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Movie_ID")
	private int id;
	
	@Column(name = "Movie_Name")
	private String name;
	
	@Column(name ="Releasing_Year")
	private int year;
	
	@ManyToMany(mappedBy = "movie")
	private List<Actor> actor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Actor> getActor() {
		return actor;
	}

	public void setActor(List<Actor> actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", year=" + year + ", actor=" + actor + "]";
	}

	public Movie(String name, int year, List<Actor> actor) {
		super();
		this.name = name;
		this.year = year;
		this.actor = actor;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
