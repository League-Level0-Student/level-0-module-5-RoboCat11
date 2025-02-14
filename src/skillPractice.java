import javax.swing.JOptionPane;

public class skillPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("How many dimes do you have?");
		int num = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, "You have " + num*10 + " cents.");
		String input1 = JOptionPane.showInputDialog("How tall are you? (Answer in inches.)");
		if (input.contains("")) {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
		}
		String input2 = JOptionPane.showInputDialog("What city to you live in?");
		if (input.contains("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city.");
		} else if(input.equals(3)) {
			JOptionPane.showMessageDialog(null, "You need to move to San Diego!");
			int cars=2;
			if(input.contains("0")) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation.");	
			}
			String input3 = JOptionPane.showInputDialog("What is the name of your school?");
			if(input.equals(input2)) {
			JOptionPane.showMessageDialog(null, input3 + " is a fantastic school");	
			}
		}
	}

}
