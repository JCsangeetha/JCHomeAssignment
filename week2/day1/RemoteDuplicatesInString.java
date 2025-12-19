package week2.day1;

import java.util.Arrays;

public class RemoteDuplicatesInString {
	
public static void main(String[] args) {
	
	String text = "we learn Java basics as part of java sessions in java week1";
	//expected output: "we learn Java basics as part of sessions in week1";
	
	//Initialize a variable ‘count’ to keep track of the number of duplicate words found
	int count=0;
	
	//Split the text into an array of words using space as the delimiter
	String[] splitted_word = text.split(" ");
	int arrayLength = splitted_word.length;
	System.out.println("String of array length is:"+arrayLength);
	
	//Create two nested for loops to compare each word with every other word in the String array
	for(int i=0; i<arrayLength;i++) 
	{
		for(int j=i+1;j<arrayLength;j++)
		{
		if(splitted_word[i].equalsIgnoreCase(splitted_word[j])) 
			{
				
			splitted_word[j]="";
			count=count+1;
			
			System.out.println("Step by step replacing duplicates with empty string: "+Arrays.toString(splitted_word));
			}
		}
		}
	
	for(String modifiedText :splitted_word )
	{
		if(!(modifiedText.isEmpty())) 
		{
			System.out.print(modifiedText+" ");
		}
	}
	
}}

