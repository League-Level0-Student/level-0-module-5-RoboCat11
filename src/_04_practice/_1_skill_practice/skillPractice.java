package _04_practice._1_skill_practice;
import java.util.Random;

import javax.swing.JOptionPane;

public class skillPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("How many dimes do you have? (Enter "
				+ "only the number.)");
		int num = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, "You have " + num*10 + " cents.");
		String input1 = JOptionPane.showInputDialog("How tall are you? (Answer in inches.)");
		int heightInches = Integer.parseInt(input1);
		if (heightInches<36) {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
		}
		
		Random randomGenerator = new Random();
		int i = randomGenerator.nextInt(20);
		System.out.println(i);
		
		int ii = randomGenerator.nextInt(10);
		System.out.println(ii);
		
		String input2 = JOptionPane.showInputDialog("What city to you live in?");
		if (input2.contains("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city.");
		} else {
			JOptionPane.showMessageDialog(null, "You need to move to San Diego!");
			String input3 = JOptionPane.showInputDialog("How many cars do you have?");
			int cars=10;
			if(input3.contains("0")) {
				JOptionPane.showMessageDialog(null, "I bet you use public transportation.");	
			}
			String input4 = JOptionPane.showInputDialog("What is the name of your school?");
			String school = input4;
			if(school.equals(input4)) {
				JOptionPane.showMessageDialog(null, input4 + " is a fantastic school.");	
			}
		}
	}

}
