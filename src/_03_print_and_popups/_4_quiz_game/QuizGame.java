package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		int socer=0;
		// Create a variable to hold the user's score. Set it equal to zero. 
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String answer= JOptionPane.showInputDialog("what is 2+2");
				// 3.  Use an if statement to check if their answer is correct
				if(answer.equals("4")) {
					socer++;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				 answer=JOptionPane.showInputDialog("what is 4+4");
		
		// After all the questions have been asked, tell the user their final score 
				if(answer.equals("8")) {
					socer++;
				
			}
	answer=JOptionPane.showInputDialog("whatis 8+8");
	if(answer.equals("16")) {
		socer++;
		

	}
	
	answer=JOptionPane.showInputDialog("whatis 16+16");
	if(answer.equals("32")) {
		socer++;
	}
	JOptionPane.showMessageDialog(null, "youer socer is "+socer);
	
	
	}
}
