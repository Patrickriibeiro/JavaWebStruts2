package action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import exception.DefaulException;

public class CreditAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long amount;
	private String document;
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
	
	public String execute() {
		try {
			this.transaction = new Transaction(new Date(), "C", this.amount,this.document);
			Transactions.add(this.transaction);
			return "success";
		} catch (DefaulException e) {
			return "error";
		}
	}

	/**
	 * @return the document
	 */
	public String getDocument() {
		return document;
	}

	/**
	 * @param document the document to set
	 */
	public void setDocument(String document) {
		this.document = document;
	}


}