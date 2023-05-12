package Slip18;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
   int a=sc.nextInt();
   int b=0;
   for(int i=1;i<=a;i++) {
	   if(a%i==0) 
		   b++;
	   }
       if(b==2) {
    	   System.out.println("prime");
       }
       else {
    	   System.out.println("not prime");
       }
		
		
		
		
		
		
		
}}

