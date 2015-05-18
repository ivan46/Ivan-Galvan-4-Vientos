package org.cuatrovientos.craps;
import java.util.Random;


/**
 * A press-your-luck game where you roll two dices and 
 * when you get the same in both you win.
 * @author nigga 
 * this is the shit ya nigga
 *
 */
public class craps {

	public double money; // player money
	private double pbet; // players last bet
	private double betz; // total bets
	Random random = new Random();
	int d1, d2;
	
	/**
	 * constructor, player begins with initial money
	 * @param money
	 */
	public craps (double money) {
		this.money = money;
	}
	
	/**
	 * player puts bet, and we add random money from other players
	 */
	public void putb (double plbet) {
		pbet = plbet;
		betz = pbet + random.nextInt(100);
	}
	
	/**
	 * rolling two 6D dices...
	 */
	public void roll () {
		d1 = random.nextInt(6);
		d2 = random.nextInt(6);
	}
	
	/**
	 * tells if player wins or not
	 * @return
	 */
	public boolean winOrwhat () {
		boolean result = false;
		
		if (d1 == d2) {
			result = true;
		}
		
		return result;
	}
	
	/**
	 * player loses we substract last bet from total money
	 */
	public void lose () {
		money -= pbet;
	}

	/**
	 * player wins all the money
	 */
	public void win () {
		money += betz;
	}
	
}
