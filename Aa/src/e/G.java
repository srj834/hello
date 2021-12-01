package e;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		try {

			FileReader f1 = new FileReader("bankAccount.txt");

			BufferedReader br1 = new BufferedReader(f1);
			ArrayList<Bank> bankDetail = new ArrayList<Bank>();
			String name;
			while ((name = br1.readLine()) != null) {
				int age = Integer.parseInt(br1.readLine());
				String gender = br1.readLine();
				String bank = br1.readLine();
				long cardNumber = Long.parseLong(br1.readLine());
				float creditLimit = Float.parseFloat(br1.readLine());

				bankDetail.add(new Bank(name, age, gender, bank, cardNumber, creditLimit));
			}
			// System.out.println(bankDetail);
			// System.out.println("hello");

			FileReader f = new FileReader("bankTransaction.txt");
			BufferedReader br = new BufferedReader(f);
			ArrayList<Account> bankT = new ArrayList<Account>();
			// System.out.println(bankT);
			String bankTrasaction;
			while ((bankTrasaction = br.readLine()) != null) {
				long cardNumber = Long.parseLong(br.readLine());
				Date transactionDate = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(br.readLine());
				float amount = Float.parseFloat(br.readLine());
				bankT.add(new Account(bankTrasaction, cardNumber, transactionDate, amount));

			}
			ArrayList<Third> l = new ArrayList<Third>();
			// System.out.println(bankT);
			for (int i = 0; i < bankDetail.size(); i++) {
				for (int j = 0; j < bankT.size(); j++) {

					if (bankDetail.get(i).getCardNumber() == bankT.get(j).getCardNumber()) {

						l.add(new Third(bankDetail.get(i).getName(), bankDetail.get(i).getAge(),
								bankDetail.get(i).getGender(), bankDetail.get(i).getBank(),
								bankDetail.get(i).getCreditLimit(), bankDetail.get(i).getCardNumber(),
								bankT.get(j).getTransactionDate(), bankT.get(j).getAmount(),
								bankT.get(j).getBankTrasaction()));

					}

				}
			}
			
		Scanner sc=new Scanner(System.in);
		System.out.println("BAnk Name Enter");
		String s=sc.next();
			for(int i=0;i<l.size();i++) {
				if(s.equals(l.get(i).getBank())) {
					System.out.println(l.get(i));
					
				}
				
				
			}
			
		Collections.sort(l);
		System.out.println("sorted Transaction Details");
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
			
			
		} catch (Exception e) {

		}

	}

}
