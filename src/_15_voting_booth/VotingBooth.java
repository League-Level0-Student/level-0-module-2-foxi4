package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		int needage = 18;
		String age = JOptionPane.showInputDialog("How old are you?");
		int num = Integer.parseInt(age);
		if(num < needage) {
			JOptionPane.showMessageDialog(null, "I was going to ask you who the next president should be, but your opinion doesn't matter.");
		}
		if(num > needage) {
			JOptionPane.showInputDialog("Who should the next president be?");
		}
		
		
		
		
		
	}
}
