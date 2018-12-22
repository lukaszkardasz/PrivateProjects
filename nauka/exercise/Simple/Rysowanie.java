package nauka.exercise.Simple;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;



public class Rysowanie extends JFrame{
	public static void main(String[] args) {
		new Rysowanie();
	}

	public Rysowanie() {
		// TODO Auto-generated constructor stub
		setVisible(true);
		setSize(500, 500);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//super.paint(g);
		
		g.setColor(Color.blue);
		g.drawRect(50, 50, 100, 25);
		
	}
}
