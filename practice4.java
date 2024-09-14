import java.lang.System;
import java.util.Scanner;
class practice4{
	public static void main(String[] args){
		
	Scanner kee= new Scanner(System.in);
	String name= kee.nextLine();
    double mark = kee.nextInt();
	kee.nextLine();
	String department= kee.nextLine();
	
	System.out.print("name is"+ name);
	System.out.print("mark is"+ mark/10);
	System.out.print("department is"+ department);
	
	
	}
}