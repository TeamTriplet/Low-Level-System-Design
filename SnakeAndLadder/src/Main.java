import SnakeAndLadder.Model.Player;
import SnakeAndLadder.SnakeAndLadder;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int boardSize = 4;
        int numberOfSnakes = 2;
        int numberOfLadder = 2;
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("P1", 0));
        playerList.add(new Player("P2", 0));
        playerList.add(new Player("P3", 0));
        int numberOfDice = 1;
        SnakeAndLadder snakeAndLadder = new SnakeAndLadder(boardSize, numberOfSnakes, numberOfLadder, playerList, numberOfDice);
        System.out.println("Winner of the game is : " + snakeAndLadder.startGame());
    }
}