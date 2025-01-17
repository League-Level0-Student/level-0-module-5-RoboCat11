package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 15;
	static String pet = "";
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String input = JOptionPane.showInputDialog(null,
				"What kind of pet would you like to buy? I have turtles, dogs, cats,"
						+ " hummingbirds, coyotes, and wolves!",
						"Lele's Pet Store", JOptionPane.QUESTION_MESSAGE);
		
		if (input.contains("turtle")) {
			pet = "turtle";
		} else if (input.contains("dog")) {
			pet = "dog";
		} else if (input.contains("cat")) {
			pet = "cat";
		} else if (input.contains("hummingbird")) {
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
		while(true) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy

			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Of course! Now, the next step of buying a pet\n is to decide which activity you would like to do\n with it.",
					"Lele's Pet Store", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cage your " + pet, "Watch a movie with your " + pet, "Play with your " + pet,
							"Clean up your " + pet + "'s poop ","Clean your " + pet, "Feed your " + pet },
					null);

			System.out.println(task);
			if(task==0) {  // Cage your pet
				cagePet();

			}if (task==4) {
			bathePet();	
			}



			// 5. Create methods to handle each of your user selections.
			// Each method should create a pop-up with the pet's response (eg. cat might
			// purr when pet),
			// and INCREMENT the pet's happiness Level.

			// 6. Use user input to call the appropriate method created in step 5 above.

			// 7. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.

			if(happinessLevel>=50) {
				JOptionPane.showMessageDialog(null,"Good job! You have made your pet happy!");	
				break;
			}
			if(happinessLevel<=0) {
				JOptionPane.showMessageDialog(null,"WHAT IS WRONG WITH YOU?!!\n Your pet is angry, not\n happy! "
						+ "I can guarantee you\n that your pet will bite\n your face off tonight. ");
				break;
			}
		}
	}
	
	static void cagePet() {
		if(pet.equals("wolf")) {
			// wolf specific reaction to Cage
			
			// pop up a message dialog with wolf specific reaction
			JOptionPane.showMessageDialog(null, "Wolf says, 'How dare you cage me!\n I will plot my revenge against you\n"
					+ " while I am in this cage, and\n you will be sorry that you caged\n me!' Two weeks later, you release your\n"
					+ " pet wolf, thinking that he/she is no\n longer angry at you. Immediately after\n you let him/her out,"
					+ " he/she jumps at\n you and kills you. If this was\n your first pet, maybe try getting a\n different pet"
					+ " next time.");
			happinessLevel -= 3;
	
		}else {
			//All other pets:
			
			happinessLevel -= 1;
			
		}
	}
	
	static void bathePet () {
		if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null,"Cat says, 'Yow! No, no! Stop it! I'm warning you!\n"
					+ " I'm gonna bite you! Ah! It's too slippery!' While your cat is saying this \n"
					+ "in a language you do not speak, you are trying to calme him/her down, but \n"
					+ "he/she eventually bites you, and a few days later you get infected. If this \n"
					+ "was your first pet, try getting a different pet next time.");
			happinessLevel -= 1;
			// cat specific reaction to cage
		}else { // all the other pets
 happinessLevel +=10;
		}
	}
	
	static void feedPet () {
		
		happinessLevel +=10;
		
	}
	

}

