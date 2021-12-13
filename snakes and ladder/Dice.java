import java.util.*;

class Dice {
    int diceCount;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        if (diceCount==1) {
            Random random = new Random();
        
            int result = 0;
            for (int i=1; i<4; i++) {
                result += random.nextInt(6)+1;
                if (result%6!=0) {
                    return result;
                }
            }
            return 0;
        }

        else {
            return ((int) ((Math.random()*(6*diceCount)+ 1*diceCount)))%6 + 1;
        }

    }
}