package tableperclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Regular_Employee")
//@AttributeOverrides({
	//@AttributeOverride(name = "id" , column = @Column(name ="Emp_Id")) ,
	//@AttributeOverride(name = "name" , column = @Column(name = "Emp_Name"))})
public class Reg_Emp extends Employee {

	@Column(name ="SALARY")
	private int salary;
	
	@Column(name ="Bonus")
	private int bonus;

	@Override
	public String toString() {
		return "Reg_Emp [salary=" + salary + ", bonus=" + bonus + "]";
	}

	public Reg_Emp(String name, int salary, int bonus) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}

	public Reg_Emp() {
		super();
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	
}
