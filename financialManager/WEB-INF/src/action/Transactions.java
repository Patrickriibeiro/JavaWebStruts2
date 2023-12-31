package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class Transactions {
	
private static Map<String, Object> session = ActionContext.getContext().getSession();
	
	private static List<Transaction> _transactions;
	
	public Transactions(){
		
	}

	@SuppressWarnings("unchecked")
	public static List<Transaction> getAll() {
		if(_transactions == null){
			_transactions = new ArrayList<Transaction>();
		}else{
			_transactions = (List<Transaction>) session.get("Transactions");
		}
		return _transactions;
	}

	public static void setAll(List<Transaction> all) {
		session.put("Transactions", all);
	}
	
	public static void add(Transaction transaction)  {
		getAll();
		_transactions.add(transaction);
		setAll(_transactions);
	//	throw new DefaulException("Error message"); throws DefaulException
	}
}
