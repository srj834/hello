package e;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public void testStart() {
		try {
			FileReader f = new FileReader("C:\\Users\\91780\\Desktop\\aa\\question.txt");
			BufferedReader br = new BufferedReader(f);
			Scanner sc = new Scanner(System.in);
			String value;

			ArrayList<Questions> set = new ArrayList();

			while((value = br.readLine()) != null)
			{
				
				String option = br.readLine();
				String answ= br.readLine();
				
				set.add(new Questions(value,option,answ));
				}
			Collections.shuffle(set);
			Iterator i = set.iterator();
			int count = 0;
			int j = 1;
			for (int k = 0; k < 5; k++) {
				Questions que = (Questions) i.next();
				System.out.println(que.getQue());
				System.out.println(que.getOption());
				String ans = sc.next().toLowerCase();
				if(que.getAnsw().equals(ans))
				{
					count++;
				}
				j++;

			}

			System.out.println("correct answers " + count + "/5");

		} catch (Exception e) {

		}
	}
}
