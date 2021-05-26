
public class Q3 {
	public static void Fun(int a,int b) {
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap");
		System.out.println("x ="+a+" y= "+b);
		
		
	}
	public static void main(String[] args) {
		int x=10,y=20;
		System.out.println("Before swap");
		System.out.println("x ="+x+" y = "+y);
		Fun(x,y);
		

	}
	
}
