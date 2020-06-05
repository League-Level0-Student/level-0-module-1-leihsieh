package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String input = JOptionPane.showInputDialog("Riddle 1:\nBrothers and sisters I have none \nbut this man's father is my father's son.\nWho is the man?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(input.equalsIgnoreCase("his son")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct! Your score is now " + score);
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! The correct answer was 'his son'. You have " + score + " points.");
		}
		// 6. Add some more riddles
		String input2 = JOptionPane.showInputDialog("Riddle 2: \nWhat is greater than God,\n" + 
				"more evil than the devil,\n" + 
				"the poor have it,\n" + 
				"the rich need it,\n" + 
				"and if you eat it, you'll die?");
		if(input2.equalsIgnoreCase("nothing")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct! Your score is now " + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! The correct answer was 'nothing'. You have " + score + " points.");
		}
		String input3 = JOptionPane.showInputDialog("Who makes it, has no need of it.\n" + 
				"Who buys it, has no use for it.\n" + 
				"Who uses it can neither see nor feel it.\n" + 
				"What is it? ");
		if(input3.equalsIgnoreCase("a coffin")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct!Your final score was " + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! The correct answer was 'a coffin'.");
			JOptionPane.showMessageDialog(null, "Your final score was " + score);
		}
		// 2. Make a pop up to show the score.
	}
}

