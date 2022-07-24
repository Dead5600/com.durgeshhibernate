package onetoonebi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class College {
	
	@Id
	@Column(name = "Clg_ID",length = 20)
	private int college_Id;
	
	@Column(name ="Clg_Name",length = 50)
	private String college_Name;
	
	private String grade;
	
	@OneToOne
	private Student std;

	@Override
	public String toString() {
		return "College [college_Id=" + college_Id + ", college_Name=" + college_Name + ", grade=" + grade + ", std="
				+ std + "]";
	}

	public College(int college_Id, String college_Name, String grade, Student std) {
		super();
		this.college_Id = college_Id;
		this.college_Name = college_Name;
		this.grade = grade;
		this.std = std;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCollege_Id() {
		return college_Id;
	}

	public void setCollege_Id(int college_Id) {
		this.college_Id = college_Id;
	}

	public String getCollege_Name() {
		return college_Name;
	}

	public void setCollege_Name(String college_Name) {
		this.college_Name = college_Name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
		this.std = std;
	}
	

}
