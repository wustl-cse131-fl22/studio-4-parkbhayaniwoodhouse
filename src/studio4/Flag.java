package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(.5, .5, 0.3, 0.2);
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		StdDraw.setPenColor(Color.pink);
		StdDraw.filledCircle(0.6, 0.5, 0.03);
		StdDraw.filledCircle(0.5, 0.6, 0.03);
		StdDraw.filledCircle(0.4, 0.5, 0.03);
		StdDraw.filledCircle(0.5, 0.4, 0.03);
	}
}