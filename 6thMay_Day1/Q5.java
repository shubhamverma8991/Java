//Program to Swap Two Numbers.
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		double a,b,temp;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First Number");
		a=sc.nextDouble();
		System.out.print("Enter Second Number");
		b=sc.nextDouble();
		
		temp=a;
		a=b;
		b=temp;
		System.out.println(" Swaped Numbers are ");
		System.out.println("a = " +a );
		System.out.println("b = "+b);
		sc.close();
	}

}
