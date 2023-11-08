package utils;

import action.Transactions;

public class AccountHelper {

	private static long balance;
	private static long acumCredito;
	private static long acumDebito;
	
	public static void calculate(){
		
		acumCredito = 0;
		acumDebito = 0;
		
		for(int a=0; a<Transactions.getAll().size(); a++){
			if(Transactions.getAll().get(a).getNature() =="C")
				acumCredito += Transactions.getAll().get(a).getAmount();
			else
				acumDebito += Transactions.getAll().get(a).getAmount();
		}
		
		balance = acumCredito - acumDebito;	
	}
	
	public static long getBalance(){
		return balance;		
	}
}
