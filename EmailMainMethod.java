package signinsignup;

import java.sql.Connection;
import java.util.Scanner;

public class EmailMainMethod {

	public static void main(String[] args) {
	
		EmailApplication obj = new EmailApplication();
		EmailRecords member = new EmailRecords();
		Scanner scanner = new Scanner(System.in);
		char choice;
		
		do {
			System.out.println("1-SIGN IN");
			System.out.println("2-SIGN UP");
			System.out.println("3-Forget Password");
			int option = scanner.nextInt();
			switch(option) {
			case 1:
				member.SignIn();
				break;
			case 2:
				member.Signup();
				
				break;
			case 3:
				member.forget();
				break;
			}
			
			System.out.println("Want more operation?(y/n)");
			 choice = scanner.next().charAt(0);
			
	
			
		}while(choice == 'Y' || choice =='y');
		

	}

}
