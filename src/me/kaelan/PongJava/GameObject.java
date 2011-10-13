package me.kaelan.PongJava;

import java.awt.*;

public class GameObject {
private int height;
private int width;
private int x;
private int y;

public GameObject (int nx,int ny,int nwidth,int nheight)
{
	x = nx;
	y = ny;
	width = nwidth;
	height = nheight;
}
public int getHeight()
{
	return height;
}
public int getWidth()
{
	return width;
}
public int getX()
{
	return x;
}
public int getY()
{
	return y;
}

public void setWidth(int nwidth)
{
	width = nwidth;
}public void setHeight(int nheight)
{
	height = nheight;
}public void setY(int ny)
{
	y = ny;
}
public void setX(int nx)
{
	x = nx;
}
public void scale (int windowwidth, int windowheight, GameObject me)
{
	float scalenum;
		scalenum = windowwidth/windowheight;
		me.setWidth((int) (me.width * scalenum));
		me.setHeight ((int) (me.height * scalenum));
	}
	
	
public void render(GameObject object, Color colour, Graphics g)
{
	g.setColor(colour);
	g.drawRect(object.x, object.y, object.width, object.height);
	g.fillRect(object.x, object.y, object.width, object.height);
}

}
