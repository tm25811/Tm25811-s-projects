package cowGraphics;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Triangle_shape extends JFrame {
    /**
     * @param args the command line arguments
     */
    public Triangle_shape(){
        //Create and add trianglePanel

      //  setVisible(true);
    //    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
  public static void main(String[] args) {

        // TODO code application logic here
      TrianglePanel t= new TrianglePanel();
    JFrame frame = new JFrame ();  
    final int FRAME_WIDTH = 500;  
    final int FRAME_HEIGHT = 500;

    frame.setSize (FRAME_WIDTH, FRAME_HEIGHT);           

    frame.setLayout(new BorderLayout());
      frame.add(t);
    //    frame.add(new TrianglePanel(), BorderLayout.CENTER);
        frame.pack();
        frame.repaint();
        frame.setTitle("A Test Frame");  
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setVisible(true);  

  }
  public static class TrianglePanel extends JPanel implements MouseListener{
	  private Polygon triangle;

	  int colorChoice = 1;

	  public TrianglePanel(){
		  //Create triangle
            triangle = new Polygon();
            triangle.addPoint(150, 200);
            triangle.addPoint(150, 100);
            triangle.addPoint(200, 100);
            triangle.addPoint(200,200);
            

            //Add mouse Listener
            addMouseListener(this);

            //Set size to make sure that the whole triangle is shown
            setPreferredSize(new Dimension(300, 300));
        }

        /** Draws the triangle as this frame's painting */
        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D)g;
            g2d.draw(triangle);
            if(colorChoice == -1) {
            	g.setColor(Color.RED);
            	System.out.println("set color");
            	
            	g.fillRect(150, 100, 50, 100);
            	
            	
            }
            else {
            	g.setColor(Color.BLACK);
            	g.fillRect(150, 100, 50,100);
            }
            
           
        }

        //Required methods for MouseListener, though the only one you care about is click
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}

        /** Called whenever the mouse clicks.
          * Could be replaced with setting the value of a JLabel, etc. */
        public void mouseClicked(MouseEvent e) {
            Point p = e.getPoint();
            if(triangle.contains(p)) {
            	System.out.println("clicked, colorchoice is " + colorChoice);
            	colorChoice = -colorChoice;
            	
            }
            
            repaint();
           
        }

		




    }
}