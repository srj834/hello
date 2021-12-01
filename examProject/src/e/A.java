package e;

import java.io.IOException;
import java.util.Scanner;

public class A {
	static String namev = "aaaa";
	static String password = "1234";

	public static void main(String[] args) {

		while (true) {
			System.out.println("1. create " + "2. Display" + "3. rw" + "4. exit");

			Scanner sc = new Scanner(System.in);
			try {
				int c = sc.nextInt();
				switch (c) {
				case 1:
					verify();

					break;

				case 2:
					System.out.println("firstly go to create");
					break;
				case 4:
					System.exit(0);

				}
			} catch (Exception e) {
				System.out.println("wrong Entry");
			}

		}
	}

	public static void verify() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter UserName");
		String name = sc.next();
		System.out.println("enter Password");
		String pass = sc.next();
		if (name.equals(namev) && pass.equals(password)) {

			System.out.println("1. create " + "2. Display" + "3. rw" + "4. exit");

			Scanner sc1 = new Scanner(System.in);

			int c = sc.nextInt();
			switch (c) {
			case 1:
				verify();

				break;

			case 2:
				display();
				break;
			case 4:
				System.exit(0);
			}

		} else {
			System.out.println("wrong input user name And Password");
			verify();
		}
	}

	static void display() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("welcome to Exam world");
		System.out.println("1. Exam start  " + "2. exit");

		int exam = sc1.nextInt();

		switch (exam) {
		case 1:
			Test test = new Test();

			test.testStart();

			break;

		case 2:
			break;
		default:
			System.out.println("wrong Entry try Again");

		}

	}

}