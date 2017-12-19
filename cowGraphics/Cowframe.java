package cowGraphics;
import java.awt.*;

import javax.swing.JFrame;
public class Cowframe extends JFrame {
	
	private final Color BISQUE = new Color(0xcdb79e);
	private final Color BLACK = new Color(0); 
	private final Color PINK = new Color(0xf9ccca);
	
	double time, dt;
	double voltage;
	private boolean paintloop;
	public Cowframe () {
		init();
	repaint();
}

	public void init() {
		
		time = 0.0;
		dt = 0.1; 
		voltage = 0.0;
		paintloop = true;
		
		setSize(700,600);
		setBackground(Color.WHITE);
		repaint();
	}
	public void incrementTime() {
		time += dt;
		
	
	}
	public void pr(Object o) {
		System.out.println(o);
	}
	public void drawRect(Graphics g) {
		int xa = 50;
		
		int xb = 350 ;
		
	
		if(xa<=200){
			xa = xa + (int)time;
			xb = xb -(int)time;
			
		}
		else {
			xa = xa -(int)time;
			xb = xb +(int)time;
		}
		
		g.setColor(Color.BLUE);
		g.drawRect(xa,200, 100,  100);
		g.setColor(Color.PINK);
		g.drawRect(xb,200, 100,  100);
		

	}
	
	public void restTen() {
		try {
			Thread.sleep(10);
		} catch(InterruptedException e){
				e.printStackTrace();
		}
	}
	
	public void eraseRect(Graphics g) {
		int xa = 50;
		int xb = 350;
		if(xa>xb){
			xa = xa  - (int)time;
			xb = xb+(int)time;
		}
		else {
			 xa = 50 +(int)time;
			 xb = 350-(int)time;
		}
		 
		
		
		g.setColor(Color.WHITE);
		g.drawRect(xb,200, 100,  100);
		
		

	}
	public void drawTriangle(Graphics g) {
		double xOfCircle = Math.cos(time);
		double yOfCircle = Math.sin(time);
		
		int[]xp = {(int)(xOfCircle*100)+200,300,250};
		int[]yp = {(int)(yOfCircle*100)+200,450,150};
		
		g.fillPolygon(xp, yp, 3);
		
	}
	public void rectCircle(Graphics g) {
		g.setColor(Color.BLUE);
		double xOfCircle = Math.cos(time/8);
		double yOfCircle = Math.sin(time/8);
		
		g.fillRect((int)(xOfCircle*100)+200, (int)(yOfCircle*100)+200, 200, 200);
	}
		public void paint(Graphics g) {
		incrementTime();
		drawRect(g);
		restTen();
	
		drawRect(g);
		eraseRect(g);
		repaint();
		
		//details tail
		/*g.setColor(BISQUE);
		g.fillOval(40, 200, 20, 100);
		g.setColor(BLACK);
		g.drawOval(40, 200, 20, 100);
		//legs
		g.setColor(BISQUE);
		g.fillRect(75, 200,  40, 200);
		g.setColor(BLACK);
		g.drawRect(75,200, 40, 200);
		g.setColor(BISQUE);
		g.fillRect(85, 200,  40, 200);
		g.setColor(BLACK);
		g.drawRect(85, 200,  40, 200);
		g.setColor(BISQUE);
		g.fillRect(300, 200,  40, 200);
		g.setColor(BLACK);
		g.drawRect(300, 200,  40, 200);
		g.setColor(BISQUE);
		g.fillRect(320, 200,  40, 200);
		g.setColor(BLACK);
		g.drawRect(320, 200,  40, 200);
		//body
		g.setColor(BISQUE);
		g.fillOval(50, 100, 400, 200);
		g.setColor(BLACK);
		g.drawOval(50, 100, 400, 200);
		//head
		g.setColor(BISQUE);
		g.fillOval(350, 50, 100, 100);
		g.setColor(BLACK);
		g.drawOval(350, 50, 100, 100);
		g.setColor(PINK);
		g.fillOval(315, 100, 175, 75);
		g.setColor(BLACK);
		g.drawOval(315, 100, 175, 75);
		//details head
		g.setColor(BLACK);
		g.fillOval(370, 135, 13, 13);
		g.fillOval(425, 135, 13, 13);
		g.fillOval(375, 80, 13, 13);
		g.fillOval(420, 80, 13, 13);
		*/
		}
	
}