/*
 * Scanner for Matta
 * convert string to account, if statements
 * copy paste code lotta times
 * 5 accounts
 * seperate accounts, lists for them
 * Joe mama
 */

import java.util.Scanner;
import java.util.ArrayList;

import java.util.List;
public class safeDeposit {

	public static void main(String[] args) 
	{
		Scanner bnum = new Scanner(System.in);
		Scanner pass = new Scanner(System.in);
		//test account ( bnum: 3204 pass: oopsie )
		
		 List<List<String>> accounts = new ArrayList<List<String>>();
		 List<String> Matta = new ArrayList<String>();
		 
		 accounts.add(Matta);
		 
		 
		 	

	
	{
	   System.out.println("Welcome to the Safety Deposit Box)");
	   System.out.println("Press 1 to begin");

	   Scanner start = new Scanner(System.in);

	   int resetValue = start.nextInt();

	List<String> answers = new ArrayList<String>();

	Scanner whatbox = new Scanner(System.in);
	System.out.println("What's your account name?");
	String bosdse = whatbox.next();
	
	

	while (resetValue == 1){
	 
		
	String box = new String();
	 System.out.println("Press D to make a Deposit, Press W to make a Withdrawl?");
	 Scanner asdf = new Scanner(System.in);
	 box = asdf.next();
	 
if(box.equalsIgnoreCase("d")){	
	Scanner items = new Scanner(System.in);
	System.out.println("How many items do you want to deposit");
	 int amount = items.nextInt();

	for(int i=0; i < amount; i++){
	  String temp = new String();
	  Scanner thinginput = new Scanner(System.in);
	  System.out.println("Name the item:");
	  temp = thinginput.next();
	  
	  
	  answers.add(temp);
	  
	  System.out.println("Your Deposit Box: ");
	  System.out.println(answers);
	}
}
else if(box.equalsIgnoreCase("w")) {
	String maybe = new String();
	Scanner p = new Scanner(System.in);	
	System.out.println("Name the item, you would like to withdrawl:");
	System.out.println(answers);
	maybe = p.next();
	
	answers.remove(answers.indexOf(maybe));
	System.out.println(answers);
}
	if (resetValue == 1){
	            System.out.println("Type 0 to do another transaction or 2 to stop");
	            resetValue =  start.nextInt();
	        }//reset values for whileloop to make a start and stop solution
	        if (resetValue == 0){
	            resetValue++;
	        }
	        if (resetValue == 2){
	        System.out.println("Have a great day!");
	            break;
	        }
	        }
	}

}
}