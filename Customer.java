import java.util.*;
// Alex Park, Dean Johnson, Anna Arushanyan 
// Period 6/7 
// December 9, 2019
public class Customer {

	public static void main(String[] args) {
		new Customer();
	}
	
    public Customer() 
    {
TypeInfo();
Confirm();
    }
    
public void TypeInfo() {
    Scanner customer = new Scanner(System.in); 
    System.out.println("Enter your name (First-Last.....ex. John-Doe).");
    myName = customer.next();
    System.out.println("Enter your address (#-Street Name-Suffix.....ex. 1-Park-Avenue).");
    myAddress = customer.next();
    System.out.println("Enter your birthday (MM/DD/YYYY).");
    myBirthday = customer.next();
    System.out.println("Enter your card number.");
    cardNumber = customer.nextInt();
    System.out.println("Enter your pin number.");
    pin = customer.nextInt();
    System.out.println("Enter your username.");
    accountName = customer.next();
    System.out.println("Enter your password.");
    myPassword = customer.next();
    }
    
public void Confirm() {
Scanner customer = new Scanner(System.in); 
    System.out.println(myName);
    System.out.println(myAddress);
    System.out.println(myBirthday);
    System.out.println(cardNumber);
    System.out.println(pin);
    System.out.println(accountName);
    System.out.println(myPassword);
    System.out.println("Is all of this information correct? Type yes or no.");
    String confirm = customer.next();
    if (confirm.equalsIgnoreCase("yes"))
        System.out.println("You are verified. Enjoy your day.");
    if (confirm.equalsIgnoreCase("no")) {
        TypeInfo();
        Confirm(); }
    if (!(confirm.equalsIgnoreCase("yes"))&&!(confirm.equalsIgnoreCase("no"))) {
        System.out.println("There was an error. Check your credentials again.");
        Confirm();
    }
}

//accessor methods
public String getMyName() {

	return myName;

}

public String getMyAddress() {

	return myAddress;

}

public String getMyBirthday() {

	return myBirthday;

}

public String getAccountName() {

	return accountName;

}

public String getMyPassword() {

	return myPassword;

}

public int getCardNumber() {

	return cardNumber;

}

public int getPin() {

	return pin;

}

//modifier methods
public void setMyName(String input_myName) {

	myName = input_myName;

}

public void setMyAddress(String input_myAddress) {

	myAddress = input_myAddress;

}

public void setAccountName(String input_accountName) {

	accountName = input_accountName;

}

public void setCardNumber(int input_cardNumber) {

	cardNumber = input_cardNumber;

}

public void setPin(int input_pin) {

	pin = input_pin;

}

public void setMyPassword(String input_myPassword) {

	myPassword = input_myPassword;

}

public void setMyBirthday(String input_myBirthday) {

	myBirthday = input_myBirthday;

}

String myName; 
String myAddress;
String myBirthday;
int cardNumber;
int pin;
String accountName;
String myPassword;
}

