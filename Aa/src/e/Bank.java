package e;

public class Bank {
String name;
int age;
String gender;
String bank;
long cardNumber;
float creditLimit;
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
public long getCardNumber() {
	return cardNumber;
}
public void setCardNumber(long cardNumber) {
	this.cardNumber = cardNumber;
}
public float getCreditLimit() {
	return creditLimit;
}
public void setCreditLimit(float creditLimit) {
	this.creditLimit = creditLimit;
}
public Bank(String name, int age, String gender, String bank, long cardNumber, float creditLimit) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.bank = bank;
	this.cardNumber = cardNumber;
	this.creditLimit = creditLimit;
}
@Override
public String toString() {
	return "\nBank [name=" + name + ", age=" + age + ", gender=" + gender + ", bank=" + bank + ", cardNumber="
			+ cardNumber + ", creditLimit=" + creditLimit + "]";
}



}
