package Einzelspieler;
import javax.swing.JFrame;
import java.awt.Graphics;

public class Frogger extends JFrame 
{
	public Frog frog;
	
	 public Frogger()
	 {
		 setTitle("Frogger");
		 setSize(960, 960);
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }
	 public static void main(String[] args)
	 {
		 Frogger f = new Frogger();
		 f.setupGame();
	 }
	 public void setupGame()
	 {
		 frog = new Frog(100, 100 , 50, 10);
		 drawFrog(null, frog.x, frog.y, frog.w, frog.h);
	 }
	 public void drawFrog(Graphics g, int x, int y, int w, int h)
	 {
		g.drawRect(x, y, w, h);
		g.fillRect(x, y, w, h);
	 }
	 

}
