package onetooneuni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Questions {

	@Id
	@Column(name ="Question_Id")
	private int id;
	
	private String Question;
	
	@OneToOne
	Answer ans;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}

	public Questions(int id, String question, Answer ans) {
		super();
		this.id = id;
		Question = question;
		this.ans = ans;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", Question=" + Question + ", ans=" + ans + "]";
	}
	
}
