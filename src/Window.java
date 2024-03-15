import javax.swing.*;

public class Window {

    int BoardHeight = 650;
    int BoardWidth = 600;

    JFrame frame = new JFrame("Tic-Tac-Toe");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();

    JButton[][] board = new JButton[3][3];
    String playerX = "X";
    String playerO = "O";
    String currentP = playerO;

    boolean gameOver = false;
    int turns = 0;

    Window(){
        frame.setVisible(true);

    }
}
