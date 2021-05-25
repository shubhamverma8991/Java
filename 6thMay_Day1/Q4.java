//A program to calculate power of a number.
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);

		double m,result;int n;
		System.out.println("Enter Base:");
		m=sc.nextDouble();
		result=m;
		System.out.println("Enter Power:");
		n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			result=result*m;
		}
		System.out.println("result is:"+result);
				
	}

}
