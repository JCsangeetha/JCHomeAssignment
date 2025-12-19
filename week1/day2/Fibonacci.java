package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		
		int first=0;
		int second=1;
		for(int i=1;i<=8;i++) 
		{
			System.out.print(first+" ");
			int next = first+second;
			first=second;
			second=next;
		}
		
	}}