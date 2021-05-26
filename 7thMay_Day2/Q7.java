import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		int i;
		int []arr= new int[5];
		System.out.println("Enter Number for Array");
		Scanner sc =new Scanner(System.in);
		//Nunber from user
		for(i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
		// printing array
		System.out.println("Array is");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
			System.out.println("Enter Number to find in Array");
			
			int j=sc.nextInt();
			for ( i = 0;i<arr.length;i++)
			{
				if (arr[i]==j)
				{
					System.out.println("Number is Present Inside the array");
					break;
				}
				else
				{
					System.out.println("Number is not Present");
					break;
				}
			}
		sc.close();
	}
	
		
}
