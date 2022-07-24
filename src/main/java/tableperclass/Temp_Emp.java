package tableperclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = " Tempoarary_Enmployee")
//@AttributeOverrides({
//	@AttributeOverride (name ="id" ,column = @Column(name ="Emp_Id")) ,
//	@AttributeOverride (name ="name" , column = @Column(name = "Emp_Name"))})
public class Temp_Emp extends Employee {
	
	@Column(name = "Pay_per_Hour")
	private int pay_per_Hour;
	
	@Column(name = "Duration")
	private String duration;

	@Override
	public String toString() {
		return "Temp_Emp [pay_per_Hour=" + pay_per_Hour + ", duration=" + duration + "]";
	}

	public int getPay_per_Hour() {
		return pay_per_Hour;
	}

	public void setPay_per_Hour(int pay_per_Hour) {
		this.pay_per_Hour = pay_per_Hour;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Temp_Emp(String name, int pay_per_Hour, String duration) {
		super(name);
		this.pay_per_Hour = pay_per_Hour;
		this.duration = duration;
	}

	public Temp_Emp() {
		super();
	}
	
	
}
