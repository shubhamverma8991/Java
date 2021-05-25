//A program to find greatest of three numbers using nested if-else.
public class Q15 {

	public static void main(String[] args) {
		int a=10,b=25,c=18;
		
		if(a>b && a>c)
			System.out.println(a +" is Greatest Number");
		else if(b>a && b>c)
			System.out.println(b +" is Greatest Number");
		else
			System.out.println(c +" is Greatest Number");

	}

}
