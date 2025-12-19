package week2.day1;

public class ReverseOddWordsInString {

	public static void main(String[] args) 
	{
		String test = "I am a software tester";
		//Expected output: “I ma a erawtfos tester”
		
		//Split the words and have it in an array
		 String[] splitText= test.split(" ");
		 
		 //Traverse through each word using loop
		 
		 for(int i=0;i<splitText.length;i++)
		 {
			 //Find the odd index within the loop
			 if(!(i%2==0))
				{
				 // Convert the String array into a character array(only odd index)
				 char[] words=splitText[i].toCharArray();	
				 
				 String reversed="";
				 
				 //reversing the characters 
				 for(int j=words.length-1;j>=0;j--)//j=1;j>=0;j--,j=7; j>=0;j--
				 {
					 //Concatenation of empty string and character gives string; 
					 //concatenation of string and char gives string
					 reversed = reversed+ words[j];//""+'m'="m";"m"+'a'="ma"
				 }		
				//replacing the odd index string after reversing and converting it into the String form character
				 splitText[i] =reversed;
				 }
			 
			 //iterating to print the final (odd index reversed and even index remains the same) sentence 
			 //from string of array to String
			 }
		 for(String finalText:splitText) //iterating through each index and storing it in the String variable finalText
		 {
			 System.out.print(finalText+" ");//to print it in the same line but with space in between the words
		 }
	}
	}

