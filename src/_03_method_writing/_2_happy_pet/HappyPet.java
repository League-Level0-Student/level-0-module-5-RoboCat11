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
				"Hello! Welcome to Lele's Pet Store!\n My name is Jarvis."
				+ " What kind\n of pet would you like to\n buy? I have turtles, dogs,"
				+ " cats,\n hummingbirds, coyotes, and wolves!",
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
					new String[] { "Cage your " + pet, "Watch a movie with your " + pet, "Play with your " + pet,
							"Clean up your " + pet + "'s poop ","Clean your " + pet, "Feed your " + pet },
					null);

			System.out.println(task);
			if(task==0) {
				cagePet();

			}
			if (task==4) {
			bathePet();	
			}
			if(task==5) {
			feedPet();	
			}



			// 5. Create methods to handle each of your user selections.
			// Each method should create a pop-up with the pet's response (eg. cat might
			// purr when pet),
			// and INCREMENT the pet's happiness Level.

			// 6. Use user input to call the appropriate method created in step 5 above.

			// 7. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.

			if(happinessLevel>=35) {
				JOptionPane.showMessageDialog(null,"Good job! You have made your pet happy!");	
				break;
			}
			if(happinessLevel<=0) {
				JOptionPane.showMessageDialog(null,"WHAT IS WRONG WITH YOU?!!\n "
						+ "You were supposed to make\n"
						+ " your pet happy, not angry!\n "
						+ "I can guarantee you that \n"
						+ "your pet will bite or peck\n"
						+ " your face off tonight. ");
				break;
			}
		}
	}
	
	static void cagePet() {
		if(pet.equals("coyote")) {
		JOptionPane.showMessageDialog(null, "Coyote says, 'You will regret this day! For by tomorrow morning at dawn,\n"
				+ " I will bring my pack to this place, and they will give you a \n"
				+ "very slow, painful death!' The next morning, you never wake up,\n"
				+ " because by then, your coyote has already broken out of his/her\n"
				+ "cage, taken his/her pack, and they have eaten you. If this was\n"
				+ "your first activity wth your pet, try doing a different activity\n"
				+ " next time.");	
		}
		if(pet.equals("wolf")) {
			JOptionPane.showMessageDialog(null, "Wolf says, 'How dare you cage me!\n I will plot my revenge against you\n"
					+ " while I am in this cage, and\n you will be sorry that you caged\n me!' Two weeks later, you release your\n"
					+ " pet wolf, thinking that he/she is no\n longer angry at you. Immediately after\n you let him/her out,"
					+ " he/she jumps at\n you and kills you. If this was\n your first activity with your pet, maybe\n try doing"
					+ " a different activity next time.");
			happinessLevel -= 3;
	
		}else {
			happinessLevel -= 1;
			
		}
	}
	
	static void bathePet () {
		if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null,"Cat says, 'Yow! No, no! Stop it! I'm warning you!\n"
					+ " I'm gonna bite you! Ah! It's too slippery!' While your cat is saying this \n"
					+ "in a language you do not speak, you are trying to calm him/her down, but \n"
					+ "he/she eventually bites you, and a few days later you get infected. If this \n"
					+ "was your first activity with your pet, try doing a different activity next time.");
			happinessLevel -= 1;
			// cat specific reaction to cage
		}else { // all the other pets
 happinessLevel +=10;
		}
	}
	
	static void feedPet () {
		if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null,"Dog says,'Please can I have a bite of your burger?\n"
					+ " How about that steak over there? Can I have a treat?!' You notice that your\n"
					+ " dog is sitting five inches away from you, and he/she keeps on wagging his/her\n"
					+ " tail. So you think that he/she is hungry, and you get the pet food for your\n"
					+ " dog. When you give it your dog, he/she is sad, because you did not give him/\n"
					+ "her a treat! (which could be any kind of beef, and not ice cream or chocolate.)");
		}
		happinessLevel +=10;
		
	}
	

}

