import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the color for drawing
        g.setColor(Color.BLUE);

        // Get the dimensions of the panel
        int width = getWidth();
        int height = getHeight();

        // Scale factors to fit the sine wave in the window
        int amplitude = height / 4; // Amplitude of sine wave (adjust to fit)
        int frequency = 2; // Frequency multiplier for the wave

        // Calculate the x-axis (middle of the panel)
        int xAxis = height / 2;

        // Draw the sine wave
        for (int x = 0; x < width; x++) {
            //code for graph
            int y = (int) (amplitude * Math.sin((x * Math.PI * frequency) / width));

            g.drawLine(x, xAxis - y, x, xAxis - y);

        }
    }

    public static void main(String[] args) {
        // Create a window (JFrame) to display the sine wave
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 400);
        frame.add(new Main());
        frame.setVisible(true);
    }
}

