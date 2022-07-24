package joinedclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="CARD")
@PrimaryKeyJoinColumn(name = "P_id")
public class Card extends Payment {

	@Column(name = "Card_No")
	int card_No;
	
	@Column(name = "Card_Type")
	String card_type;

	public int getCard_No() {
		return card_No;
	}

	public void setCard_No(int card_No) {
		this.card_No = card_No;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	@Override
	public String toString() {
		return "Card [card_No=" + card_No + ", card_type=" + card_type + "]";
	}

	public Card(int card_No, String card_type) {
		super();
		this.card_No = card_No;
		this.card_type = card_type;
	}

	public Card() {
		super();
	}
	
	
}
