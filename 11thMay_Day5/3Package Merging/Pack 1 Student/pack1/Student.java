package student.pack1;
// code without using constructor
import java.util.Scanner;

public class Student {
	public int rollno;
	public String name;
	private String grade;
	public Double marks;
	public Double total_marks;
	
	
	public void setTotal_marks(double total)
	{
		total_marks = total;
	}
	
	public Double getTotal_marks()
	{
		return total_marks;
	}
	private String calgrade(double marks) //helper Method to call grade
	{
		if(marks>80)
		{
			grade="A";
		}
		else if(marks<=80 && marks>=60)
		{
			grade="B";
		}
		else
			grade ="C";
		
		return grade;
	}
	public void accept()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Rollno");
		rollno =sc.nextInt();
		System.out.println("Marks");
		marks=sc.nextDouble();
	}
	
	public void display()
	{
		System.out.println("Roll no "+rollno);
		System.out.println("Name "+name);
		System.out.println("Marks "+marks);
		System.out.println("Grade"+calgrade(marks));
		
		
	}
}
