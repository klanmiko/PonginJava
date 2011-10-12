package me.kaelan.PongJava;
import java.applet.Applet;
import java.awt.*;
public class PongJava extends Applet implements Runnable{
	public GameObject paddle1;
	public GameObject paddle2;
	public Dimension theSize;
	public Dimension MinSize;
	public Dimension winSize;
	public boolean running = true;
	Thread game;
	public void init(){ 
		theSize = new Dimension(800,600);
		MinSize=new Dimension (400,300);
		paddle1 = new GameObject(10,10,10,70);
		paddle2 = new GameObject(600,400,10,70);
		game = new Thread(this);
	}
	public void start()
	{
		this.setName("PongGame");
		this.setSize(theSize);
		winSize = this.getSize();
	}
	public void paint (Graphics g)
	{
		drawbackground(g);
        paddle1.render(paddle1, Color.yellow,g);
        paddle2.render(paddle2, Color.green, g);
	}
	private void drawbackground(Graphics g)
	{
		this.setBackground(Color.black);
	}
	public void run() {
		while(running)
		{
			checkresize();
			checkmouse();
			moveobjects();
			repaint();
		}
		
	}
}
