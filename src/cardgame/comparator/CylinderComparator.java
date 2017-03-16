package cardgame.comparator;

import java.util.Comparator;

import cardgame.Car;

public class CylinderComparator implements Comparator<Car> {

	@Override
	public int compare(Car player1Card, Car player2Card) {
		return player1Card.cylinder - player2Card.cylinder;
	}

}
