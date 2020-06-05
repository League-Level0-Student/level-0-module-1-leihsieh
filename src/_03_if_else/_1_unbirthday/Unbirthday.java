package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		
	String input = JOptionPane.showInputDialog("What is your birthday? (mm/dd)");
	String date = "06/05";
	
	if(input.equals(date)) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
	else {
		JOptionPane.showMessageDialog(null, "Happy UN-birthday");
	}
		
	}
}
