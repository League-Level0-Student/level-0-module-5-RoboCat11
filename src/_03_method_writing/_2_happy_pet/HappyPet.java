package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String input = JOptionPane.showInputDialog(null,
						"What kind of pet would you like to buy? I have turtles, dogs, cats,"
								+ " hummingbirds, coyotes, and wolves!",
						"Lele's Pet Store", JOptionPane.QUESTION_MESSAGE);
		String pet = "";
		if (input.contains("turtle")) {
			pet = "turtle";
		} else if (input.contains("dog")) {
			pet = "dog";
		} else if (input.contains("cat")) {
			pet = "cat";
		} else if (input.contains("humminbird")) {
			pet = "hummingbird";
		} else if (input.contains("coyote")) {
			pet = "coyote";
		} else if (input.contains("wolf")) {
			pet = "wolf";
		} else {
			JOptionPane.showMessageDialog(null,
					"I already gave you the options of pets that I have. And I don't have that pet!");
			System.exit(0);
		}
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!

		// 4. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy

		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "Which activity would you like to do with your pet?",
				"Lele's Pet Store", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Feed your " + pet, "Clean your " + pet, "Play with your " + pet,
						"Clean up your " + pet + "'s poop ", "Watch a movie with your " + pet, "cage your " + pet },
				null);

		System.out.println(task);

		// 5. Create methods to handle each of your user selections.
		// Each method should create a pop-up with the pet's response (eg. cat might
		// purr when pet),
		// and INCREMENT the pet's happiness Level.

		// 6. Use user input to call the appropriate method created in step 5 below.

		// 7. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}
}