import java.util.*;

class Dice {
    public int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6)+1;
    }
}