package e;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter Styring");
		String s = sc.nextLine();
		String a[] = s.split(" ");
		int[] b = new int[a.length];
		
		

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a[i].length(); j++) {
				a[i].charAt(j);
				count++;
			}
			b[i] = count;
		}
		int max = b[0];
		for (int i = 1; i < b.length; i++) {
			if (b[i] > max) {
				max = b[i];
			}
		}
		for(int i=0;i<b.length;i++) {
			if(max==b[i]) {
				System.out.println(a[i]);
			}
		}

	
	}

}

