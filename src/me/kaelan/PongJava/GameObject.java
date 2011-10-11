package me.kaelan.PongJava;

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
public void scale (int windowwidth, int windowheight)
{
	
}
}
