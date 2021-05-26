import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Customer cus = new Customer();
		System.out.println("Enter details for customer 1:");
		cus.accept();
		cus.display();
		
		System.out.println("\nEnter details for customer 2:");
		Customer cus2 = new Customer();
		cus2.accept();
		cus2.display();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter New Credit Limit");
		int newamount = sc.nextInt();
		cus2.setCredit_limit(newamount);
		cus2.display();
	}

}
