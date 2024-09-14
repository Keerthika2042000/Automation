import java.lang.System;
import java.util.Scanner;
class practice10{
	public static void main(String[] args){
	Scanner kee= new Scanner(System.in);
	int scholarship= kee.nextInt();
	if(scholarship>7000)
	{
		System.out.print("eligible");
	}
	else
	{
		System.out.print("not eligible");
	}
	}
}