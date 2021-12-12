import java.util.*;

public class Players {
    private HashMap<String, Integer> players = new HashMap<>();

    public void setPlayer(String name, int id) {
        players.put(name, id);
    }
    public HashMap getPlayers() {
        return players;
    }
}
