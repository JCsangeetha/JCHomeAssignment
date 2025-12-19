package week2.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		
		String test="changeme";
		
		char[] charArray = test.toCharArray();
		
		int length=charArray.length;
		
		//System.out.println(length);
		//System.out.println(charArray[7]);
		
		for(int i=0;i<length;i++)
		{
			if((i%2)!=0) 
			{
				charArray[i]=Character.toUpperCase(charArray[i]);
			}
			
			//System.out.println(charArray[i]);
			}		
		//System.out.println("OddIndexValueInUppercase"+charArray);o/p :OddIndexValueInUppercase[C@5ca881b5-->need to clarify
		System.out.println(charArray);
	}

}
