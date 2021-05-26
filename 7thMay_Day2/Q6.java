import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		int []arr= new int[5];
		System.out.println("Enter Number for Array");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
		
		for(int i=4;i>=0;i--)
			System.out.print(arr[i]+" ");
		sc.close();
	}

}
