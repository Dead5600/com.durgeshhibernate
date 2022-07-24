package onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Courses {
	
	@Id
	@Column(name = " Course_ID" , length = 20)
	private  int C_Id;
	
	@Column(name = "Course_Name" , length = 50)
	private String C_name;
	
	@ManyToOne
	private Institute Ins ;

	@Override
	public String toString() {
		return "Courses [C_Id=" + C_Id + ", C_name=" + C_name + ", Ins=" + Ins + "]";
	}

	public int getC_Id() {
		return C_Id;
	}

	public void setC_Id(int c_Id) {
		C_Id = c_Id;
	}

	public String getC_name() {
		return C_name;
	}

	public void setC_name(String c_name) {
		C_name = c_name;
	}

	public Institute getIns() {
		return Ins;
	}

	public void setIns(Institute ins) {
		Ins = ins;
	}

	public Courses(int c_Id, String c_name, Institute ins) {
		super();
		C_Id = c_Id;
		C_name = c_name;
		Ins = ins;
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
