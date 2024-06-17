package tests.factory;

import entitites.Account;

public class AccountFactory {
	
	public static Account createEmptyAccount() {
		return new Account(1L, 0.0);
	}
	
	public static Account creatAccount(double initialBalance) {
		return new Account(1L, initialBalance);
	}


}
