package EmailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	
	//constructor to receive the first name and last name
	
		public Email(String firstName,String lastName)
		{
			this.firstName=firstName;
			this.lastName=lastName;
			//call a method for asking department-return department
			this.department=setDepartment();
			
			
			//call a method that return a random password
			this.password=randomPassword(6);
			
			
			//combine elements to genrate email;
			if(department=="sale"||department=="dev"||department=="acc"||department=="")
			{
			System.out.println("department is "+this.department);
			email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".dituiniversity.com";
		
			}
			else
			{
				System.out.println("Please Enter Correct department choice");
			}
		}
	
	//Ask for the department
		private  String setDepartment()
		{
			System.out.print("Department Codes\n1 for Sales\n2 for Devlopment\n3 for Account\n0 for none\nEnter Department Code");
			Scanner obj=new Scanner(System.in);
			int deptChoice=obj.nextInt();
			switch(deptChoice)
			{
			case 1:
				return "sale";
			
			case 2:
				return "dev";
		
				
			case 3:
				return "acc";
				
			case 0:
				return "";
				
			default:
				return "Please Enter Correct Choice";
			}
		
		}
		
		
	
	
	//Genrate a random password
		
		private String randomPassword(int length)
		{
			String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			
			String password="";
			for(int i=0;i<length;i++)
			{
				int random=(int)(Math.random()*passwordSet.length());
				char p=passwordSet.charAt(random);
				password+=p;
			}
			return password;
		}
		
	
	// set the mailbox capacity
	//encapsulation	
	public void setMailBoxCapacity(int capacity)
	{
		this.mailBoxCapacity=capacity;
		System.out.println("Mail Box Capacity Updated");
	}
	
	//set the alternate email
	public void setAlternateEmail(String email)
	{
		this.email=email;
		System.out.println("Alternate Email Add in Your Account");
	}
	//change the password
	public void setNewPassword(String password)
	{
		this.password=password;
		System.out.println("Password is Upaded New Password");
	}
	public int getMailBoxCapacity() {return this.mailBoxCapacity;}
	public String getNewpassword(){return this.password;}
	public String getAlternateEmail(){return this.email;}
	
	public void get_detail()
		{
			System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);
			System.out.println("Your Email is "+email);
			System.out.println("Your MailBox Capcity is "+mailBoxCapacity);
		}
	}
	
	
	
	

