import java.lang.System;
import java.util.Scanner;
class practice6{
	public static void main(String[] args){
		
	Scanner kee= new Scanner(System.in);
	int num1= kee.nextInt();
	int num2= kee.nextInt();
	if(num1==num2)
		{
			System.out.print("equal");
		}
		else
		{
			System.out.print("not equal");
		}
	}
}