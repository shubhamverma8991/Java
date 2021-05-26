import java.util.Arrays;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		int i;
		int []arr= new int[5];
		System.out.println("Enter Number for Array");
		Scanner sc =new Scanner(System.in);
		for(i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();}
		
		System.out.println("Array is");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
			System.out.println();
		Arrays.sort(arr);
		System.out.println("Minimum =" + arr[0]);
		System.out.println("Maximum =" + arr[arr.length-1]);
		
		sc.close();
	}

}
