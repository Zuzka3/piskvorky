public class Board {

    private int[][] board;

    public Board(int size) {
        this.board = new int[size][size];
    }

    public void play(int x, int y, int player) throws Exception {
        //if (x)
        if (player < 1 || player > 2) throw new RuntimeException();
        if (board[x][y] != 0) throw new Exception("Space is not empty!");
        board[x][y] = player;
    }



}
