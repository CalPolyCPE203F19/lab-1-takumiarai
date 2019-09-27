/* 
Lab-1 Part 2
*/

import java.lang.Math;

class Point
{
	private double x;
	private double y;

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX() { return x; }
	public double getY() { return y; }

	//distance from origin to the point
	public double getRadius() 
	{
		return Math.sqrt(x*x+y*y);
		//return hypot(x, y);
	}

	public double getAngle() 
	{
		return Math.atan(y/x);
	}

	public Point rotate90()
	{
		return new Point(-y, x);
	}
}
