package at.bfi.oop.sparbuch;

class Sparbuch {
	private String kontonummer;
	private double kapital;
	private double zinssatz;
	
	public Sparbuch(String kontonummer, double kapital, double zinssatz) {
		this.kontonummer = kontonummer;
		this.kapital = kapital;
		this.zinssatz = zinssatz;
	}

	public String getKontonummer() {
		return kontonummer;
	}
	
	public double getKapital() {
		return kapital;
	}
	
	public double getZinssatz() {
		return zinssatz;
	}

	public void zahleEin(double betrag) {
		kapital += betrag;
	};
	
	public boolean hebeAb(double betrag) {
		if ( kapital > betrag ) {
			kapital -= betrag;
			return true;	
		}
		
		return false;
	}
	
    public double getErtrag(int laufzeitJahre) {
        return kapital * Math.pow(1 + zinssatz, laufzeitJahre);
    }
    
    public void verzinse() {
        kapital = getErtrag(1);
    }

	@Override
	public String toString() {
		return "Sparbuch [kontonummer=" + kontonummer + ", kapital=" + kapital + ", zinssatz=" + zinssatz + "]";
	}
    
}
