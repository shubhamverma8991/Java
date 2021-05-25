import java.util.Scanner;

public class Q_10 {

	public static void main(String[] args) {
		int a,c,newn =0;
		int b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to Check wheather it's Palidrome or Not :");
		a=sc.nextInt();
		c=a;
		while(a>0) 
		{ 
		b = a%10;
		newn = (newn*10)+b;
		a=a/10;
		
		}
		
		if(c==newn)
		System.out.println(c + " is Palidrome Number");
		else
			System.out.println(c + " is Not a Palidrome Number");
		sc.close();	

	}

}
