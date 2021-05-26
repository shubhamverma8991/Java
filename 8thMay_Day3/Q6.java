import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int a,i;
	System.out.println("Enter the Elements Number");
	a=sc.nextInt();
	int [] arr = new int[a];
	//Take Data 
	System.out.println("Enter the Elements");
	for(i=0;i<a;i++)
	{
		arr[i]=sc.nextInt();
	}
	//print
	System.out.println("Your Entered Elemnets are :");
	for(i=0;i<a;i++)
	{
	System.out.println(arr[i]);
	Arrays.sort(arr);
	}
	//sorting
	System.out.println("Sorted Array"+Arrays.toString(arr));
	sc.close();
	
	}

}
