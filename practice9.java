import java.lang.System;
import java.util.Scanner;
class practice9{
	public static void main(String[] args){
	Scanner kee= new Scanner(System.in);
	int mark= kee.nextInt();
	if(mark>35)
	{
		System.out.print("pass");
	}
	else
	{
		System.out.print("Fail");
	}
	}
}