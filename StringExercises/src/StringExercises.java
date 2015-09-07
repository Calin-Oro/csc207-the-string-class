//Felipe Gentle and Yue Yu

import java.util.Scanner;

public class StringExercises {

	public static boolean forgivingPrompt (String str)
	{
		System.out.println(str);
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		if ((answer.charAt(0) == 'y') || (answer.charAt(0) == 'Y')){

			return true;

		}
		else if ((answer.charAt(0) == 'n') || (answer.charAt(0) == 'N'))
		{
			return false;
		}else System.out.println("This is an invalid answer. YES OR NO");
		forgivingPrompt(str);
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(forgivingPrompt("Why does the caged bird sing?"));
	}

}
