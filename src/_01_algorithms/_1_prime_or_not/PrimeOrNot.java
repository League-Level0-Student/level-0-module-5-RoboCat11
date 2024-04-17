package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args){
		String input = JOptionPane.showInputDialog("Please give the computer a number.");	
		int number = Integer.parseInt(input);
		for(int i=2; i<number; i++) {
			if(number % i==0) {
				JOptionPane.showMessageDialog(null, "The number is not prime.");
			}
			else {
				JOptionPane.showMessageDialog(null, "The number is prime.");	
			}
		}

















	}
}