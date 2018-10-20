package EmailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName;
		String lastName;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter The First Name of the Employee");
		firstName=obj.nextLine();
		System.out.println("Enter the last Name of the Employee");
		lastName=obj.nextLine();
		Email m1=new Email(firstName,lastName);
		System.out.print("\n**********************\n\n");
		m1.get_detail();
		System.out.print("\n**********************\n\n");
		System.out.print("Press 1 for add Alternate Email\nPress 2 for Change Password\nPress 3 for change MailBox Capacity");
		int x=obj.nextInt();
		switch(x)
		{
		case 1:
			System.out.println("Enter ALternate Email to Add");
			String email=obj.next();
			m1.setAlternateEmail(email);
			break;
		case 2:	
			System.out.println("Enter the new password");
			String password=obj.next();
			m1.setNewPassword(password);
			break;
		case 3:
			System.out.println("Enter the new mailbox capacity");
			int capacity=obj.nextInt();
			m1.setMailBoxCapacity(capacity);
			break;
			
		default:
			System.out.println("please Select correct choice");
			
			
		}

	}

}
