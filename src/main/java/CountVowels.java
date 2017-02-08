import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int count = CountVowelsF(input);
		System.out.println(count);

	}

	public static int CountVowelsF(String input) {
		int count=0;
		char[] vowels={'a','e','o','u','i'};
		for (int i=0; i<input.length();i++)
		{
			for (int j=0;j<vowels.length;j++)
			{
				if (input.charAt(i)==vowels[j])
				{
						count++;
				}
			}
		}
		
		return count;
	}

}

