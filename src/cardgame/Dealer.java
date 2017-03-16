package cardgame;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dealer {

	Player player1;
	Player player2;
	
	public Dealer(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	public void deal() {
		List<Car> cards = Arrays.asList(Car.values());
		Collections.shuffle(cards);
		
		boolean toPlayer1 = true;
		
		for (Car car : cards) {
			if (toPlayer1) {
				player1.addCard(car);
			} else {
				player2.addCard(car);;
			}
			toPlayer1 = !toPlayer1;
		}
	}
}
