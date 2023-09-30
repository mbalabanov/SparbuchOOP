package at.bfi.oop.sparbuch;

public class TestSparbuch {
	public static void main(String[] args) {
		Sparbuch erstesSparbuch = new Sparbuch("12345", 1000, 0.03);
		Sparbuch zweitesSparbuch = new Sparbuch("67890", 10000, 0.02);
		
		System.out.println("Urspruenglicher Kapitalbetrag auf dem Sparbuch (vor der Ertragberechnung: " + erstesSparbuch.getKapital() + ".\n");
		
		System.out.println("Ertrag bei " + erstesSparbuch.getZinssatz() * 100 + "% p.a. Zinssatz und einer Laufzeit von 1 Jahr." );
		
		System.out.printf("%.2f", erstesSparbuch.getErtrag(1));
		System.out.println("\n" );

		System.out.println("Kapital betraegt: " + erstesSparbuch.getKapital() + ". Ertrag bei 3% p.a. Zinssatz und einer Laufzeit von 1 Jahr." );
		
		System.out.printf("%.2f", erstesSparbuch.getErtrag(1));
		System.out.println("\n" );
		
		System.out.println("Kapital betraegt: " + zweitesSparbuch.getKapital() + ". Ertrag bei 5% p.a. Zinssatz und einer Laufzeit von 10 Jahr." );
		
		System.out.printf("%.2f", zweitesSparbuch.getErtrag(10));
	}
}
