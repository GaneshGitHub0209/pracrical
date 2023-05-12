package Slip10;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner hi =new Scanner(System.in);
		System.out.println("enter the number");
		  
		  int b; 
		  b=hi.nextInt();
		  
		  for(int i=1; i<=b;i++)
		  {    
		      if (b%i==0) {
		    	  
		    	  System.out.println(i);
		      }
		
		  }
		
	}
	
	
	}


