package cardgame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Car> handOfPlayer = new ArrayList<Car>();
	private int score = 0;

	public int getScore() {
		return score;
	}

	public void addScore() {
		this.score += 1;
	}

	public void addCard(Car car) {
		handOfPlayer.add(car);
	}

	public List<Car> getHandOfPlayer() {
		return handOfPlayer;
	}

	public void showCard(int index) {
		System.out.println(handOfPlayer.get(index));
	}
}
