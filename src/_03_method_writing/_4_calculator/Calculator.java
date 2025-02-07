package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: BE A WEIRDO
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//They should each take 2 numbers as parameters
	//and return the answer.
		
	// 2) Make a static method called " result" that takes a number
	//as a parameter and returns the number in a string
	//EX: "Your answer is " + number;
	
	// 3) Call the correct method depending on what option the user chooses
		if(task==0) {
		  System.out.println(	   result(  divide(number1, number2)  )  ) ;
		}
		if(task==1) {
		 System.out.println(	result(divide(number1, number2) ) );
		}
		if(task==2) {
			
		}
		if(task==3) {
			
		}
	}
	// 4) Call the result() method and put the answer in a pop-up
		
	static String result(double n1) {
		return "Your answer is " + n1;
	}
	static double divide(int n1, int n2) {
		return n1/(double)n2;
	}
	static double multiply(int n1, int n2) {
		return n1*n2;
	}
	static double subtract( int n1, int n2) {
		return n1-n2;
	}
	static double add( int n1, int n2) {
		return n1+n2;
	}
}