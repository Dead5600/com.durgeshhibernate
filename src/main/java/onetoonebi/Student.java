package onetoonebi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	 
	@Id
	@Column(name ="Std_Id",length = 20)
	private int Student_Id;
	
	@Column(name = "Std_name",length = 50)
	private String Student_name;
	
	private String city;
	
	@OneToOne
	private College clg;

	public int getStudent_Id() {
		return Student_Id;
	}

	public void setStudent_Id(int student_Id) {
		Student_Id = student_Id;
	}

	public String getStudent_name() {
		return Student_name;
	}

	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public College getClg() {
		return clg;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int student_Id, String student_name, String city, College clg) {
		super();
		Student_Id = student_Id;
		Student_name = student_name;
		this.city = city;
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Student [Student_Id=" + Student_Id + ", Student_name=" + Student_name + ", city=" + city + ", clg="
				+ clg + "]";
	}

}
