package me.kaelan.PongJava;
import java.applet.Applet;
import java.awt.*;
public class PongJava extends Applet{
	public GameObject paddle1;
	public void init(){
		paddle1 = new GameObject(0,0,40,100);
	}
	public void paint (Graphics g)
	{
        paddle1.render(paddle1, Color.yellow,g);
	}
}
