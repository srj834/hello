package e;

import java.util.Scanner;

public class E {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr no;");
    long n=sc.nextInt();
    long zero=0;
    long one=0;
    while(n!=0) {
    	long r=n%10;
    	if(r==0) {
    		zero++;
    	}
    	else if(r==1) {
    		one++;
    	}
    	else
    		System.out.println("WRONG Input");
    	
    	n=n/10;
    	}
System.out.println(zero+""+one);
 for(int i=0;i<zero;i++) {
	 System.out.print(0);
 }
 for(int i=0;i<one;i++) {
	 System.out.print(1);
 }
   
}
}
