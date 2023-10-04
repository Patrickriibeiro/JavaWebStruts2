package action;

import java.util.Date;

public class Transaction {
	
	public Transaction(){}
	
	public Transaction(Date _date, String _nature, long _amount, String _document){
		this.date = _date;
		this.nature = _nature;
		this.amount = _amount;
		this.document = _document;
	}
	
	private int id;
	private Date date;
	private String nature;
	private long amount;
	private String document;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
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
