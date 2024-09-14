import java.lang.System;
import java.util.Scanner;
class practice11{
	public static void main(String[] args){
		
	Scanner kee= new Scanner(System.in);
	int num=kee.nextInt();
	
	
	if(num%3==0 && num%5==0)
	{
		System.out.print("divisible by 3 nd 5");
	}
	else
	{
		System.out.print("not divisible");
	}
	}
}