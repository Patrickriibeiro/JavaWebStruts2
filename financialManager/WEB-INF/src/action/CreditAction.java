package action;

import java.util.Date;

public class CreditAction {
	
	private long amount;
	private Transaction transaction;

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public String execute(){
		this.transaction = new Transaction(new Date(), "C", this.amount);
		Transactions.add(transaction);
		return "success";
	}
}
