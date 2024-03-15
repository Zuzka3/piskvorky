import java.util.Scanner;

public class Game {

    private Board board;

    public Game(int size) {
        this.board = new Board(size);
    }

    public void loop(){
        int turn = 2;
        /*do {
            if (turn == 2) turn = 1;
            if (turn == 1) turn = 2;
            Scanner input = new Scanner(System.in);

        }
        while (!board.play());*/
    }
}
