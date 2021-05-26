import java.util.Scanner;

public class TestCust {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Email");
		String email =sc.next();
		System.out.println("Enter Age");
		int age =sc.nextInt();
		
		Cust c1 = new Cust();
		
		c1.display();
		Cust c2 =new Cust(name, email, age);
		
		c2.display();
		
		
		
		
	}
}
