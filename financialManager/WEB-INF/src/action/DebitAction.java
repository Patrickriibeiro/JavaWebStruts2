package action;

import java.util.Date;

public class DebitAction {
	
	private long amount;
	
	private Transaction transaction;

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	public String execute(){
		transaction = new Transaction(new Date(), "D", this.amount);
		Transactions.add(transaction);
		return "success";
	}
}
