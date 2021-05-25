import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		int n,i,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number ");
		n= sc.nextInt();
		for(i=1;i<=n;++i)
		{
			sum= sum + i;
		}
		System.out.println("Sum of Number upto "+n+" is "+sum);
		sc.close();
	}
	
}
