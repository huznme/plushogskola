package assignment2;

public class CharAnalyzer {
	
	public static void main(String[] args) {
	
		if(args.length<1)
		{
			System.out.println("Please provide string to Analyze");
			System.exit(0);
		}
		char[] charArray = args[0].toCharArray();
		
		for(int i=0;i<charArray.length;i++)
		{
			char s = charArray[i];
			if (Character.isDigit(s))
			{
				System.out.println(i + " : Is not a letter");
			}else if (Character.isLowerCase(s))
			{
				System.out.println(i + " : Is lowercase");
				
			}else if (Character.isUpperCase(s))
			{
				System.out.println(i + " : Is uppercase");
				
			}
			
		}
	}

}
