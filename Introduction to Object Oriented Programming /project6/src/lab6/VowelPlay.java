package lab6;
import java.util.Scanner;

public class VowelPlay 
{
	public static void main(String[] args) 
	{
		System.out.println(Initials("Cher"));
		System.out.println(firstVowel("gang"));
	}
	
	public static String Initials(String name) 
	{
		char first = '0';
		String newName = "";
		Scanner scanner = new Scanner(name);
		//loop
		while(scanner.hasNext()) 
		{
			first = scanner.next().charAt(0);
			newName = newName + "" + first;
		}
		return newName;
	}
	
	public static int firstVowel(String s) 
	{
		for (int i = 0; i < s.length(); i++)
			switch (s.charAt(i)) 
			{
				case 'a':
					return i;
				case 'e':
					return i;
				case 'i':
					return i;
				case 'o':
					return i;
				case 'u':
					return i;
				case 'A':
					return i;
				case 'E':
					return i;
				case 'I':
					return i;
				case 'O':
					return i;
				case 'U':
					return i;
			}
		return -1;
	}
}