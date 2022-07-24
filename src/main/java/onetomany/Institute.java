package onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Institute {
	
	@Id
	@Column(name = "Institute_Id", length = 20)
	private int Inst_ID;
	
	@Column(name = "Institute_Name", length = 50)
	private String name;
	
	//  By default in mapping the fetching is lazy loading , if we have to get data at the time of loading then change fetch type to 'EAGER' 
	// it will give you data at the loading time.
	
	@OneToMany(mappedBy = "Ins" , fetch = FetchType.EAGER)
	Set <Courses> courses = new HashSet<Courses>();

	public int getInst_ID() {
		return Inst_ID;
	}

	public void setInst_ID(int inst_ID) {
		Inst_ID = inst_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Courses> getCourses() {
		return courses;
	}

	public void setCourses(Set<Courses> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Institute [Inst_ID=" + Inst_ID + ", name=" + name + ", courses=" + courses + "]";
	}

	public Institute(int inst_ID, String name, Set<Courses> courses) {
		super();
		Inst_ID = inst_ID;
		this.name = name;
		this.courses = courses;
	}

	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
