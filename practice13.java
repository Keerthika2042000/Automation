import java.lang.System;
import java.util.Scanner;
class practice13{
	public static void main(String[] args){
		Scanner kee= new Scanner(System.in);
		int num= kee.nextInt();
		if(num%2==0)
		{
			System.out.print("even");
		}
		else
		{
			System.out.print("odd");
		}
	}
}
