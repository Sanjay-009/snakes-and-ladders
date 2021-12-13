import java.util.*;

public class Snakes {
    private HashMap<Integer, Integer> snakes = new HashMap<>();
    
    public void setSnakes(int head, int tail) {
        snakes.put(head, tail);
    }
    public HashMap getSnakes() {
        return snakes;
    }
}
