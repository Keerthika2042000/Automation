import java.lang.System;
import java.util.Scanner;
class practice2{
	public static void main(String[] args){
		
	Scanner kee= new Scanner(System.in);
	String name= kee.nextLine();
    int age = kee.nextInt();
	kee.nextLine();
	String address=kee.nextLine();
	System.out.print("my name is"+ name);
	System.out.print("my age is"+age);
	System.out.print("my address is" +address);
	}
}