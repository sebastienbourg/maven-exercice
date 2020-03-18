package io.github.sebastienbourg.mavenexercice.maven_exercice;

public class DiceUser {

	public static TripletOfDice rollOnce() {
		TripletOfDice dice;
		dice = new TripletOfDice(6);
		dice.rollAllDie(6);
		
		return dice;
	}
	
	
	public static void main(String[] args) {
		TripletOfDice dice;
		dice = rollOnce();
		
		
		System.out.println("The die number 1 is a ", dice.getFirstDie());
		System.out.println("The die number 2 is a ", dice.getFirstDie());
		System.out.println("The die number 3 is a ", dice.getFirstDie());

	}

}
