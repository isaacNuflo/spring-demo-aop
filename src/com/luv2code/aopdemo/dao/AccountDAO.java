package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;

	private String serviceCode;

	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + ": addAccount()");
	}
	
	public List<Account> findAccounts(boolean tripWire){
		if (tripWire) {
			throw new RuntimeException("No soup for you");
		}
		 List<Account> myAccounts = new ArrayList<Account>();
		 Account temp1 = new Account("Isaac", "Silver");
		 Account temp2 = new Account("Jose", "Platinum");
		 Account temp3 = new Account("Ana", "Glod");
		 myAccounts.add(temp1);
		 myAccounts.add(temp2);
		 myAccounts.add(temp3);
		 return myAccounts;
	}

	public String getName() {
		System.out.println(getClass() + ": getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": setServiceCode()");
		this.serviceCode = serviceCode;
	}

}
