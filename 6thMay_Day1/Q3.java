//Find the compound amount and compound interest on the principal Rs.20,000 borrowed at 6% compounded annually for 3 years.

public class Q3 {

	public static void main(String[] args) {
		double amount;double rate = 6; double prin=20000; int n=1; int time=3;
		amount = prin * Math.pow(1 + ((rate/100) / n), n * time);
		System.out.println("Interest :"+ (amount-prin));
		System.out.println("Total Amount :" + (amount));	
	}

}
