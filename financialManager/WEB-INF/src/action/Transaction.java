package action;

import java.util.Date;

public class Transaction {
	private int id;
	private Date date;
	private String nature;
	private long amount;

	public Transaction() {
	}

	public Transaction(Date date, String nature, long amount) {
		this.date = date;
		this.nature = nature;
		this.amount = amount;
	}

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
}
