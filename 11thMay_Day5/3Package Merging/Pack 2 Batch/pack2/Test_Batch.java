package batch.pack2;

import java.util.Scanner;

import student.pack1.Student;

public class Test_Batch {

	public static void main(String[] args) {
		// Value will be given in main
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Class name");
		String clas =sc.next();
		System.out.println("Enter Time");
		String time = sc.next();
		System.out.println("Enter Strength");
		int strength = sc.nextInt();
		//From Student Class
		Student sd = new Student();
		sd.accept();
		//Calling default constructor
		Batch bat1 =new Batch ();
		System.out.println("Calling Default Constructor");
		bat1.display();
		
		Batch bat2 = new Batch();
		System.out.println("------------------------------------------------");
		System.out.println("Calling Parameterized Constructor");
		bat2.accept(clas,time, strength );
		bat2.display();
		//for Student class
		sd.setTotal_marks(100);
		sd.display();
		

	}

}
