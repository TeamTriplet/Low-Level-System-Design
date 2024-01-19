package SnakeAndLadder.Model;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int numberOfDice;
    int min = 1;
    int max = 6;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int rollDice(){
        int sum = 0, rolledNumber;
        for(int i=0;i<numberOfDice;i++){
            rolledNumber = ThreadLocalRandom.current().nextInt(min, max+1);
            if(rolledNumber == 1) i--;
            sum += rolledNumber;
        }
        return sum;
    }
}
