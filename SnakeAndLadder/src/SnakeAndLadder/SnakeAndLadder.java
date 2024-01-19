package SnakeAndLadder;

import SnakeAndLadder.Model.Board;
import SnakeAndLadder.Model.Cell;
import SnakeAndLadder.Model.Dice;
import SnakeAndLadder.Model.Player;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SnakeAndLadder {
    Board board;
    Dice dice;
    Queue<Player> players = new LinkedList<>();
    Player winnerPlayer;

    public SnakeAndLadder(int boardSize, int numberOfSnakes, int numberOfLadders, List<Player> playerList, int numberOfDice){
        dice = new Dice(numberOfDice);
        board = new Board(boardSize, numberOfSnakes, numberOfLadders);
        players.addAll(playerList);
    }

    public String startGame(){
        int boardSize = board.getCells().length;
        int boardLength = boardSize*boardSize, rolledPoint;
        while(winnerPlayer == null){
            Player turnPlayer = players.peek();
            int rolledDice = dice.rollDice();
            System.out.println("Dice of Player : " + turnPlayer.getPlayerId() + "  Value : " + rolledDice);
            rolledPoint = turnPlayer.getCurrentPosition() + rolledDice;
            if(rolledPoint < boardLength-1){
                Cell rolledCell = board.getCell(rolledPoint/boardSize, rolledPoint%boardSize);
                if(rolledCell.getJump() != null){
                    turnPlayer.setCurrentPosition(rolledCell.getJump().getEnd());
                } else {
                    turnPlayer.setCurrentPosition(rolledPoint);
                }
                System.out.println("Position of Player " + turnPlayer.getPlayerId() + " : " + turnPlayer.getCurrentPosition());
            } else if(rolledPoint == boardLength-1){
                winnerPlayer = turnPlayer;
            } else{
                System.out.println("Sorry you are out of range : " + turnPlayer.getPlayerId());
            }

            players.poll();
            players.add(turnPlayer);
        }
        return winnerPlayer.getPlayerId();
    }

}
