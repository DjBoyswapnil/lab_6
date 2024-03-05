package lab6;
import java.util.Scanner;

//BankAccount interface that holds method of banking function
interface BankAccount
{
	public void create();
	public void display_detail();
	public void deposit();
	public void withdraw();
	public void Check_balance();	
}

//Implement the CheckingAccount class that implements BankAccount interface
public class CheckingAccount implements BankAccount
{
	
	Scanner sc = new Scanner(System.in);
	String[] Name;
	int[] Age;
	String[] Address;
	Long[] Acc_no;
	Long[] Balance;
	Long[] Phn_no;
	
	
	// Method to set the size of arrays based on user input
	public void arraysize()
	{
		System.out.println("Enter the size of an Array : " );
		int Size=sc.nextInt();
		Name=new String [Size] ;
		Age = new int [Size];
		Address=new String [Size];
		Acc_no = new Long [Size] ;
		Balance= new Long [Size];
		Phn_no= new Long [Size];

		
	}
	
	 // Override method to create bank accounts
	@Override
	public void create() 
	{
		arraysize();
		for(int i=0;i<Name.length;i++)
		{
			System.out.println("\nEnter details for customer no "+(i+1)+" : ");
			System.out.println("\nEnter Your Name : ");
			Name[i]=sc.next();
			System.out.println("Enter Your Age : ");
			Age[i]=sc.nextInt();
			System.out.println("Enter Your Address : ");
			Address[i]=sc.next();
			System.out.println("Enter Your Account no : ");
			Acc_no[i]=sc.nextLong();
			System.out.println("Enter the amount for account opening  : ");
			Balance[i]=sc.nextLong();
			System.out.println("Enter your phone no :");
			Phn_no[i]=sc.nextLong();
		}
		
		
	}

	// Override method to display account details
	@Override
	public void display_detail() 
	{
		for(int i=0;i<Name.length;i++)
		{
			System.out.println("\nAccountholder Name :" +Name[i]);
			System.out.println("AccountHolder Age : "+Age[i]);
			System.out.println("AccountHolder Address  :"+Address[i]);
			System.out.println("AccountHolder phone no :"+Phn_no[i]);
			System.out.println("AccountHolder Account Number :"+Acc_no[i]);
			System.out.println("AccountHolder Balance  : "+Balance[i]);
			
		}
		
		
	}

	// Override method to deposit money into an account
	@Override
	public void deposit() 
	{
		System.out.println("\nEnter Your Account_no for Verifaication :");
		int N_Acc=sc.nextInt();
		boolean found =false;
		for(int i=0;i<Name.length;i++)
		{
			if(N_Acc==Acc_no[i])
			{
				found=true;
				System.out.println("\nEnter the amount u want to  deposite :");
				Double Amount=sc.nextDouble();
				Balance[i]=(long) (Amount+Balance[i]);
				System.out.println("Your amount has Deposited ");
				System.out.println("Your total amount is : "+Balance[i]);
				
			}
			
		}
		
		if(!found)
		{
			System.err.println("\nYou have enter Wrong Acc_no:");
		}
		
}

	// Override method to withdraw money from an account
	@Override
	public void withdraw() 
	{
		System.out.println("\nEnter Your Account_no for Verifaication :");
		int N_Acc=sc.nextInt();
		boolean found =false;
		for(int i=0;i<Name.length;i++)
		{
			if(N_Acc==Acc_no[i])
			{
				found=true;
				System.out.println("\nEnter the amount u want to  deposite :");
				Double Amount=sc.nextDouble();
				Balance[i]=(long) (Amount-Balance[i]);
				System.out.println("Your amount has Deposited ");
				System.out.println("Your total amount is : "+Balance[i]);	
			}
			
		}
		if(!found)
		{
			System.err.println("\nYou have enter Wrong Acc_no:");
		}
	
}

	 // Override method to check the account balance
	@Override
	public void Check_balance() 
	{
		System.out.println("\nEnter Your Account_no for Verifaication :");
		int N_Acc=sc.nextInt();
		boolean found =false;
		for(int i=0;i<Name.length;i++)
		{
			if(N_Acc==Acc_no[i])
			{
				System.out.println("Your total balance is "+Balance[i]);
			}
		
		}
		if(!found)
		{
			System.err.println("\nYou have enter Wrong Acc_no:");
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		CheckingAccount ca = new CheckingAccount();
		char ans;
		ca.create();
		
		do//do-while loop used to repeat the process
		{
			System.out.println("\n1:Show Details of User");
			System.out.println("2:Deposit");
			System.out.println("3:Withdraw");
			System.out.println("4: Balance Check");
			System.out.println("\nSelect your choice from above list");
			int ch=sc.nextInt();
			switch (ch) //switch to make a choice
			{
			case 1:
					ca.display_detail();
				break;
			case 2:
					ca.deposit();
				break;
			case 3:
					ca.withdraw();
				break;
			case 4:
					ca.Check_balance();
				break;

			default:
				System.err.println("\nYou have made a wrong choice");
				break;
			}
			System.out.println("\nDo you want repeat the process : ");
			ans=sc.next().charAt(0);
		}
		while(ans=='y' || ans=='Y');
		
		
	}

}