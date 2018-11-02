package tutoriale.podstawy;

import javax.swing.JLabel;

public class Klasy_i_obiekty {
	public static void main(String[] args) {
		JLabel etykieta = new JLabel();
		
		Osoby Janek = new Osoby();
		Janek.nazwisko = "Kowalski";
		Janek.wiek = 30;
		Osoby Franek = new Osoby();
		Franek.nazwisko = "Frankowski";
		Franek.wiek = 40;
		
		System.out.println("Janek "+Janek.nazwisko+" ma "+Janek.wiek+" lat.");
		System.out.println("Franek "+Franek.nazwisko+" ma "+Franek.wiek+" lat.");		
		
	}
}
