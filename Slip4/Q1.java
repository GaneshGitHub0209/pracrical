package Slip4;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	System.out.println("enter the name");	
	String name=sc.next();
	String b="";
	int l=name.length();
	for(int i=l-1;i>=0;i--) {
		b=b+name.charAt(i);
		
	}System.out.println(b);
	if(name.equals(b)) {
		System.out.println("pallidrome");
	}else {
		System.out.println("not a pallidrome");
	}
		
		
	}

}
