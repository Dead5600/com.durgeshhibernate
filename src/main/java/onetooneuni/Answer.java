package onetooneuni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	@Column(name ="Answer_Id")
	private int id;
	
	private String Answer;

	@Override
	public String toString() {
		return "Answer [id=" + id + ", Answer=" + Answer + "]";
	}

	public Answer(int id, String answer) {
		super();
		this.id = id;
		Answer = answer;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}
	
	
}
