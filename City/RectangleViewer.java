import javax.swing.JFrame;

public class RectangleViewer
{
   final static int ANIMATION_TIME_IN_SECONDS = 60;
   public static void main(String[] args) throws InterruptedException
   {
      JFrame frame = new JFrame();

      frame.setSize(600, 800);
      frame.setTitle("Two rectangles");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      RectangleComponent component = new RectangleComponent();
      frame.add(component);
      frame.setVisible(true);
      
      RectangleComponent component2 = new RectangleComponent(50,50,50,30);
      frame.add(component2);
   }
}
