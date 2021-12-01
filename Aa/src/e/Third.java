package e;

import java.util.Comparator;
import java.util.Date;

public class Third implements Comparable<Third>{
	
	String name;
	int age;
	String gender;
	String bank;
	float creditLimit;
	long cardNumber;
	Date transactionDate;
	float amount;
	String bankTrasaction;
	@Override
	public String toString() {
		return "Third [name=" + name + ", age=" + age + ", gender=" + gender + ", bank=" + bank + ", creditLimit="
				+ creditLimit + ", cardNumber=" + cardNumber + ", transactionDate=" + transactionDate + ", amount="
				+ amount + ", bankTrasaction=" + bankTrasaction + "]";
	}
	public Third(String name, int age, String gender, String bank, float creditLimit, long cardNumber,
			Date transactionDate, float amount, String bankTrasaction) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bank = bank;
		this.creditLimit = creditLimit;
		this.cardNumber = cardNumber;
		this.transactionDate = transactionDate;
		this.amount = amount;
		this.bankTrasaction = bankTrasaction;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getBankTrasaction() {
		return bankTrasaction;
	}
	public void setBankTrasaction(String bankTrasaction) {
		this.bankTrasaction = bankTrasaction;
	}
	@Override
	public int compareTo(Third e) {
		// TODO Auto-generated method stub
		return this.transactionDate.compareTo(e.getTransactionDate());
	}
	
}
