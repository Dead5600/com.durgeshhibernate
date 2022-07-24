package hibercache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name =" Teacher_Info")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Teacher_ID")
	private int id;
	
	@Column(name =" Teache_name")
	private String name;
	
	@Column(name ="Subject")
	private String subject;
	
	@Column(name ="Experience")
	private String exp;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher( String name, String subject, String exp) {
		super();
		
		this.name = name;
		this.subject = subject;
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + ", exp=" + exp + "]";
	}
	
	
	
}
