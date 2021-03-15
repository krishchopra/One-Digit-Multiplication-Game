package projects;

import java.util.Scanner;
import java.util.ArrayList;

class MultiplicationGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the 1 digit multiplication game! There will be 10 questions you must answer, after which you'll receive a score!");
		System.out.print("Hit 'enter' to get started :)");
		scan.nextLine();
		int pointTotal;
		int input;
		
		do {
      
      ArrayList<int[]> questionsWrong = new ArrayList<int[]>();
			pointTotal = 0;
		
			System.out.println();
			for (int i = 0; i < 10; i++) {
				int num1 = 2 + (int)(Math.random() * 8);
				int num2 = 2 + (int)(Math.random() * 8);
				System.out.println("What is " + num1 + " x " + num2 + "?");
				int response = scan.nextInt();
				if (response == num1 * num2) {
					pointTotal ++;
        } else {
          int[] wrong = new int[3];
          wrong[0] = num1;
          wrong[1] = num2;
          wrong[2] = response;
          questionsWrong.add(wrong);
        }
			} 
			
			System.out.println("\nYour score is: " + pointTotal + "/10.");
    
      if (pointTotal < 10) {
        System.out.println("\nQuestions you got wrong: ");
        for (int i = 0; i < questionsWrong.size(); i++) {
          int[] arr = questionsWrong.get(i);
          int num1 = arr[0];
          int num2 = arr[1];
          int wrongAnswer = arr[2];

          System.out.println(num1 + " x " + num2 + " (You entered " + wrongAnswer + ", correct answer was " + (num1 * num2) + ")");
        }
      } else {
        System.out.println("Excellent job! You got all the questions right.");
      }

			System.out.println("\nPlay again (Enter '1'): ");
			System.out.println("Exit game (Enter '2'): ");
			
			input = scan.nextInt();
			
			while (input != 1 && input != 2) {
				System.out.println("\nThat number was invalid. Please try again: ");
				System.out.println("Play again (Enter '1'): ");
				System.out.println("Exit game (Enter '2'): ");
        input = scan.nextInt();
			}
			
		} while (input != 2);

		System.out.print("\nLooking forward to seeing you again soon!");
		
		scan.close();
	}
}