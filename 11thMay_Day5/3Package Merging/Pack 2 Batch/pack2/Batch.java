package batch.pack2;

import java.util.Scanner;

//code using constructor method
public class Batch {
	public String clas;
	public String time;
	public int strength;
	
	//default constructor (Name should be same as class)
	public Batch()  
	{
		clas = "CDAC";
		time = "0090hrs";
		strength = 240;
	}
	
	// parameterized constructor
	public Batch( String time,int strength) 
	{
		this(); // this points to the default objects value
		
		//this.clas=clas;
		this.time=time;
		this.strength=strength;
	}
	
	//for default Constructor
	public void accept()
	{	Scanner sc= new Scanner(System.in);
		System.out.println("Default Constructor");
		clas= sc.next();
		time = sc.next();
		strength =sc.nextInt();
		
	}
	//accept info for parameterized // code to get value will be given in main
	public void accept (String clas,String time, int strength)
	{	this.clas=clas;
		this.time=time; // same as // time = sc.next();
		this.strength=strength;
	}
	
	//display info
	public void display()
	{
		System.out.println("Class :"+clas);
		System.out.println("Time :"+time);
		System.out.println("Strength of Class :"+strength);
	}
}
