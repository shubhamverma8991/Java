package merge.pack3;

import batch.pack2.Batch;
import student.pack1.Student;

public class Test {

	public static void main(String[] args) {
	Student st1 = new Student(); //public class .. so its going to call from another package
	st1.accept();
	st1.display();
	
	

	}

}
