import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		int num,i;
		int even=0,odd=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number ");
		num=sc.nextInt();
		
		//num=100
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
				even = even + i;
			else
				odd = odd + i;
		}
		System.out.println("Sum of Even Numbers are "+even);
		System.out.println("Sum of Odd Numbers are "+odd);
		sc.close();

	}

}
