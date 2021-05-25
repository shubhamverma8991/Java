public class Q3 {

	public static void main(String[] args) {
		double amount;double rate = 6; double prin=20000; int n=1; int time=3;
		amount = prin * Math.pow(1 + ((rate/100) / n), n * time);
		System.out.println("Interest :"+ (amount-prin));
		System.out.println("Total Amount :" + (amount));	
	}

}
