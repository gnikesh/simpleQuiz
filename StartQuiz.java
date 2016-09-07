import java.util.Random;
import java.util.Scanner;


public class StartQuiz {
	public static void main (String [] argv){
		QuizBody q1 = new QuizBody();
		Scanner start = new Scanner(System.in);

		System.out.println("-----------------------------------------------------------");
		System.out.println("             WELCOME TO THE WORLD QUIZ !!                  ");
		System.out.println("-----------------------------------------------------------");
		System.out.println("RULES: \n");
		System.out.println("1. EACH QUESTION CARRIES 10 MARKS");
		System.out.println("2. NO MARKS DEDUCTION FOR WRONG ANSWER");
		System.out.println("3. YOU CANNOT QUIT BEFORE GAMES FINISHES ONCE YOU START");
		System.out.println("------------------------------------------------------------");
		System.out.println("                   GOOD LUCK!                               ");
		System.out.println("------------------------------------------------------------");
		System.out.println("1. START ");
		System.out.println("2. ABOUT ME ");
		System.out.println("3. EXIT");
		System.out.println("------------------------------------------------------------");
		System.out.print("YOUR CHOICE (1-3): ");
		int choice = start.nextInt();
		if (choice == 1) {
			q1.starthere();
		}
		else if (choice == 2){
			System.out.println("------------------------------------------------------------");
			System.out.println("            QUIZ CREATED BY: NIKESH GYAWALI                 ");
			System.out.println("------------------------------------------------------------");
			
		}else {
			System.out.println("------------------------------------------------------------");
			System.out.println("               HAVE A WONDERFUL DAY!                        ");
			System.out.println("------------------------------------------------------------");
		}  
	}
	
	
}
