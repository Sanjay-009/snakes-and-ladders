import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Dice dice = new Dice();
        System.out.print("Enter the Size of Board : ");
        int boardSize = input.nextInt();

        //Ladders
        System.out.print("Enter the number of ladders : ");
        int laddersCount = input.nextInt();

        Ladders l = new Ladders();

        for(int i=0; i<laddersCount; i++) {
            System.out.print("Enter the ladder number "+(i+1)+" : ");
            l.setLadders(input.nextInt(), input.nextInt());
        }
        
        //Snakes
        System.out.print("Enter the number of snakes : ");
        int snakesCount = input.nextInt();

        Snakes s = new Snakes();

        for(int i=0; i<snakesCount; i++) {
            System.out.print("Enter the snake number "+(i+1)+" : ");
            s.setSnakes(input.nextInt(), input.nextInt());
        }
        
        //Players
        System.out.print("Enter the number of Players : ");
        int playersCount = input.nextInt();

        Players p = new Players();
        Queue<String> player = new LinkedList<>();
        for(int i=0; i<playersCount; i++) {
            System.out.println("Enter the player number "+(i+1)+" : ");
            String name = input.next();
            player.add(name);
            p.setPlayer(name, 0);
        }

        //Dice
        System.out.print("Enter the number of dice : ");
        int dice = input.nextInt();

        //Board
        Board b = new Board(l.getLadders(), s.getSnakes(), p.getPlayers(), player, boardSize);

        b.Result();

    }
}