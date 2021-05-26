import java.util.Scanner;

//Consider that payroll software needs to be developed for computerization of
//operations of an ABC organization. The organization has employees.
public class Q3_1 {
	private int empid;
	private String name;
	private double bs;
	private double hra;
	private double meds;
	private double pf;
	private double pt;
	private double net_sal;
	private double gross_sal;
	
//Accept Employee Details
public void accept()
{
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter Employee Id");
	empid=sc.nextInt();
	
	System.out.println("Enter Employee Name");
	name= sc.next();
	
	System.out.println("Enter Basic Salary");
	bs=sc.nextDouble();
	
	System.out.println("Enter Medical Expenses");
	meds=sc.nextDouble();
	sc.close();
}
// Display details
public void display()
{
	System.out.println("Details of Employee");
	System.out.println("Name "+name+" Employee Id "+empid);
	System.out.println("Basic Salary is"+bs);
	
	hra = 0.5 * bs;
	gross_sal = bs + hra + meds;
	System.out.println("Gross Salary "+gross_sal);
	
	pf = 0.12 * bs;
	pt=200;
	net_sal = gross_sal - (pt+pf);
	System.out.println("Net Salary "+net_sal);
}

}