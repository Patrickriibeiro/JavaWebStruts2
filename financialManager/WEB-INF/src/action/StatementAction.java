package action;

import java.util.*;

import utils.AccountHelper;

public class StatementAction {

	private List<Transaction> transactions;

	public long getBalance() {
		return AccountHelper.getBalance();

	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public String execute() {
		setTransactions(Transactions.getAll());

		return "success";
	}

}
