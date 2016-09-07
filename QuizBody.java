import java.util.Random;
import java.util.Scanner;


public class QuizBody extends Questions {
	final int NO_OF_QUESTIONS = 5;
	int []selected_que = {0,1,2,3,4};
	int score = 0;
	
	public void starthere() {
		int j = 0;
		shuffle_que();
		Scanner inputFrmUsr = new Scanner(System.in);
		int m = 0;
		int correct = 0;
		System.out.println("----------------------------------------------------------------");
		for (j = 0; j <NO_OF_QUESTIONS; j++){
				System.out.println(j + 1 + "> " + questions[selected_que[j]] [0]);
				System.out.println(answers[selected_que[j]]);
				System.out.print("\nYour answer (1-4): ");
				m = inputFrmUsr.nextInt();
			//	System.out.print("\n----------------------------------------------------------------");
				while (m != 1 && m != 2 && m != 3 && m != 4){
					System.out.println("Invalid choice! try again!!");
					System.out.print("\nYour answer (1-4): ");
					m = inputFrmUsr.nextInt();		
				} 
				System.out.println("----------------------------------------------------------------");
				
			
			
				correct = Integer.parseInt(questions[selected_que[j]][1]); 
				if (m == correct) {
					score+= 10;;
					System.out.println("You are correct!");
					System.out.println("----------------------------------------------------------------");
					
				} else {
					System.out.println("You are wrong! Correct Ans: " + correct );	
					System.out.println("----------------------------------------------------------------");
					
				}
			
		} // end of for loop
		System.out.println("----------------------------------------------------------------");
		System.out.println("                          END OF QUIZ");
		System.out.println("----------------------------------------------------------------");
		System.out.println("  YOUR SCORE: " + score);
		System.out.println("----------------------------------------------------------------");
		
	}
	
	public void shuffle_que() {
		int i = 0;
		for (i = 0; i < 5; i++){
			Random r1 = new Random();
			int index = r1.nextInt(NO_OF_QUESTIONS);
			int temp = selected_que[i];
			selected_que[i] = selected_que[index];
			selected_que[index] = temp;
		}
			
	}
	
	
	
	
}
