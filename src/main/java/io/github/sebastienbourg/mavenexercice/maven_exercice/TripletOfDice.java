/**
 * 
 */
package io.github.sebastienbourg.mavenexercice.maven_exercice;

/**
 * @author sebas
 *
 */
public class TripletOfDice {
	
	/**
	 * @param args
	 */
	
	   private int die1;   // Number showing on the first die.
	   private int die2;   // Number showing on the second die.
	   private int die3;   // Number showing on the second die.
	   
	   public TripletOfDice() {
		   rollAllDie();  // Call the roll() method to roll the dice.
	}
	
	/**
	 * Roll the dice by setting each die to be a random number between 1 and 6.
	 */
	public void rollAllDie() {
	    die1 = (int)(Math.random()*6) + 1;
	    die2 = (int)(Math.random()*6) + 1;
	    die3 = (int)(Math.random()*6) + 1;
	}
	
	public void rollOneDie(int die_number) {
		if (die_number == 1) {
			die1 = (int)(Math.random()*6) + 1;
		}
		else if (die_number == 2) {
			die2 = (int)(Math.random()*6) + 1;
		}
		else if (die_number == 3) {
			die3 = (int)(Math.random()*6) + 1;
		}
		else {
			IllegalArgumentException exc = new IllegalArgumentException("Value must be in 1,2,3.");
			throw exc;
		}
	}
	    
	public int getFirstDie() {
		return die1;
	    }
	public int getSecondDie() {
	       return die2;
	    }
	public int getThridDie() {
	       return die3;
	    }
	
	public void setFirstDie( int value ) {
	       if ( value < 1 || value > 6 )
	          throw new IllegalArgumentException("Illegal dice value " + value);
	       die1 = value;
	    }
	
	public void setSecondDie( int value ) {
	       if ( value < 1 || value > 6 )
	          throw new IllegalArgumentException("Illegal dice value " + value);
	       die2 = value;
	    }
	
	public void setThridDie( int value ) {
	       if ( value < 1 || value > 6 )
	          throw new IllegalArgumentException("Illegal dice value " + value);
	   die3 = value;
	}
	    
		
	}
