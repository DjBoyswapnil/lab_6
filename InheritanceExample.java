package lab6;
import java.util.Scanner;
/*here  class person extend class Doctor and class doctor extends class surgeon
 *  so multilevel inheritance is applied
 * and also class person extends Doctor and Nurse so hierarchical inheritance is applied.
 */


//Base class representing a generic person
class Person
{
	String Name;
	int Age;
	long Aadhar_no;
	
	// Constructor for Person class
	public Person(String Name,int Age,long Aadhar_card) 
	{
		this.Name=Name;
		this.Age=Age;
		this.Aadhar_no=Aadhar_card;
	}
	
	// Display method for Person class
	public void display() 
	{
		System.out.println("The Persons Name :"+Name);
		System.out.println("The Persons age : "+Age);
		System.out.println("The Persons Id Proof :"+Aadhar_no);
	}
	
}

//Subclass representing a Doctor, inheriting from Person  
class Doctor extends Person
{
	String Doctors_Id;
	double Experience;

	// Constructor for Doctor class
	public Doctor(String Name, int Age, long Aadhar_card,String Doctors_Id,double Experience) 
	{
		super(Name, Age, Aadhar_card);
		this.Doctors_Id=Doctors_Id;
		this.Experience=Experience;	
	}
	
	 // Display method for Doctor class, overriding the base class display method
	public void display() 
	{
		super.display();
		System.out.println("Doctors Id :"+Doctors_Id);
		System.out.println("Years of Experience of doctor in months :"+Experience);
	}
}

//Subclass representing a Surgeon, inheriting from Doctor
class Surgeon extends Doctor
{
	String Specilization;
	
	// Constructor for Surgeon class
	public Surgeon(String Name,int Age,long Aadhar_card,String Doctors_Id,double Experience,String Specilaization) 
	{
		super(Name, Age, Aadhar_card, Doctors_Id, Experience);
		this.Specilization=Specilaization;
	}
	
	// Display method for Surgeon class, overriding the Doctor class display method
	public void display()
	{
		super.display();
		System.out.println("doctor is specilized in : "+Specilization);
	}
}


//Subclass representing a Nurse, inheriting from Person
class Nurse extends Person
{
	String Nurse_id;
	double Experirence;

	// Constructor for Nurse class
	public Nurse(String Name, int Age, long Aadhar_card,String Nurse_id,double Experirence) 
	{
		super(Name, Age, Aadhar_card);
		this.Nurse_id=Nurse_id;
		this.Experirence=Experirence;
	}
	
	// Display method for Nurse class, overriding the Person class display method
	@Override
	public void display() 
	{
		super.display();
		System.out.println("Nurse id :"+Nurse_id);
		System.out.println("Years of Experience Nusre have in months  :"+Experirence);
	}
}
public class InheritanceExample 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		 // Input for a generic person
		System.out.println("Enter Your Name :");
		String Name=sc.next();
		System.out.println("Enter Your Age :");
		int Age=sc.nextInt();
		System.out.println("Enter Your Aadhar No :");
		long Adharno=sc.nextLong();
		Person p =new Person(Name, Age, Adharno);
		p.display();
		
		 // Input for a doctor
		System.out.println("\nEnter  Doctors Id :");
		String Id=sc.next();
		System.out.println("Enter Years of Experience :");
		double Exp=sc.nextDouble();
		Doctor d = new Doctor(Name, Age, Adharno, Id, Exp);
		d.display();
		
		 // Input for a surgeon
		System.out.println("\nDoctor is Specialized in  :");
		String Spz=sc.next();
		Surgeon s= new Surgeon(Name, Age, Adharno, Id, Exp, Spz);
		s.display();
		
	    // Input for a nurse
		System.out.println("\nEnter  Doctors Id :");
		String N_Id=sc.next();
		System.out.println("Enter Years of Experience :");
		double N_Exp=sc.nextDouble();
		Nurse n = new Nurse(Name, Age, Adharno, N_Id, N_Exp);
		n.display();
	}

}