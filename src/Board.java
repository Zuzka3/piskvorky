import java.util.Arrays;

public class Board {

    private int[][] board;
    private int winLenght = 3;

    public Board(int size) {
        this.board = new int[size][size];
    }

    public boolean play(int x, int y, int player) throws Exception {
        if (x < 0 || x > board.length || y < 0 || y > board.length) throw new Exception("Missed the board!");
        if (player < 1 || player > 2) throw new RuntimeException();
        if (board[x][y] != 0) throw new Exception("Space is not empty!");
        if (won(player)) return true;
        board[x][y] = player;
        return false;
    }

    public boolean won(int player){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                //x
                int count = 0;
                for (int x = 0; x < winLenght; x++) {
                    try{
                        if (board[i][j + x] == player) count++;
                        else break;
                    }
                    catch (Exception e){
                        break;
                    }
                }
                if (count >= winLenght) return true;
                count = 0;
                for (int x =-winLenght; x < 0; x++) {
                    try{
                        if (board[i][j - x] == player) count++;
                        else break;
                    }
                    catch (Exception e){
                        break;
                    }
                }
                if (count >= winLenght) return true;
                //y
                count = 0;
                for (int y = 0; y < winLenght; y++) {
                    try{
                        if (board[i + y][j] == player) count++;
                        else break;
                    }
                    catch (Exception e){
                        break;
                    }
                }
                if (count >= winLenght) return true;
                count = 0;
                for (int y =-winLenght; y < 0; y++) {
                    try{
                        if (board[i - y][j] == player) count++;
                        else break;
                    }
                    catch (Exception e){
                        break;
                    }
                }
                if (count >= winLenght) return true;
                //d
                count = 0;
                for (int d = 0; d < winLenght; d++) {
                    try{
                        if (board[i + d][j + d] == player) count++;
                        else break;
                    }
                    catch (Exception e){
                        break;
                    }
                }
                if (count >= winLenght) return true;
                count = 0;
                for (int d =-winLenght; d < 0; d++) {
                    try{
                        if (board[i - d][j - d] == player) count++;
                        else break;
                    }
                    catch (Exception e){
                        break;
                    }
                }
                if (count >= winLenght) return true;
                count = 0;
                for (int d = 0; d < winLenght; d++) {
                    try{
                        if (board[i - d][j + d] == player) count++;
                        else break;
                    }
                    catch (Exception e){
                        break;
                    }
                }
                if (count >= winLenght) return true;
                count = 0;
                for (int d =-winLenght; d < 0; d++) {
                    try{
                        if (board[i + d][j - d] == player) count++;
                        else break;
                    }
                    catch (Exception e){
                        break;
                    }
                }
                if (count >= winLenght) return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (int i = -1; i < board.length; i++) {
            if (i == -1){
                for (int j = -1; j < board.length; j++) {
                    if (j == -1) temp.append("   ");
                    else temp.append(" ").append(j + 1).append(".");
                }
                temp.append("\n");
            }
            else {
                for (int j = -1; j < board.length; j++) {
                    if (j == -1) {
                        if (i + 1 < 10) temp.append(i + 1).append(".  ");
                        else temp.append(i + 1).append(". ");
                    }
                    else {
                        String tile = switch (board[i][j]){
                            case 0 -> " ";
                            case 1 -> "O";
                            case 2 -> "X";
                            default -> "E";
                        };
                        temp.append("[").append(tile).append("]");
                    }
                }
                temp.append("\n");
            }
        }
        return temp.toString();
    }
}
