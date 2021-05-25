import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		
		int num,c,a,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		num= sc.nextInt();
		c=num;
		while(num!=0)
		{
			a=num % 10;
			b=(b*10)+a;
			num = num/10;
		}
		System.out.println("Reverse of "+c+" is "+b);
	}

}
