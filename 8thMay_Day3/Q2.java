import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of 2D array in m * n manner");
		int Size = sc.nextInt();
		int Size1 = sc.nextInt();
		int[] []arr = new int[Size][Size1];
		System.out.println("Enter Elemnts of Array");
		//Input value from user
		for(int i=0;i<Size;i++)
		{
			for(int j=0;j<Size1;j++)
				arr[i][j]= sc.nextInt();
		}
		
		//To Print
		for(int i=0;i<Size;i++)
		{
			for(int j=0;j<Size1;j++)
			{
			System.out.print(arr[i][j]+" ");
		
			}
		System.out.println( );
		}
	sc.close();	
	}

}
