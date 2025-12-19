package week1.day1;

public class EmployeeDetails {
	/* a) Create a Java class
Create a class named EmployeeDetails with a main method.
b) Inside the main method:
Declare and initialize the following variables with suitable data types:
name = "John Doe"
age = 30
salary = 55000.75
gender = 'M'
acceptTerms = true
rating = 4.5f
mobileNumber = 9876543210
pinCode = 56001
luckyNumber = 7
c) Print values
Use System.out.println() to print each variable’s value clearly
d) Run and verify
Execute the program and confirm all values are printed correctly to the console.*/
	
	
	public static void main(String[] args) {
		
	String name = "John Doe";
	int	age = 30;
	float salary = 55000.75f;
	char gender = 'M';
	boolean	acceptTerms = true;
	float rating = 4.5f;
	long mobileNumber = 9876543210l;
	int pinCode = 56001;
	int	luckyNumber = 7;
	
	System.out.println("Name is: "+name);
	System.out.println("Age is: "+age);
	System.out.println("Salary is: "+salary);
	System.out.println("Gender is: "+gender);
	System.out.println("Terms Acceptance status is: "+acceptTerms);
	System.out.println("Rating is: "+rating);
	System.out.println("Mobile number is: "+mobileNumber);
	System.out.println("Pincode is: "+pinCode);
	System.out.println("Lucky Number is: "+luckyNumber);

	
}

}
