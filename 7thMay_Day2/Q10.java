import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc=  new Scanner (System.in);
		System.out.println("Enter Basic Salary");
		double bsal =sc.nextDouble();
		
		if(bsal<=10000)
		{
			double Total = bsal + 0.2 * bsal + 0.8*bsal;
			System.out.println("Gross Salary of Employee is "+Total);
		}
		else if(bsal<=20000)
		{
			double Total = bsal + 0.25 * bsal + 0.9*bsal;
			System.out.println("Gross Salary of Employee is "+Total);
		}
		else {
			double Total = bsal + 0.3 * bsal + 0.95*bsal;
		System.out.println("Gross Salary of Employee is "+Total);
		}
	}

}
