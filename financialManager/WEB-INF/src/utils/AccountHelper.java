package utils;

import action.Transactions;

public class AccountHelper {

	private static long acumCredito;
	private static long acumDebito;
	
	public static long getBalance() {

		for (int a = 0; a < Transactions.getAll().size(); a++) {
			if (Transactions.getAll().get(a).getNature() == "C")
				acumCredito += Transactions.getAll().get(a).getAmount();
			else
				acumDebito += Transactions.getAll().get(a).getAmount();
		}
		return acumCredito - acumDebito;	
	}
}
