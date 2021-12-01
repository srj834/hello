package e;

import java.util.Scanner;

public class C {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n0;");
	int n = sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
		if(i==n) {
			System.out.print(i+"=");
		}
		else
		System.out.print(i+"+");
		
	}
	System.out.println(sum);
}
}
