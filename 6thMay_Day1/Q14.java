import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		
		int num,c,a,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		num= sc.nextInt();
		c=num;
		while(num!=0)
		{
			a=num % 10;
			b=(int) (b+Math.pow(a, 3));
			num = num/10;
		}
		if(b==c)
			System.out.println("Numbr is Armstrong Number");
		else
			System.out.println("Numbr is Not Armstrong Number");
	}

}