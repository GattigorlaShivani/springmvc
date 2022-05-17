package com.jobiak.mvcforms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank")
public class User
{

@Id
private String bank_name;
private String branch;
private String account_id;
private String name;
private String type;
private String balance;

public User()
{
	
}

public String getBank_name() {
	return bank_name;
}

public void setBank_name(String bank_name) {
	this.bank_name = bank_name;
}

public String getBranch() {
	return branch;
}

public void setBranch(String branch) {
	this.branch = branch;
}

public String getAccount_id() {
	return account_id;
}

public void setAccount_id(String account_id) {
	this.account_id = account_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getBalance() {
	return balance;
}

public void setBalance(String balance) {
	this.balance = balance;
}





}