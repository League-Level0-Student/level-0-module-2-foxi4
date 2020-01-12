//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
JOptionPane.showMessageDialog(null, "If you and Peppa Pig were in a beauty contest, Peppa Pig would win. Oh sorry wrong person.");
JOptionPane.showMessageDialog(null, "If you are reading this, have a good day!");
JOptionPane.showMessageDialog(null, "Why did the skeleton go to the party alone? Cuz they had no BODY to go with. Ok i'll walk myself out.");
JOptionPane.showMessageDialog(null, "You should be proud of yourself.");
JOptionPane.showMessageDialog(null, "And the Lord said unto John, 'Come forth and you will recieve eternal life.' But john came fifth, and won a toaster.");
JOptionPane.showMessageDialog(null, "Parallel lines have so much in common. Its a shame they'll never meet.");
JOptionPane.showMessageDialog(null, "I broke my finger last week. On the other hand, I'm okay.");
JOptionPane.showMessageDialog(null, "");

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
