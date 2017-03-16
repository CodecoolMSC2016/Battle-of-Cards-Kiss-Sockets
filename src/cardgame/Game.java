package cardgame;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import cardgame.comparator.AccelerationComparator;
import cardgame.comparator.CylinderComparator;
import cardgame.comparator.DisplacementComparator;
import cardgame.comparator.SpeedComparator;
import cardgame.comparator.WeightComparator;

public class Game  {
	Player player1;
	Player player2;
	Comparator<Car> comparator;
	Map<String, Comparator<Car>> comparatorMap = new HashMap<>();

	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void playGame() {
		System.out.println("QUARTETT GAME: \n");
		
		Dealer dealer = new Dealer(player1, player2);
		
		dealer.deal();
		selectPlayer();
		createComparatorMap();
		compareCards();
		endGame();
	}
	
	public void createComparatorMap() {
		comparatorMap.put("s", new SpeedComparator());
		comparatorMap.put("w", new WeightComparator());
		comparatorMap.put("d", new DisplacementComparator());
		comparatorMap.put("c", new CylinderComparator());
		comparatorMap.put("a", new AccelerationComparator());
	}
	
	public void selectPlayer() {
		int input;
		boolean validInput = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Which player would like to start the game? [1/2]");
		input = scan.nextInt();
		
		while(!validInput)
		if(input == 1) {
			System.out.println("Player1 card: " + player1.getHandOfPlayer().get(0));
			validInput = true;
		} else if (input == 2) {
			System.out.println("Player2 card: " + player2.getHandOfPlayer().get(0));
			validInput = true;
		} else {
			System.out.println("Not valid input! \n");
			System.out.println("Which player would like to start the game? [1/2]");
			input = scan.nextInt();
		}
	}
	
	public void readInput() {
		String input = "";
		String[] good = {"S", "W", "D", "C", "A", "s", "w", "d", "c", "a"};
		
		while (!Arrays.asList(good).contains(input)) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please Choose an option from the followings:");
			System.out.println("[S] = TopSpeed, [W] = Weight, [D] = Displacement, [C] = Cylinder, [A] = Acceleration");
			String option = scan.nextLine();
			input = option.toLowerCase();
		}
		
		comparator = comparatorMap.get(input);
	}
	
	public void compareCards() {
		int tempComp;
		
		readInput();
		
		for (int i = 0; i < player2.getHandOfPlayer().size(); i++) {
			tempComp = comparator.compare(player1.getHandOfPlayer().get(i), player2.getHandOfPlayer().get(i));

			System.out.println("\n" + (i + 1) + ".round:");
			System.out.println("Player1 card: " + player1.getHandOfPlayer().get(i) + 
					"\nPlayer2 card: "+ player2.getHandOfPlayer().get(i));

			if (tempComp == 0) {
				System.out.println("Same parameter \n");
				continue;
			}
			if (tempComp > 0) {
				player1.addScore();
				System.out.println("Round won by Player1 \n");
				if (i < 15) {
					player1.showCard(i + 1);
				}
			} else {
				player2.addScore();
				System.out.println("Round won by Player2 \n");
				if (i < 15) {
					player2.showCard(i + 1);
				}
			}
			if (i < 15) {
				readInput();
			}
		}
	}
	
	public void endGame() {
		System.out.format("Player 1 Score: %s %n", player1.getScore());
		System.out.format("Player 2 Score: %s", player2.getScore());

		if (player1.getScore() > player2.getScore()) {
			System.out.println("\n\nGame won by Player1!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("\n\nGame won by Player2!");
		} else {
			System.out.println("\n\nWin-Win!!");
		}
	}
}
