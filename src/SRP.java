
class Invoice {

	private double amount;

	public Invoice(double amount) {
		this.amount = amount;
	}

	public double calculateTax() {
		return amount * 0.15;
	}

	public double calculateTotal() {
		return amount + calculateTax();
	}

	public void printInvoice() {
		System.out.println("Invoice Amount: " + calculateTotal());
	}

}

class InvoicePrinter {
	public void print(Invoice invoice) {
		System.out.println("Invoice Amount: " + invoice.calculateTotal());
	}
}

public class SRP {
	public static void main(String[] args) {
		
		
	Invoice invoice=new Invoice(100);
	InvoicePrinter printer= new InvoicePrinter();
	printer.print(invoice);
		
	}

}
