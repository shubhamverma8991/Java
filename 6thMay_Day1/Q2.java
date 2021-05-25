//program to adddition of two numbers also addition of two characters.
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		double a,b,ans,ansd;
		String c,d,ansc;
		//Scanner is used for reading Information from user
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Number 1 :");
		a=sc.nextDouble();
		System.out.println("Enter Number 2 :");
		b=sc.nextDouble();
		ans=a+b;
		System.out.println("Addition of Both Numbers are : "+ans);
		
		System.out.println("Enter Character 1");
		c=sc.next();
		System.out.println("Enter Character 2");
		d=sc.next();
		ansc=c+d;
		ansd='c'+'d';
		System.out.println("Addition of Both Chracters are :"+ansc +ansd);
		sc.close();
		
	}

}
