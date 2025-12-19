package week1.day2;

public class IsPrimeNumber {
	/*conditions for a prime number
	 *Natural number>1
	 *has only two factors -1 and itself
	 */
	
public static void main(String[] args) {
	int num=13;//declaring the number to local variable ,to check if it is prime or not
	int count=0;//to count the no.of times the given number is divisible
	
	//condition1 :Natural number>1
	if(num>1) 
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("The given number:"+num+" is divisible by: "+i);
				count=count+1;
			}
			else 
			{
			System.out.println("The given number:"+num+" is not divisible by: "+i);
			}
	}
		if(count>1) 
		{
			System.out.println("The given number: "+num+" is not a prime number");
		}
		else 
		{
		System.out.println("The given number:"+num+" is a prime number");
		}
		
	}
	}}

