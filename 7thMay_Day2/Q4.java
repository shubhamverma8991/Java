
public class Q4 {
	public static void add1 (int x , int y) {
		int res = x+y ;
		System.out.println("Add:"+res);
	}
	public static void add1 (double c , int y) {
		double res = c+y ;
		System.out.println("Add:"+res);
	}
	public static void add1 (int x , double c) {
		double res = x+c ;
		System.out.println("Add:"+res);
	}
	
	public static void main(String[] args) {
		int a=10,b=20;
		double c =55.5;
		add1 (a, b);
		add1(c,b);
		add1(a,c);
		
		
		

	}

}
