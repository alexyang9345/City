import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class CircleComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        // Draw the head
        Ellipse2D.Double circle1 = new Ellipse2D.Double(5, 10, 100, 150);
        g2.draw(circle1);
    }
}
