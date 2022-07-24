package pojo;



public class Bank {
	
	private int bank_Id;
	private String bank_Name;
	private long account_No;
		
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank( String bank_Name, long account_No) {
		super();
		
		this.bank_Name = bank_Name;
		this.account_No = account_No;
	}

	@Override
	public String toString() {
		return "Bank [bank_Id=" + bank_Id + ", bank_Name=" + bank_Name + ", account_No=" + account_No + "]";
	}

    public int getBank_Id() {
		return bank_Id;
	}

	public void setBank_Id(int bank_Id) {
		this.bank_Id = bank_Id;
	}

	public String getBank_Name() {
		return bank_Name;
	}

	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}

	public long getAccount_No() {
		return account_No;
	}

	public void setAccount_No(long account_No) {
		this.account_No = account_No;
	}
	
	
	
}
