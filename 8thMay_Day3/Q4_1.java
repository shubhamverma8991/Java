
public class Q4_1 {
	public static void sum(int...a )
	{	System.out.println("Size "+a.length);
		int sum = 0;
		for (int i = 0; i<a.length;i++)
		{
				sum = sum + a[i];
				
		}
		System.out.println("Sum "+sum);
	}	
	public static void main(String[] args) {
		
		sum(1,2,3,4,5);
	}

}
