package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Text entry for counting
		System.out.print("Enter the text you want to count characters: ");
		String text = sc.nextLine();

		//Total character count
		int stringLength = text.length();
		System.out.println("Total characters: " + stringLength);
		
		//Character count without space
		int stringLengthWithoutSpaces = text.replace(" ", "").length();
		System.out.println("Total characters without the space: " + stringLengthWithoutSpaces);
		
		//Counting a specific character
		int totalCharacters = 0;
        char temp;
        
        System.out.print("Which specific character do you want to count? ");
        char character = sc.next().charAt(0);
        
        for (int i = 0; i < text.length(); i++) {

            temp = text.charAt(i);
            if (temp == character)
                totalCharacters++;
        }

        System.out.println("The character '" + character + "' appears " + totalCharacters + " times.");

		sc.close();

	}

}
