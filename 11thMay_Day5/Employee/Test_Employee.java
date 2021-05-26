
import java.util.Scanner;

public class Test_Employee {

	public static void main(String[] args) {
		Employee[] Emp= new Employee[5];

		Scanner sc= new Scanner (System.in);
		for(int i=0; i<Emp.length; i++)
		{	
			Emp[i]= new Employee();
			System.out.println("");
			System.out.println("Enter Employee details: ");
			Emp[i].acceptinfo();
		}
		for(int i=0; i<Emp.length; i++)
		{
			System.out.println("—————————————————————————————————");
			System.out.println("Employee "+(i+1)+"...");
			System.out.println("");
			Emp[i].display();
		}
		
		System.out.println("Employees with 20000+ Salary... ");
		for(int i=0; i<Emp.length; i++)
		{	
			if(Emp[i].getSalary()>20000)
			{
				System.out.println(Emp[i].getEmpid()+"\t"+Emp[i].getName());
				System.out.println("");
		sc.close();
			}
		}

	}

}
