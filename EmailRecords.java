package signinsignup;

import java.util.HashMap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map.Entry;
import java.util.Scanner;


public class EmailRecords {
	

	
	
	HashMap<String, EmailApplication> map =  new HashMap<>();
	Scanner scanner = new Scanner(System.in);
	private Object change_pass;

	public void SignIn() {
		
		EmailApplication obj = new EmailApplication();
		
		System.out.println("EMAIL");
		String email = scanner.next();
		System.out.println("Password");
		String password = scanner.next();
		
		
		
		
	/*	System.out.println("EMAIL");
		int flag =0;
		String id = new Scanner(System.in).next();
		System.out.println("PASSWORD");
		String password = new Scanner(System.in).next();*/
		
		int  flag = 0;
		
		for(Entry<String, EmailApplication> i: map.entrySet()) {
			if( i.getValue().getEmail().equals(email) && i.getValue().getPassword().equals(password) ) {
				flag =1;
				break;
				
			}
			
		}
		if(flag == 0) {
			System.out.println("NOT A REGISTERED EMAIL");
		}
		else {
			System.out.println("WELCOME:"+ email);
		}
		
		
	}

	public void Signup() {
		
		EmailApplication obj = new EmailApplication().addMember();
		
		int flag = 0;
		for(Entry<String, EmailApplication> i: map.entrySet()) {
			
			if(obj.getEmail() == i.getKey()) {
				flag=1;
				break;
				
				
			}
			
			
			
		}
		if(flag == 0) {
			map.put(obj.getEmail(), obj);
		}
		
		else {
			System.out.println("Email id is already Registerd");
		}
		
		
		
		
	}

	public void forget() {
		EmailApplication obj = new EmailApplication();
		System.out.println("EMAIL");
		String email = scanner.next();
		System.out.println("Password");
		String change_pass = scanner.next();
		
		
		
		
		
		int flag = 0;
		for(Entry<String, EmailApplication>i: map.entrySet()) {
			
			
				
			
		if(i.getValue().getEmail().equals(email) && i.getValue().getChange_pass().equals(change_pass)){
				 flag =1;
				 break;
				 
				 
				 
			 }
		}
		if(flag==0) {
			System.out.println("Password Not Changed");
			
		}
		else {
			System.out.println("Password changed");
		}
		
	}

}
