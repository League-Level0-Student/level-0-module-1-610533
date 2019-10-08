package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import java.awt.Dialog;

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String Dave = "Dave"; String Remarkable = "Remarkable";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String Name = JOptionPane.showInputDialog("What is your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		{if(Name.equals(Dave))
		 JOptionPane.showMessageDialog(null, "Dave, you are Remarkable");
		 else JOptionPane.showMessageDialog(null, "Who are you?");
	}
}
}