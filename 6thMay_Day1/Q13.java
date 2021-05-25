import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,counter;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number ");
		n=sc.nextInt();
		      
		for(i=2;i<=n;i++)
		   { counter=0;    
		    for(j=2;j<=i;j++)
		          
		      if(i%j==0)
		    	  counter++;
		   
		    if (counter==1)
		    	System.out.println(i+" ");
		   }
		sc.close(); 
	}
	

}
	
