package Slip17;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
    	 Scanner scanner=new Scanner(System.in);
		 System.out.println("enter the number");
		int a=scanner.nextInt();
		int r;
		while (a>0) {
			r=a%10;
				System.out.print(r);
				a=a/10;
			
			}
		}
}