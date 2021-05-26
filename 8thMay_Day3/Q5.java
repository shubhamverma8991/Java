import java.util.Scanner;

public class Q5{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a,b,c,i;
		System.out.println("Enter Number of Elements for array 1");
		a=sc.nextInt();
		
		System.out.println("Enter Number of Elements for array 2");
		b=sc.nextInt();
		c = a+b;
		
		int [] arr = new int[a];
		int [] arr2 = new int[b];
		int[] merge = new int[c];
		
		//1st Array
		System.out.println("Enter Array1 Value");
		 for (i=0;i<a;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		  //2nd Array
		 System.out.println("Enter Array2 Value");
		 for (i=0;i<b;i++)
		 {
			 arr2[i]=sc.nextInt();
		 } 
		 
		 //3rd Array i.e 1st + 2nd Array
		 for (i=0;i<a;i++)
		 {
			 merge[i]=arr[i];
		 }
		 for(i=0;i<b;i++)
		 {
			 merge[a]=arr2[i];
			 a++;
		 }

		 //Print Merge Array
		 System.out.println("Merge Array is:");
		 for(i = 0;i<c;i++)
		 {
			 System.out.print(merge[i]+ " ");
		 }
		 sc.close();	
		
	}

}
