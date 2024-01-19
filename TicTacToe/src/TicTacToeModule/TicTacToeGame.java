package TicTacToeModule;

import TicTacToeModule.Model.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicTacToeGame {
    Queue<Player> players;
    Board board;

    public TicTacToeGame(){
        this.board = new Board(3);
        addPlayers();
    }

    private void addPlayers(){
        players = new LinkedList<>();
        Player p1 = new Player("p1", new PlayPieceTypeX());
        Player p2 = new Player("p2", new PlayPieceTypeO());
        players.add(p1);
        players.add(p2);
    }

    public String startGame(){
        int row, col;
        while(true){
            board.displayBoard();
            if(!board.checkFreeSpace()) break;
            Player playerTurn = players.peek();
            System.out.println("Turn " + playerTurn.getId() + " Enter a position : ");
            Scanner sc = new Scanner(System.in);
            row = sc.nextInt();
            col = sc.nextInt();
            if(board.addSymbol(row, col, playerTurn)){
                if(board.gameFinished(row, col, playerTurn)){
                    board.displayBoard();
                    return " Winner " + playerTurn.getId();
                }
                players.poll();
                players.add(playerTurn);
            } else {
                System.out.println("Please enter a valid Position");
            }
        }
        return "Tie";
    }


}
