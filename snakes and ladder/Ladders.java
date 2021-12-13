import java.util.*;

class Ladders {
    private HashMap<Integer, Integer> ladders = new HashMap<>();
    
    public void setLadders(int head, int tail) {
        ladders.put(head, tail);
    }
    public HashMap getLadders() {
        return ladders;
    }
}
