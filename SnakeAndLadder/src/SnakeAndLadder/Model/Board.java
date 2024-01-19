package SnakeAndLadder.Model;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public Board(int boardSize, int numberOfSnakes, int numberOfLadder){
        initializeCells(boardSize);
        assignSnakesAndLadders(boardSize, numberOfSnakes, numberOfLadder);
    }

    private void initializeCells(int boardSize){
        cells = new Cell[boardSize][boardSize];
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                cells[i][j] = new Cell();
            }
        }
    }

    private void assignSnakesAndLadders(int boardSize, int numberOfSnakes, int numberOfLadder){
        int boardLength = boardSize*boardSize;
        while(numberOfSnakes > 0){
            int snakeTail = ThreadLocalRandom.current().nextInt(1, boardLength-2);
            int snakeHead = ThreadLocalRandom.current().nextInt(snakeTail+1, boardLength-1);

            Snake snake = new Snake(snakeHead, snakeTail);
            cells[snakeHead/boardSize][snakeHead%boardSize].setJump(snake);
            numberOfSnakes--;
        }

        while(numberOfLadder > 0){
            int ladderHead = ThreadLocalRandom.current().nextInt(1, boardLength-2);
            int ladderTail = ThreadLocalRandom.current().nextInt(ladderHead+1, boardLength-1);

            Ladder ladder = new Ladder(ladderHead, ladderTail);
            cells[ladderHead/boardSize][ladderHead%boardSize].setJump(ladder);
            numberOfLadder--;
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    public Cell getCell(int row, int col){
        return cells[row][col];
    }
}
