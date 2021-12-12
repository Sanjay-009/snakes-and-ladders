import java.util.*;

class Board {
    Dice dice = new Dice();
    HashMap<Integer, Integer> ladders;
    HashMap<Integer, Integer> snakes;
    HashMap<String, Integer> players;
    Queue<String> player;
    int boardSize;

    public Board(HashMap<Integer, Integer> ladders, HashMap<Integer, Integer> snakes, HashMap<String, Integer> players, Queue<String> player, int boardSize) {
        this.ladders = ladders;
        this.snakes = snakes;
        this.players = players;
        this.player = player;
        this.boardSize = boardSize;
    }

    public void Result() {
        while(player.size()>1) {
            String currentPlayer = player.remove();
            int count = dice.rollDice();
            if (players.get(currentPlayer)<boardSize) {
                int currentPosition = players.get(currentPlayer)+count;
                if (ladders.containsKey(currentPosition)) {
                    players.put(currentPlayer, ladders.get(currentPosition));
                    System.out.println("Player " + currentPlayer + " jumped to " + players.get(currentPlayer));
                }
                else if(snakes.containsKey(currentPosition)) {
                    players.put(currentPlayer, snakes.get(currentPosition));
                    System.out.println("Player " + currentPlayer + " dropped to " + players.get(currentPlayer));
                }
                else {
                    players.put(currentPlayer, currentPosition);
                    System.out.println("Player " + currentPlayer + " Moved to " + players.get(currentPlayer));
                }
                player.add(currentPlayer);
            }
            else {
                System.out.println("Player "+ currentPlayer + " Won the Game!!");
                
            }
            System.out.println();
        }
    }

}