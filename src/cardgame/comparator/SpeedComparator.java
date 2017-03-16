package cardgame.comparator;

import java.util.Comparator;

import cardgame.Car;

public class SpeedComparator implements Comparator<Car> {

	@Override
	public int compare(Car player1Card, Car player2Card) {
		return player1Card.tSpeed - player2Card.tSpeed;
	}

}
