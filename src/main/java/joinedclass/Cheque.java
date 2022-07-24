package joinedclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name ="CHEQUE")
@PrimaryKeyJoinColumn(name = "P_id")
public class Cheque extends Payment {

	@Column(name ="Cheque_No")
	int cheque_no ;
	
	@Column(name = "Cheque_Type")
	String cheque_type;

	public int getCheque_no() {
		return cheque_no;
	}

	public void setCheque_no(int cheque_no) {
		this.cheque_no = cheque_no;
	}

	public String getCheque_type() {
		return cheque_type;
	}

	public void setCheque_type(String cheque_type) {
		this.cheque_type = cheque_type;
	}

	@Override
	public String toString() {
		return "Cheque [cheque_no=" + cheque_no + ", cheque_type=" + cheque_type + "]";
	}

	public Cheque(int cheque_no, String cheque_type) {
		super();
		this.cheque_no = cheque_no;
		this.cheque_type = cheque_type;
	}

	public Cheque() {
		super();
	}
	
	
}
