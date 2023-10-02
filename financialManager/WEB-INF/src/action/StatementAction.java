package action;

import java.util.*;

public class StatementAction {
	private String balance;
	
	private List<Transaction> transactions;
	
	private long acumCredito;
	private long acumDebito;

	public String getBalance() {
		
		for(int a=0; a<Transactions.getAll().size(); a++){
			if(Transactions.getAll().get(a).getNature() =="C")
				acumCredito += Transactions.getAll().get(a).getAmount();
			else
				acumDebito += Transactions.getAll().get(a).getAmount();
		}
		
		balance = String.valueOf(acumCredito - acumDebito);
		
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public long getAcumCredito() {
		return acumCredito;
	}

	public void setAcumCredito(long acumCredito) {
		this.acumCredito = acumCredito;
	}

	public long getAcumDebito() {
		return acumDebito;
	}

	public void setAcumDebito(long acumDebito) {
		this.acumDebito = acumDebito;
	}
	
	
	public String execute(){
		setTransactions(Transactions.getAll());		
		
		return "success";
	}
	
}
