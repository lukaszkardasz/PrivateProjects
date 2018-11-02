package Zastapienie;

//Subklasa dziedziczy wszystkie zmienne i metody zdefiniowane w Bazie
public class Subklasa extends Baza {
	
	public static void main(String[] args) {
		Subklasa s = new Subklasa();
	}
	
	public Subklasa() {
		siema();
	}
	
	@Override
	public void siema() {
		// TODO Auto-generated method stub
		super.siema();
		System.out.println("Elo!");
	}

}
