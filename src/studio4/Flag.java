package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color blue = new Color(0,51,153);
		StdDraw.setPenColor(blue);
		StdDraw.filledRectangle(0.25, 0.5, 0.25, 0.3);
		Color gold = new Color(255,204,0);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(0.75, 0.5, 0.25, 0.3);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.setPenRadius(0.015);
		StdDraw.line(0.3, 0.65, 0.7, 0.65);
		StdDraw.line(0.35, 0.3, 0.65, 0.3);
		StdDraw.line(0.5, 0.7, 0.5, 0.3);
		StdDraw.line(0.3, 0.65, 0.23, 0.4);
		StdDraw.line(0.3, 0.65, 0.37, 0.4);
		StdDraw.line(0.23, 0.4, 0.37, 0.4);
		StdDraw.line(0.7, 0.65, 0.63, 0.4);
		StdDraw.line(0.7, 0.65, 0.77, 0.4);
		StdDraw.line(0.63, 0.4, 0.77, 0.4);
	}
}