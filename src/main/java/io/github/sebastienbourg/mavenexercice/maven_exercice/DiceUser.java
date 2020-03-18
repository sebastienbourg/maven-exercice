package io.github.sebastienbourg.mavenexercice.maven_exercice;

public class DiceUser {

	public static TripletOfDice rollOnce() {
		TripletOfDice dice;
		dice = new TripletOfDice();
		dice.rollAllDie();
		
		return dice;
	}
	
	
	public static void main(String[] args) {
		de = rollOnce();
		
		System.out.println("The die number 1 is a ", dice.getFirstDie());

	}

}
