import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BrickBreakerGame extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 600;
    private static final int PADDLE_WIDTH = 60;
    private static final int PADDLE_HEIGHT = 10;
    private static final int BALL_DIAMETER = 20;
    private static final int BRICK_WIDTH = 50;
    private static final int BRICK_HEIGHT = 20;
    private static final int BRICK_ROWS = 5;
    private static final int BRICK_COLS = 8;

    private int paddleX = (WIDTH - PADDLE_WIDTH) / 2;
    private int ballX = WIDTH / 2;
    private int ballY = HEIGHT / 2;
    private int ballSpeedX = 3;
    private int ballSpeedY = 3;
    private boolean[] bricks;
    private int score = 0;

    public BrickBreakerGame() {
        setTitle("Brick Breaker Game");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bricks = new boolean[BRICK_ROWS * BRICK_COLS];
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                movePaddle(e);
            }
        });
        setFocusable(true);

        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateGame();
                repaint();
            }
        });
        timer.start();
    }

    private void movePaddle(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT && paddleX > 0) {
            paddleX -= 20;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && paddleX < WIDTH - PADDLE_WIDTH) {
            paddleX += 20;
        }
    }

    private void updateGame() {
        ballX += ballSpeedX;
        ballY += ballSpeedY;

        // Check for collision with walls
        if (ballX <= 0 || ballX >= WIDTH - BALL_DIAMETER) {
            ballSpeedX = -ballSpeedX;
        }
        if (ballY <= 0) {
            ballSpeedY = -ballSpeedY;
        }

        // Check for collision with paddle
        if (ballY >= HEIGHT - PADDLE_HEIGHT - BALL_DIAMETER && ballX >= paddleX && ballX <= paddleX + PADDLE_WIDTH) {
            ballSpeedY = -ballSpeedY;
        }

        // Check for collision with bricks
        int row = ballY / BRICK_HEIGHT;
        int col = ballX / BRICK_WIDTH;
        int brickIndex = row * BRICK_COLS + col;

        if (row >= 0 && row < BRICK_ROWS && col >= 0 && col < BRICK_COLS && bricks[brickIndex]) {
            bricks[brickIndex] = false;
            ballSpeedY = -ballSpeedY;
            score++;
            if (score == BRICK_ROWS * BRICK_COLS) {
                JOptionPane.showMessageDialog(this, "You win!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }

        // Check for game over
        if (ballY >= HEIGHT) {
            JOptionPane.showMessageDialog(this, "Game Over! Your score is: " + score, "Game Over",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw paddle
        g.setColor(Color.BLUE);
        g.fillRect(paddleX, HEIGHT - PADDLE_HEIGHT, PADDLE_WIDTH, PADDLE_HEIGHT);

        // Draw ball
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, BALL_DIAMETER, BALL_DIAMETER);

        // Draw bricks
        for (int i = 0; i < BRICK_ROWS; i++) {
            for (int j = 0; j < BRICK_COLS; j++) {
                int brickIndex = i * BRICK_COLS + j;
                if (bricks[brickIndex]) {
                    g.setColor(Color.GREEN);
                    g.fillRect(j * BRICK_WIDTH, i * BRICK_HEIGHT, BRICK_WIDTH, BRICK_HEIGHT);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BrickBreakerGame().setVisible(true);
            }
        });
    }
}
