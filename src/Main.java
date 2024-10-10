// Here is all of my ChatGPT help: https://chatgpt.com/c/6707fa13-8384-8013-91d8-6984a7b6bebf
// It's mostly just stuff about the Java programming language

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

        // Calculating the x-axis
        int midline = height / 2;

        // Iterating over all Xs and drawing the appropriate point
        for (int x = 0; x < width; x++) {
            int y = (int) (Functions.funcComposition(x));
            g.drawLine(x, midline - y, x, midline - y);
        }

        // TODO: Implement a way to 1) find the max and min of the function, and 2) scale it so that it fits
    }

    public static void main (String[] args){
        // Create a window (JFrame) to display
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 1000);
        frame.add(new Main());
        frame.setVisible(true);
    }
}



