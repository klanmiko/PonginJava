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
	public int change;
	Thread game;
	public void init(){ 
		this.setBackground(Color.black);
		theSize = new Dimension(800,600);
		MinSize=new Dimension (400,300);
		paddle1 = new GameObject(10,10,10,70);
		paddle2 = new GameObject(600,400,10,70);
		game = new Thread(this);
		change = 10;
		this.setName("PongGame");
		this.setSize(theSize);
		winSize = this.getSize();
		game.start();
	}
	public void paint (Graphics g)
	{
		g.clearRect(0, 0, winSize.width, winSize.height);
        paddle1.render(paddle1, Color.yellow,g);
        paddle2.render(paddle2, Color.green, g);
        g.drawString("checking update algorithem", change, 10);
	}
	public void run() {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); 
		while(running)
		{
			change = change + 1;
			if 
			checkresize();
			repaint();
			try
			{
				Thread.sleep (10); 
			}
			catch  (InterruptedException ex) 
			{
				
			}
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY); 
		}
			
		}
	
		
	public void checkresize()
	{
		winSize = this.getSize();
		if ((winSize.width==theSize.width)&(winSize.height==theSize.height)){
			
		}
		else
		{
			paddle1.scale(winSize.width, winSize.height, paddle1);
			paddle2.scale(winSize.width, winSize.height, paddle2);
		}
	}
}
