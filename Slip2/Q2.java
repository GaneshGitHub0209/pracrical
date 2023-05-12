package Slip2;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numarater");
		int a=sc.nextInt();
		System.out.println("enter the Denomenater");
	    int b=sc.nextInt();
	    
	    try {
	    	
	    	double div =a/b;
	    	System.out.println(div);
	    }
	    catch(ArithmeticException e){
	    	System.out.println("error"+e.getMessage());
	    	System.out.println("can not divided zero");
	    	
	    }
	    	
	    }
	}
	
	   


