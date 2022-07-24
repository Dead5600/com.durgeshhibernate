package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Bike_Id")
	private int id;
	
	@Column(name= "bike_name")
	private String name;
	
	@Column(name="Company")
	private String company;
	
	@Column(name= " Type")
	private String type;
	
	
	private Cars car; 
	
	
	
	public Cars getCar() {
		return car;
	}


	public void setCar(Cars car) {
		this.car = car;
	}


	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bike( String name, String company, String type) {
		super();
		
		this.name = name;
		this.company = company;
		this.type = type;
	}


	/*
	 * public int getId() { return id; }
	 * 
	 * 
	 * public void setId(int id) { id = id; }
	 */

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", company=" + company + ", type=" + type + ", car=" + car + "]";
	}


	
}
