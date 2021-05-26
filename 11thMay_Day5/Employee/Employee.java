import java.util.Scanner;

public class Employee {
	private int empid;
	private String name;
	private String add;
	private double salary;
	
	//empid
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//address
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	//salary
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println("Empid "+empid);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("Address "+add);
	}
	public void acceptinfo()
	{	Scanner sc =new Scanner(System.in);
		System.out.println("Enter Id: ");
	setEmpid(sc.nextInt());
	System.out.println("Enter Name: ");
	setName(sc.next());
	System.out.println("Enter Address");
	setAdd(sc.next());
	System.out.println("Enter Salary");
	setSalary(sc.nextDouble());
	}
}
