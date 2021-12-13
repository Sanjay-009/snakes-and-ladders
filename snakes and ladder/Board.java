import java.util.*;

class Board {
    HashMap<Integer, Integer> ladders;
    HashMap<Integer, Integer> snakes;
    HashMap<String, Integer> players;
    Queue<String> player;
    int boardSize;
    int diceCount;

    public Board(HashMap<Integer, Integer> ladders, HashMap<Integer, Integer> snakes, HashMap<String, Integer> players, Queue<String> player, int boardSize, int diceCount) {
        this.ladders = ladders;
        this.snakes = snakes;
        this.players = players;
        this.player = player;
        this.boardSize = boardSize;
        this.diceCount = diceCount;
    }

    Dice dice = new Dice(diceCount);

    public void Result() {
        while(player.size()>1) {
            String currentPlayer = player.remove();
            int count = dice.rollDice();
            if (players.get(currentPlayer)+count<boardSize) {
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
            else if(players.get(currentPlayer)+count>boardSize) {
                System.out.println("Player " + currentPlayer + " is at position " + players.get(currentPlayer));
                player.add(currentPlayer);
            }
            else {
                System.out.println("Player "+ currentPlayer + " Won the Game!!");
                
            }
            System.out.println();
        }
    }

}