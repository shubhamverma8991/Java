//Check if Number is Prime Number or Not.
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m=0,flag=0,n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number to Check Whether its Prime or Not ");
		n=sc.nextInt();
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=m;i++)
		   {      
		    if(n%i==0)
		    {      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }
		  sc.close();
	}

}
	
