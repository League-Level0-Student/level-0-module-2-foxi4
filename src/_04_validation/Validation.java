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
for (int i = 0; i < 10; i++) {
if(randomNumber==0) {
JOptionPane.showMessageDialog(null, "This sentence contains exactly threeee errors.");}
if(randomNumber==1) {
JOptionPane.showMessageDialog(null, "If you are reading this, have a good day!");}
if(randomNumber==2) {
JOptionPane.showMessageDialog(null, "Why did the skeleton go to the party alone? Cuz they had no BODY to go with.");}
if(randomNumber==3) {
JOptionPane.showMessageDialog(null, "Why do we tell actors to break a leg? So they can get into a cast!");}
if(randomNumber==4) {
JOptionPane.showMessageDialog(null, "And the Lord said unto John, 'Come forth and you will recieve eternal life.' But John came fifth, and won a toaster.");}
if(randomNumber==5) {
JOptionPane.showMessageDialog(null, "Parallel lines have so much in common. Its a shame they'll never meet.");}
if(randomNumber==6) {
JOptionPane.showMessageDialog(null, "I broke my finger last week. On the other hand, I'm okay.");}
if(randomNumber==7) {
JOptionPane.showMessageDialog(null, "Someone took my mood ring, I don't know how to feel about that.");}
if(randomNumber==8) {
JOptionPane.showMessageDialog(null, "I tried to catch fog yesterday... mist.");}
if(randomNumber==9) {
JOptionPane.showMessageDialog(null, "How does Moses make his coffee? Hebrews it.");}
}
		// 2. Repeat all the code above 10 times
				// 3. Find someone to test out your program. They will like it :)
	}}
				
