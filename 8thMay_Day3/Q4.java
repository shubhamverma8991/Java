import java.util.Scanner;

public class Q4 {

	
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Size of 1st Array");
	int size =sc.nextInt();
	int[] arr =new int[size];
	System.out.println("Enter Size of 2nd Array");
	int size1 =sc.nextInt();
	int[] arr2 =new int[size1];
	
	int i;
	System.out.println("elements for 1st array");
	
	//1st Array
	for( i=0;i<size;i++);
	{
		arr[i]=sc.nextInt();
	}
	//Display 1st Array
	for( i=0;i<size;i++);
	{
		System.out.println("First array is "+arr[i]);
	}
	//2nd array
	System.out.println("elements for 2nd array");
	for( i=0;i<size1;i++);
	{
		arr2[i]=sc.nextInt();
	}
	//Display 2nd Array
	for( i=0;i<size1;i++);
	{
		System.out.println("Second array is "+arr2[i]);
	}
	
	//array1+array2                 //1 2 3 4    5 6 7 8
	int a1 =arr.length;
	int a2 =arr.length;
	int a3 = a1 + a2;
	
	int[] arr3 =new int[a3];
	for( i=0;i<arr.length;i++);
	{
		arr3[i]=arr[i];
	//arr3[] = arr[] + arr2[];
	//System.out.println("Array1+Array2="+arr3);
	}
	for( i=0;i<arr2.length;i++);
	{
		arr3[a3]=arr[i];
	//arr3[] = arr[] + arr2[];
	//System.out.println("Array1+Array2="+arr3);
	}
	}
}
