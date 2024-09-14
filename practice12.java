import java.lang.System;
import java.util.Scanner;
class practice12{
	public static void main(String[] args){
		
	Scanner kee= new Scanner(System.in);
	int num=kee.nextInt();
	
	
	if(num>35 && num<60)
	{
		System.out.print("video game");
	}
	else if(num>60 && num<90)
	{
		System.out.print("iphone"); 
	}
	else if(num>90)
	{
		System.out.print("macbook");
	}
	else
	{
		System.out.print("nothing");
	}
	}
}