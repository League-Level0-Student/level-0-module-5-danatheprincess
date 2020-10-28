package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("what kind of pet do you want to buy ?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
while(happinessLevel<=30) {
	

	
		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "what do you want to do to make your pet happy?", "Happy Pet", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "playtime", "feed", "groom" }, null);

		// 5. Use user input to call the appropriate method created in step 4.
		if (task == 0) {
			playtime(pet);
		} else if (task == 1) {
			feed(pet);
		
		} else {
			groom(pet);
		}
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
}
	JOptionPane.showMessageDialog(null,"You love your pet!!");

	}
	
	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void playtime(String pet) {
		if (pet.equalsIgnoreCase("dog")) {
			happinessLevel += 10;
			System.out.println("woof");
		}
		if(pet.equalsIgnoreCase("cat")) {
			happinessLevel+=7;
			System.out.println("purr");
		}
		if(pet.equalsIgnoreCase("horse")) {
			happinessLevel+=10;
			System.out.println("neigh");
		}
	}
	

	static void feed(String pet) {
		if (pet.equalsIgnoreCase("dog")) {
			happinessLevel += 5;
			System.out.println("woof");
		}

	
	if(pet.equalsIgnoreCase("cat")) {
		happinessLevel+=10;
		System.out.println("purr");
	}
	if(pet.equalsIgnoreCase("horse")) {
		happinessLevel+=7;
		System.out.println("neigh");
	}
	}
	static void groom(String pet) {
		if (pet.equalsIgnoreCase("dog")) {
			happinessLevel += 6;
			System.out.println("woof");
		}
		if(pet.equalsIgnoreCase("cat")) {
			happinessLevel+=4;
			System.out.println("purr");
		}
		if(pet.equalsIgnoreCase("horse")) {
			happinessLevel+=5;
			System.out.println("neigh");
		}
	}
}

