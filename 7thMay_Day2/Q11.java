import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		int choice;
		Scanner sc= new Scanner(System.in);
		int pen = 0,pencil=0,note=0,bottle=0,cb=0;
		boolean flag = false;
		System.out.println(" Enter 1 for Pen");
		System.out.println(" Enter 2 for Pencil");
		System.out.println(" Enter 3 for Notebook");
		System.out.println(" Enter 4 for bottle");
		System.out.println(" Enter 5 for ColourBox");
		System.out.println(" Enter 6 for Exit");
		while(flag != true)
		{
			System.out.println("Enter Your Choice of Item");
			choice =sc.nextInt();
			switch (choice)
			{
			case 1 :
				System.out.println("How Many Pen");
				 pen = sc.nextInt();
				break;
			case 2 :
				System.out.println("How Many Pencil");
				 pencil = sc.nextInt();
				break;
			case 3 :
				System.out.println("How Many Notebook");
				 note = sc.nextInt();
				break;
			case 4 :
				System.out.println("How Many Bottle");
				 bottle = sc.nextInt();
				break;
			case 5 :
				System.out.println("How Many ColorBox");
				 cb = sc.nextInt();
				break;
			case 6 :
				flag = true;
				break;
				default : System.out.println("Thanku for shopping with us");
				
			}
			
		}
		int total = pen *10 + pencil *5 +note *20 + bottle * 30 + cb *50;
		System.out.println("Total Cost of Stationary Item is "+ total);

	}

}
