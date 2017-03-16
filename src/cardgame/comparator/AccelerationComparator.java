package cardgame.comparator;

import java.util.Comparator;

import cardgame.Car;

public class AccelerationComparator implements Comparator<Car> {

	@Override
	public int compare(Car player1Card, Car player2Card) {
		int returner = (int)Math.round((player2Card.acceleration - player1Card.acceleration));
		return returner;
	}

}
