package e;

import java.util.Scanner;

public class D {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("hhhhh");
	String s=sc.nextLine();
	int l=(s.length()+1)/2;
	if((s.length()%2)==0) {
	System.out.println(s.substring(l-1,l+1));
	}
	else
	{
		System.out.println(s.substring(l-1,l));
	}
}
}