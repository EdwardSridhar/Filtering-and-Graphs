import javax.swing.*;
import java.awt.*;

public class GraphView extends JFrame {
    int n1;
    int n2;
    int n3;
    // two more variables

    public GraphView(int n1, int n2, int n3) {
        // initialize some variables
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void updateGraph(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        // update values
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // to clear the previous stuff if any (for repainting)
        Graphics2D g2 = (Graphics2D) g;

        // how to glue it to the bottom? little math here
        int y1 = getHeight() - n1 - 15;

        //graph for red
        g2.setColor(Color.RED);
        Rectangle rec1 = new Rectangle(40, y1, 50, n1);
        g2.draw(rec1);
        g2.fill(rec1);

        //graph for green
        int y2 = getHeight() - n2 - 15;
        g2.setColor(Color.GREEN);
        Rectangle rec2 = new Rectangle(130, y2, 50, n2);
        g2.draw(rec2);
        g2.fill(rec2);

        //graph for blue
        int y3 = getHeight() - n3 - 15;
        g2.setColor(Color.BLUE);
        Rectangle rec3 = new Rectangle(220, y3, 50, n3);
        g2.draw(rec3);
        g2.fill(rec3);


        // add two more with different colors
    }
}
