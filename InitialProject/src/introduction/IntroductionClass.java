package src.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JFrame;

import src.geometry.Circle;
import src.geometry.Point;
import src.geometry.Rectangle;
import src.geometry.Shape;

public class IntroductionClass {

	public static void main(String[] args) {
		JFrame frame = new JFrame("DrawingApp");
		frame.setSize(800, 600);
		
		DrawingPanel drawingPanel = new DrawingPanel();
		frame.getContentPane().add(drawingPanel);
		
		frame.setVisible(true);
		
		// Deo vežbi 7
		Point p3 = new Point(50, 50);
		Rectangle r10 = new Rectangle(p3, 10, 10);
		Rectangle r20 = new Rectangle(p3, 20, 20);
		Shape r30 = new Rectangle(p3, 30, 30);
		Shape[] shapes = { r30, r10, r20 };
		System.out.println("\nNesortiran niz: ");
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		// u pozadini sortira po compareTo
		Arrays.sort(shapes);
		System.out.println("Sortiran niz: ");
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		
		

	}

}
