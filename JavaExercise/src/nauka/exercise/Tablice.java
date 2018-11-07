package nauka.exercise;

public class Tablice {
	
	public static void main(String[] args) {
		int x; //tworzê now¹ zmienn¹
		int[] mojaTablica; //deklarujemy tablice
		//mojaTablica = new int[50000]; // wywolujemy tablice
		mojaTablica = new int[] {1,2,3,4,5,6,7,8,9,10}; // inny sposób deklarowania i wywolania równoczesnie tablicy z zawartosci¹
		
		
		/*x = 5;
		mojaTablica[0] = x;
		mojaTablica[1] = 3;
		mojaTablica[2] = 0;
		mojaTablica[3] = 1;
		mojaTablica[4] = 0;
		*/
		
		for (int licznik = 0; licznik < mojaTablica.length; licznik++) {
			mojaTablica[licznik] = licznik;
			
		}
		
		//System.out.println(mojaTablica[0]);
		
		/*for (int i = 0; i < mojaTablica.length; i++) {
			System.out.println(mojaTablica[i]);
		}
		*/
		
		for (int numer : mojaTablica)
			System.out.println(numer);
	}


}
