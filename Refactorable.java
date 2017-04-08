package refactoring;

public class Refactorable {

	private MyCollection _orders = new MyCollection();
	private String _name = "Customer Name";
	
	void printOwing(){
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		
		printBanner();
		
		// Calculate outstanding 
		while(e.hasMoreElements()){
			Order each = (order) e.nextElement();
			outstanding += each.getAmount();
		}
		
		// Print Details
		System.out.println("name: " + _name);
		System.out.println("amount: " + outstanding);
	}

	private void printBanner() {
		// print banner
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");
	}
}
