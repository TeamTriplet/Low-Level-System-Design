package SnakeAndLadder.Model;

public class Cell {
    Jump jump;

    public Cell() {
        jump = null;
    }

    public void setJump(Jump jump) {
        this.jump = jump;
    }

    public Jump getJump() {
        return jump;
    }
}
