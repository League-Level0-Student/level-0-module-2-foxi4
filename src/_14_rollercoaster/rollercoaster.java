package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {
	public static void main(String[] args) {
		int needheight = 48;
		String height= JOptionPane.showInputDialog("Hello user, I will be deciding if you can go on the roller coaster, but first, I need your height in inches.");
		int num = Integer.parseInt(height);
		if(num < needheight) {
			JOptionPane.showMessageDialog(null,"Sorry, you're too short- drink more milk!");
		}
		if(num > needheight) {
			JOptionPane.showMessageDialog(null, "You may pass.");
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
