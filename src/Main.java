// Here is all of my ChatGPT help: https://chatgpt.com/c/6707fa13-8384-8013-91d8-6984a7b6bebf
// It's mostly just stuff about the Java programming language

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Get the dimensions of the panel
        int width = getWidth();
        int height = getHeight();

        // Finding the range of a function by iterating over all the points (in the given domain)
        double functionMax = Functions.composition(0);
        double functionMin = Functions.composition(0);
        for (double x = 10; x < width-10; x++) {
            // Checking if the value is greater than the current max and updating the max as needed
            if (Functions.composition(x) > functionMax) {
                functionMax = Functions.composition(x);
            // Checking if the value is less than the current min and updating as needed
            if (Functions.composition(x) < functionMin) {
                functionMin = Functions.composition(x);
            }
            }
        }
        System.out.println("Max: " + functionMax);
        System.out.println("Min: " + functionMin);

        // Iterating over all x's and drawing the appropriate point
        g.setColor(Color.RED);
        for (int x = 10; x < width - 10; x++) {
            // Scaling the graph with margins of 10
            int y = (int) (((functionMax - Functions.composition(x)) * (height - 20)) / (functionMax - functionMin) + 10);
            g.drawLine(x, y, x, y);
        }
        // Setting boundaries
        g.setColor(Color.BLACK);
        g.drawLine(10, 10, width - 10, 10);
        g.drawLine(10, height - 10, width - 10, height - 10);
        g.drawLine(10, 10, 10, height - 10);
        g.drawLine(width - 10, 10, width - 10, height - 10);
    }

    public static void main (String[] args){
        // Displaying the oddness, evenness, and invertibility of a function
        Triplet oei = new Triplet();
        System.out.println("Odd: " + oei.isOdd());
        System.out.println("Even: " + oei.isEven());
        System.out.println("Invertible: " + oei.isInvertible());

        // Create a window (JFrame) to display
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.add(new Main());
        frame.setVisible(true);
    }
}



