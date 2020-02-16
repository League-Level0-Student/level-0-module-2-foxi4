package _06_lottery_numbers;
import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {


	Random randomMaker = new Random();
	
	
	int randomNumber = randomMaker.nextInt(5);
	int randomNumber1 = randomMaker.nextInt(5);
	int randomNumber2 = randomMaker.nextInt(5);
	int randomNumber3 = randomMaker.nextInt(5);
	int randomNumber4= randomMaker.nextInt(5);

		JOptionPane.showMessageDialog(null, randomNumber+ " "+ randomNumber1 + " "+ randomNumber2+ " "+ randomNumber3+ " "+ randomNumber4); 
	System.out.println(randomNumber);
	System.out.println(randomNumber1);	
	System.out.println(randomNumber2);	
	System.out.println(randomNumber3);	
	System.out.println(randomNumber4);
	}
	
}
