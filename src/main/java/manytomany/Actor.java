package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity

public class Actor {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "Actor_Id")
private int  id;

@Column(name = "Actor_Name")
private String name;

@Column(name ="CITY")
private String city;

@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "Cinema" ,joinColumns = {@JoinColumn(name = "AC_ID")}, inverseJoinColumns = {@JoinColumn(name ="MO_ID")})
private  List<Movie> movie;
public Actor() {
	super();
	// TODO Auto-generated constructor stub
}

public Actor( String name, String city, List<Movie> movie) {
	super();
	
	this.name = name;
	this.city = city;
	this.movie = movie;
}

@Override
public String toString() {
	return "Actor [id=" + id + ", name=" + name + ", city=" + city + ", movie=" + movie + "]";
}

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

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public List<Movie> getMovie() {
	return movie;
}

public void setMovie(List<Movie> movie) {
	this.movie = movie;
}
	
	
}
