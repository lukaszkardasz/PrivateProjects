package nauka.exercise.Simple;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Obiekty {
	
	public static void main(String[] args) {
		
		//tworzymy okno
		JFrame okno=new JFrame();
		okno.setTitle("Moje_Okno");
		okno.setSize(800, 600);
		okno.setVisible(true);
		
		JLabel etykieta=new JLabel();
		etykieta.setText("Moja nowa etykieta");
		
		okno.add(etykieta);
		okno.setLocation(500, 200);

	}

}
