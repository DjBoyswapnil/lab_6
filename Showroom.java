package lab6;

import java.util.Scanner;

public class Showroom 
{
	String Name;
	Long Mobile_no;
	double cost ;
	double dis;
	double amount;
	
	public Showroom() 
	{
		this.Name=null;
		this.Mobile_no=0L;
		this.cost=0.0;
		this.dis=0.0;
		this.amount=0.0;
	}
	
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of customer :");
		Name=sc.next();
		System.out.println("Enter the Mobile of customer :");
		Mobile_no=sc.nextLong();
		System.out.println("Enter the Cost :");
		cost=sc.nextDouble();
	}
	
	public void calculate() 
	{
		if(cost<=10000)
		{
			dis=cost*0.05;
		}
		else if(cost > 10000 && cost <= 20000)
		{
			dis=cost*0.1;
		}
		else if (cost > 20000 && cost <= 35000) 
		{
            dis = cost * 0.15;
        } 
		else 
		{
            dis = cost * 0.2;
        }
		
		amount=cost-dis;
	}
	
	
	public void display()
	{
		System.out.println("Customer Name : "+Name);
		System.out.println("Customer Mobile NO : "+Mobile_no);
		System.out.println("Total amount after discount : "+amount );
	}
	public static void main(String[] args) 
	{
		Showroom s = new Showroom();
		s.input();
		s.calculate();
		s.display();
	}

}