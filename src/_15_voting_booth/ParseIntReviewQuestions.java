package _15_voting_booth;

import javax.swing.JOptionPane;

public class ParseIntReviewQuestions {
	public static void main(String[] args) {
		//1. Ask the user how many cups of flour they have. If they have less than 2 cups, tell
		//them to go to the store to buy more.
		int needflour= 2;
		String flour=JOptionPane.showInputDialog("How many cups of flour do you have?");
		int num = Integer.parseInt(flour);
		if(num < needflour) {	
			JOptionPane.showMessageDialog(null, "Go to the store and buy more.");
		}
		if(num > needflour) {
			JOptionPane.showMessageDialog(null, "Good, you will have enough for cookies.");
		}
		
		
		//2. Now ask them how many people they are going to give cookies to. If they are going
		//to give cookies to more than 30 people, tell them they are going to have to bake two
		//batches of cookies! 
		int needpeople = 30;
		String people = JOptionPane.showInputDialog("How many people are you going to give cookies too?");
		int number = Integer.parseInt(people);
		if(number > needpeople) {
			JOptionPane.showMessageDialog(null, "You're going to have to make two batches of cookies.");
		}
		if(number < needpeople) {
			JOptionPane.showMessageDialog(null, "Great!");
		}
		//3. Finally, ask them how many batches of cookies they baked. If they baked 2 batches
		//of cookies, tell them they are lucky to have so many friends. 
		int needbatches = 1;
		String batches = JOptionPane.showInputDialog("How many batches of cookies did you bake? 1 or 2?");
		int number2 = Integer.parseInt(batches);
		if(number2 == needbatches) {
			JOptionPane.showMessageDialog(null, "Cool.");
		}
		if(number2 > needbatches) {
			JOptionPane.showMessageDialog(null, "You're lucky to have so many friends!");
		}
	}
}
