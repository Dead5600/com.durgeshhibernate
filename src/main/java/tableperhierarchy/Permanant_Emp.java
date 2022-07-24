package tableperhierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Permanant_Employee")
@DiscriminatorValue(value ="P_Emp")
public class Permanant_Emp extends Employee {
	
	@Column(name= "SALARY")
	private int salary;
	
	@Column(name = "BONUS")	
	private int Bonus;

	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getBonus() {
		return Bonus;
	}
	
	public void setBonus(int bonus) {
		Bonus = bonus;
	}

	

	public Permanant_Emp(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Permanant_Emp(String name, int salary, int bonus) {
		super(name);
		this.salary = salary;
		Bonus = bonus;
	}

	@Override
	public String toString() {
		return "Permanant_Emp [salary=" + salary + ", Bonus=" + Bonus + "]";
	}

	

}
