//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
	// 1. Make a main method that includes all the steps below….
		
	// -- done.
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	int random= new Random().nextInt(4);
		
	// 3. Print out this variable
System.out.println(random);
	// 4. Get the user to enter a question for the 8 ball
for (int i = 0; i < 3; i++) {	
	
}
JOptionPane.showMessageDialog(null, "Hello user! Today you will be playing the Magic 8 Ball!");
JOptionPane.showInputDialog("Please enter your question here to find out the answer!");
	// 5. If the random number is 0
if(random==0) {
	JOptionPane.showMessageDialog(null, "Yes.( ✧≖ ͜ʖ≖)");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if(random==1) {
	JOptionPane.showMessageDialog(null, "No. (▀̿Ĺ̯▀̿ ̿)");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if(random==2) {
	JOptionPane.showMessageDialog(null, "Ask Google. ( ͡ಥ ͜ʖ ͡ಥ)");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if(random==3) {
	JOptionPane.showMessageDialog(null, "Maybe... ( ͡° ͜ʖ ͡°)");
}
	// -- write your own answer

	}
			}