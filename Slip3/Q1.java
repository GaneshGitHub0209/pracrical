package Slip3;
import java.util.Scanner;
///Armstrong number= (153=1*1*1+5*5*5+3*3*3=153)  
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int rem;
		int arm=0;
		int c=a;
		while(a>0) {
			rem=a%10;
			arm=(rem*rem*rem)+arm;
			a=a/10;
			
			
		}if(c==arm) {
			System.out.println("armstrong");
			
		}else {
			System.out.println("not armstong");
		
	}

}}
