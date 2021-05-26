import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] []arr = new int[3][3];
		int[] []arr2 = new int[3][3];
		int[] []arr3 = new int[3][3];
		
		//Input value of 1st Array from user
		System.out.println("Enter Elemnts of Array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				arr[i][j]= sc.nextInt();
		}
		//To Print
		System.out.println("1st 2D Array");
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
					System.out.print(arr[i][j]+" ");
				
					}
				System.out.println( );
				}
		
		//Input value of 2nd Array from user
		System.out.println("Enter Elemnts of 2nd Array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				arr2[i][j]= sc.nextInt();
		}
		//To Print
		System.out.println("2nd 2D Array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(arr2[i][j]+" ");
		
			}
		System.out.println( );
		}

		//addition of both array
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				arr3[i][j]= arr[i][j] +arr2[i][j];
		}
		
		//To Print
		System.out.println("Sum of Both Array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(arr3[i][j]+" ");
		
			}
		System.out.println( );
		}
	sc.close();	
	}

}
