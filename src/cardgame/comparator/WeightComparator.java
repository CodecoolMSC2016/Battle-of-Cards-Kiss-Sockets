package cardgame.comparator;

import java.util.Comparator;

import cardgame.Car;

public class WeightComparator implements Comparator<Car> {

	@Override
	public int compare(Car player1Card, Car player2Card) {
		return player2Card.weight - player1Card.weight;
	}

}