package com.sergio.classes;



public class BankAccount {
	
	private long checkNumberAcct;
	private long savingNumberAcct;
	private String name;
	private double checking_balance;
	private double savings_balance;
	
	
	
	public BankAccount(String name, double checking_balance, double savings_balance) {
		
		this.checkNumberAcct=0; 
		this.savingNumberAcct=0; 
		this.name = name;
		this.checking_balance= checking_balance;
		this.savings_balance = savings_balance;
		
	}
	
	// Getters
	public long getCheckNumberAcct() {
		return checkNumberAcct;
	}
	
	public long getSavingNumberAcct() {
		return savingNumberAcct;
	}
	
	public double getChecking_balance() {
		return checking_balance;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSavings_balance() {
		return savings_balance;
	}
	
	// Setters
	public void setCheckNumberAcct(long checkNumberAcct) {
		this.checkNumberAcct = checkNumberAcct;
	}
	
	public void setSavingNumberAcct(long savingNumberAcct) {
		this.savingNumberAcct = savingNumberAcct;
	}
	
	public void setChecking_balance(double checking_balance) {
		this.checking_balance = checking_balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSavings_balance(double savings_balance) {
		this.savings_balance = savings_balance;
	}	
	
	
	double finalBalance_checkAcct = getChecking_balance();
	double finalBalance_saveAcct = getSavings_balance();
	
	public static void printAcctNumbers(BankAccount bankAccount) {
		
		if (bankAccount.getCheckNumberAcct() ==0) {
			long num1 =(long) (Math.random()*1000000000);
			bankAccount.setCheckNumberAcct(num1);
			
		}
		
		if (bankAccount.getSavingNumberAcct() ==0) {
			long num2 = (long ) (Math.random()*1000000000);
			bankAccount.setSavingNumberAcct(num2);
		}
		
		
		System.out.println("\nChecking Acct #: "+ bankAccount.getCheckNumberAcct());
		System.out.println("Saving Acct #: "+ bankAccount.getSavingNumberAcct());
	}
	
	public static void print_final_balance(BankAccount bankAccount) {
		
		System.out.println("\nChecking Acct Balance: "+ bankAccount.getChecking_balance());
		System.out.println("Saving Acct Balance: "+ bankAccount.getSavings_balance());
		
	}
	
	public void depositAmount(double amount, String typeAcct) {
		
		
		if (typeAcct.equals("savings")) {
			
			System.out.println("\nDEPOSIT / Initial Balance amount: "+ getSavings_balance());
			setSavings_balance(getSavings_balance()+amount);
			System.out.println("Final Balance amount: "+ getSavings_balance());
			
		}else if(typeAcct.equals("checking")) {
			System.out.println("\nDEPOSIT / Initial Balance amount: "+ getChecking_balance());
			setChecking_balance(getChecking_balance()+amount);
			System.out.println("Final Balance amount: "+ getChecking_balance());
		}
		
		
	}
	
	public void withdrawalAmount(double amount, String typeAcct) {
		
		if (typeAcct.equals("savings")) {
			if (amount > getSavings_balance()) {
				System.out.println("\nWITHDRAW / Amount exceed actual balance!! Transaction Denied!");
			}else {
				System.out.println("\nWITHDRAW / Actual Saving Balance: $" + getSavings_balance());
				setSavings_balance(getSavings_balance()- amount);
				System.out.println("Transaction done successfully!!");
				System.out.println("New Saving Balance: $" + getSavings_balance());
			}
		}else if(typeAcct.equals("checking")) {
			if (amount > getChecking_balance()) {
				System.out.println("\nWITHDRAW / Amount exceed actual balance!! Transaction Denied");
			}else {
				System.out.println("\nWITHDRAW Actual Checking Balance: $" + getChecking_balance());
				setChecking_balance(getChecking_balance()- amount);
				System.out.println("Transaction done successfully!!");
				System.out.println("New Checking Balance: $" + getChecking_balance());
			
			}
		}
	}

}
