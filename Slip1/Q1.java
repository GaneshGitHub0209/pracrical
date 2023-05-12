package Slip1;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	System.out.println("enter the number");
	int b=sc.nextInt();
	int c=1;
	for(int i=b;i>0;i--) {
		c=c*a;
	}System.out.println(c);
	}

}
