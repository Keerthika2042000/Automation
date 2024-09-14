import java.lang.System;
import java.util.Scanner;
class practice3{
	public static void main(String[] args){
		
	Scanner kee= new Scanner(System.in);
	int a = kee.nextInt();
    int b = kee.nextInt();
	int c = kee.nextInt();
	int d= a*b*c;
	int e= a+b+c;
	int result= d/e;
	System.out.print(result);
	
	}
}