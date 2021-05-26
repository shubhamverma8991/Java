import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int Rollno=0;
		Double s1;
		Double s2;		
		Double s3;
		Double s4;
		Double s5;
		String name;
		char grade;
		System.out.println("Enter the Details");
		Scanner sc =new Scanner(System.in);
		System.out.println("Student Roll no");
		Rollno= sc.nextInt();
		System.out.println("Student Name");
		name = sc.next();
		System.out.println("English Marks");
		s1 = sc.nextDouble();
		System.out.println("Science Marks");
		s2 = sc.nextDouble();
		System.out.println("Social Marks");
		s3 = sc.nextDouble();
		System.out.println("Hindi Marks");
		s4 = sc.nextDouble();
		System.out.println("Maths Marks");
		s5 = sc.nextDouble();
		double total = s1+s2+s3+s4+s5;
		double per = (total/500)*100;
		if(per>75)
			 grade ='A';
		else if (per>60)
			 grade ='B';
		else
			 grade ='C';
		System.out.println("Name of Student "+name+" Roll no is "+Rollno);
		System.out.println("Total Marks "+total);
		System.out.println("Percentage :"+per+" Grade is "+grade);
		sc.close();
		
	}

}
