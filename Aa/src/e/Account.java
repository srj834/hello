package e;

import java.util.Date;

public class Account {

	String bankTrasaction;
	public String getBankTrasaction() {
		return bankTrasaction;
	}


	public void setBankTrasaction(String bankTrasaction) {
		this.bankTrasaction = bankTrasaction;
	}
	long cardNumber;
	Date transactionDate;
	float amount;
	

	
	public Account(String bankTrasaction, long cardNumber, Date transactionDate, float amount) {
		this.bankTrasaction = bankTrasaction;
		this.cardNumber = cardNumber;
		this.transactionDate = transactionDate;
		this.amount = amount;
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


	@Override
	public String toString() {
		return "\nAccount [bankTrasaction=" + bankTrasaction + ", cardNumber=" + cardNumber + ", transactionDate="
				+ transactionDate + ", amount=" + amount + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
