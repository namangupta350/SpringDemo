package com.luv2code.aopdemo.dao;

import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount() {
		
	System.out.println(getClass()+"Doing my db work");
	
	}
	
	public void addNewAccount() {
		System.out.println("in new account");
	}
}
