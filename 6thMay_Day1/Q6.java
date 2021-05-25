//Program to Find Factorial of a given number.
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		int a,i,fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		a=sc.nextInt();
		
		 for(i=1;i<=a;i++)
		 {
			 fact =fact * i;
		 }
	System.out.println("factorial of "+a+" is "+fact);
	sc.close();
	}

}
