import java.util.Scanner;

public class Customer {
	
	private String name;
	private int age;
	private String email;
	private double credit_limit;
	
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

	public void setCredit_limit (double credit )
	{
		 credit_limit = credit;		
	}
	
	public double getCredit_limit()
	{
		return credit_limit;
	}

	public void accept() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name ");
		name = sc.next();
		System.out.println("Enter Age");
		age = sc.nextInt();
		System.out.println("Enter Email");
		email = sc.next();
		System.out.println("Enter Credit Limit");
		credit_limit = sc.nextDouble();
//		
//		System.out.println("Enter Name ");
//		setName(sc.next());
//		System.out.println("Enter Age");
//		setAge( sc.nextInt());
//		
//		System.out.println("Enter Email");
//		setEmail(sc.next());
//		System.out.println("Enter Credit Limit");
//		setCredit_limit(sc.nextDouble());
	}

	public void display()
	{
		System.out.println("\n--------------------------------------------");
		System.out.println("Name "+name);
		System.out.println("Credit Limit "+credit_limit);
		System.out.println("Age "+age);
	}
}

