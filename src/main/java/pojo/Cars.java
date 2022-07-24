package pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Cars {
	
	private String car_name;
	private String car_company;
	private int model;
		
	@Override
	public String toString() {
		return "Cars [car_name=" + car_name + ", car_company=" + car_company + ", model=" + model + "]";
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public String getCar_company() {
		return car_company;
	}

	public void setCar_company(String car_company) {
		this.car_company = car_company;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cars(String car_name, String car_company, int model) {
		super();
		this.car_name = car_name;
		this.car_company = car_company;
		this.model = model;
	}
	
	
}
