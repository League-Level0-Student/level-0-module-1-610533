package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		String ans = JOptionPane.showInputDialog("Hey! What is the square root of 4?");
		
		String ans2 = JOptionPane.showInputDialog("What is the square root of 16?");
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(ans.equals("2")) {
			score=score+1;
		}
		else { JOptionPane.showMessageDialog(null, "Wrong! It was actually 2!");
			score=score-1;
		}
		if(ans2.equals("4")) {
			score=score+1;
		}
		else {JOptionPane.showMessageDialog(null, "Wrong! It was actually 16!");
			score=score-1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "You got "+score+" Points.");
	}
}

