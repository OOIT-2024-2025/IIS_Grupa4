package src.introduction;

import javax.swing.JFrame;

public class IntroductionClass {

	public static void main(String[] args) {
		JFrame frame = new JFrame("DrawingApp");
		frame.setSize(800, 600);
		
		DrawingPanel drawingPanel = new DrawingPanel();
		frame.getContentPane().add(drawingPanel);
		
		frame.setVisible(true);

	}

}
