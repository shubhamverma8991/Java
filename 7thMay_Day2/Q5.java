import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		int []arr= new int[5];
		System.out.println("Enter Number for Array");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		sc.close();
	}

}
