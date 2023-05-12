package Slip2;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the 1st number");	
	int a=sc.nextInt();
	System.out.println("enter the 2st number");	
	int b=sc.nextInt();
	int c;
	for(int i=a;i<=b;i++) {
		for(c=2;c<=i;c++) {
			if(i%c==0)
		break;
	}if(i==c) {
		System.out.println(c);
	}
	
	}
}	}
		
		
	