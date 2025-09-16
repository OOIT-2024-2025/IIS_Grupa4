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
		
		

	}

}
