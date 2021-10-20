package com.sergio.testerApp;
import com.sergio.classes.BankAccount;
import com.sergio.testerApp.TesterApp;

public class TesterApp {

	public static void main(String[] args) {
		
		double initial_deposit_sav = 400.0;
		double initial_deposit_check = 1000.0;
		
		BankAccount newBankAcct = new BankAccount("Sergio", initial_deposit_check, initial_deposit_sav);
		BankAccount.printAcctNumbers(newBankAcct);
		BankAccount.print_final_balance(newBankAcct);
		newBankAcct.withdrawalAmount(150, "savings");
		BankAccount.print_final_balance(newBankAcct);
		newBankAcct.depositAmount(2000, "savings");
		BankAccount.print_final_balance(newBankAcct);
		newBankAcct.withdrawalAmount(5000, "checking");
		newBankAcct.withdrawalAmount(300, "checking");
		BankAccount.print_final_balance(newBankAcct);
		System.out.println("\n--- END TRANSACTIONS ---");
		BankAccount.printAcctNumbers(newBankAcct);
		
		
		
	}

}
