/**
Taxes 
---------------

Semble etre une classe qui va etre utilise pour calculer les prix des locations en leur ajoutant des taxes
---------------

attribut taxe_prov, type double
attribut taxe_fed, type double

 */
package locationvoiture;

public class Taxes {
	
	private double taxe_prov;
	private double taxe_fed;
	
	public Taxes(double d, double e) {
		this.taxe_prov = d;
		this.taxe_fed = e;
	}
	
	public double addProvTx(double amount) {
		return (double) this.addTx(amount, this.getProv());
	}
	
	public double addFedTx(double amount) {
		return (double) this.addTx(amount, this.getFed());
	}
	
	public double getProv() {
		return this.taxe_prov;
	}
	
	public double getFed() {
		return this.taxe_fed;
	}
	
	public String getStringProv() {
		return String.valueOf(this.getProv());
	}
	
	public String getStringFed() {
		return String.valueOf(this.getFed());
	}
	
	public String getAvis() {
		return "La taxe de vente provinciale de " + 
				this.getStringProv() + 
				"% et la taxe federale de " +
				this.getStringFed() +
				"% sont applicables.";
	}
	
	private double addTx(double amount, double tx) {
		return (double) Math.round(((tx / 100) * amount) * 100d) / 100d;
	}
	

}
