
import java.util.Scanner;

public class Q1_1 {
		private int date;
		private String month;
		private int year;
		
	// Getting Data from User
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date");
		date=sc.nextInt();
		
		System.out.println("Enter Month");
		month=sc.next();
		
		System.out.println("Enter Year");
		year=sc.nextInt();
		
		sc.close();
		
	}
	// Displaying Data
	public  void display()
	{
		System.out.println("Today is ");
		System.out.println(date+" "+month+" "+year);
		System.out.println("Use mask and Sanatizer");
	}
	
}
