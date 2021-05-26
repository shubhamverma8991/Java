import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Lenght of String");
		int Size=sc.nextInt();
		String [] arr = new String[Size];
		int i;
		System.out.println("Enter String Value");
		 for (i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.next();
		 }
		 
		 for(i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
			 
		 }
		 System.out.println("String After Upper Case");
		 for(i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i].toUpperCase());
			 
		 }
		 
		 
		 sc.close();
		
		
		
		
		
	}

}
