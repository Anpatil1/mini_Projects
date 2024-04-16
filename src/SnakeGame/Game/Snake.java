package SnakeGame.Game;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Snake extends JFrame {

    private int score; // Variable to hold the score

    public Snake() {
        initUI();
        score = 0; // Initialize score to 0
    }

    private void initUI() {
        add(new Board(this)); // Pass 'this' to the com.Board constructor

        setResizable(false);
        pack();

        setTitle("com.Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Method to increment score
    public void incrementScore() {
        score++;
        setTitle("com.Snake - Score: " + score); // Update window title with score
    }

    // Method to get the score
    public int getScore() {
        return score;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
