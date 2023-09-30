package at.bfi.oop.sparbuch;

public class TestSparbuch {
	public static void main(String[] args) {
		Sparbuch erstesSparbuch = new Sparbuch("12345", 1000, 0.03);
		Sparbuch zweitesSparbuch = new Sparbuch("67890", 10000, 0.02);
		Sparbuch drittesSparbuch = new Sparbuch("54321", 8000, 0.05);
		Sparbuch viertesSparbuch = new Sparbuch("09876", 0, 0.01);
		
		System.out.println("Sparbuch mit der Kontonummer: " + erstesSparbuch.getKontonummer() + "\nKapital betraegt: " + erstesSparbuch.getKapital() + " Geldeinheiten.\nErtrag bei " + erstesSparbuch.getZinssatz() * 100 + "% p.a. Zinssatz und einer Laufzeit von 5 Jahren:" );
		
		System.out.printf("%.2f Geldeinheiten.", erstesSparbuch.getErtrag(5));
		System.out.println("\n" );

		System.out.println("Sparbuch mit der Kontonummer: " + erstesSparbuch.getKontonummer() + "\nKapital betraegt: " + erstesSparbuch.getKapital() + " Geldeinheiten.\nErtrag bei " + erstesSparbuch.getZinssatz() * 100 + "% p.a. Zinssatz und einer Laufzeit von 3 Jahren:" );
		
		System.out.printf("%.2f Geldeinheiten.", erstesSparbuch.getErtrag(3));
		System.out.println("\n" );
		
		System.out.println("Sparbuch mit der Kontonummer: " + zweitesSparbuch.getKontonummer() + "\nKapital betraegt: " + zweitesSparbuch.getKapital() + " Geldeinheiten.\nErtrag bei " + zweitesSparbuch.getZinssatz() * 100 + "% p.a. Zinssatz und einer Laufzeit von 10 Jahren:" );
		System.out.printf("%.2f Geldeinheiten.", zweitesSparbuch.getErtrag(10));
		System.out.println("\n" );

		System.out.println("Sparbuch mit der Kontonummer: " + zweitesSparbuch.getKontonummer() + "\nKapital betraegt: " + zweitesSparbuch.getKapital() + " Geldeinheiten.\nErtrag bei " + zweitesSparbuch.getZinssatz() * 100 + "% p.a. Zinssatz und einer Laufzeit von 7 Jahren:" );
		System.out.printf("%.2f Geldeinheiten.", zweitesSparbuch.getErtrag(7));
		System.out.println("\n" );

		System.out.println("Sparbuch mit der Kontonummer: " + drittesSparbuch.getKontonummer() + "\nKapital betraegt: " + drittesSparbuch.getKapital() + " Geldeinheiten.\nJahreszins wird berechnet und der neue Kapitalbetrag ausgegeben.");
		drittesSparbuch.verzinse();
		System.out.println("Der neue Kapitalbetrag nach Zinsberechnung lautet: " + drittesSparbuch.getKapital() + " Geldeinheiten.");
		System.out.println("\n" );
		
		System.out.println("Sparbuch mit der Kontonummer: " + viertesSparbuch.getKontonummer() + "\nKapital betraegt: " + viertesSparbuch.getKapital() + " Geldeinheiten.\n100 Geldeinheiten werden eingezahlt.");
		viertesSparbuch.zahleEin(100);
		System.out.println("Neuer Kapitalbetrag nach der Einzahlung lautet: " + viertesSparbuch.getKapital() + " Geldeinheiten.");
		System.out.println("\n" );
		
		System.out.println("Sparbuch mit der Kontonummer: " + viertesSparbuch.getKontonummer() + "\nKapital betraegt: " + viertesSparbuch.getKapital() + " Geldeinheiten.\nEs wird versucht 200 Geldeinheiten abzuheben (Sparbuch verfuegt nicht ueber diese Deckung).");
		if (viertesSparbuch.hebeAb(200))  {
			System.out.println("Neuer Kapitalbetrag nach der Abhebung lautet: " + viertesSparbuch.getKapital() + " Geldeinheiten.");	
		} else {
			System.out.println("Der gewuenschte Betrag von 200 Geldeinheiten kann nicht behoben werden, das Sparbuch enthaelt einen Betrag von: " + viertesSparbuch.getKapital() + " Geldeinheiten.");
		}
		System.out.println("\n" );
		
		System.out.println("Sparbuch mit der Kontonummer: " + viertesSparbuch.getKontonummer() + "\nKapital betraegt: " + viertesSparbuch.getKapital() + ".\nEs wird versucht 50 Geldeinheiten abzuheben (Sparbuch verfuegt ueber die erforderliche Deckung).");
		if (viertesSparbuch.hebeAb(50))  {
			System.out.println("Neuer Kapitalbetrag nach der Abhebung lautet: " + viertesSparbuch.getKapital() + " Geldeinheiten.");	
		} else {
			System.out.println("Der gewuenschte Betrag von 50 Geldeinheiten kann nicht behoben werden, das Sparbuch enthaelt einen Betrag von: " + viertesSparbuch.getKapital());
		}
		System.out.println("\n" );
		
	}
}
