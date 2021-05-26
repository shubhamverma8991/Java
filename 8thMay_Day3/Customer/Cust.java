import java.util.Scanner;

public class Cust {
		Scanner sc = new Scanner(System.in);
			private String name;
			private String email;
			private int age;
			
public Cust(String name,String email,int age)  //parameterized
		{
			this.name = name;
			this.email = email;
			this.age = age;
		}
		
public Cust()  //default
		{
			name = "Riya";
			email = "riya@gmail.com";
			age = 25; 
					
		}
		
		public void display()
		{
			System.out.println("Name "+name);
			System.out.println("Email "+email);
			System.out.println("Age "+age);
		}


}
