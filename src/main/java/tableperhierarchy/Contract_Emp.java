package tableperhierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Contract_Employee")
@DiscriminatorValue(value ="C_Emp")
public class Contract_Emp extends Employee{

	@Column(name ="Pay_Per_Hour")
	private int pay_perHour ;
	
	@Column(name ="Duration")
	private String duration;
	
	
	public Contract_Emp(String name) {
		super(name);
	}


	public Contract_Emp(String name, int pay_perHour, String duration) {
		super(name);
		this.pay_perHour = pay_perHour;
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "Contrct_Emp [pay_perHour=" + pay_perHour + ", duration=" + duration + "]";
	}


	public int getPay_perHour() {
		return pay_perHour;
	}


	public void setPay_perHour(int pay_perHour) {
		this.pay_perHour = pay_perHour;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	
}
