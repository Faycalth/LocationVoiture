package locationvoiture;
/**
CalculPrix 
---------------

Semble etre la classe qui va calculer les prix des locations : 
	- pour les diff�rentes voitures
	- avec des taxes 
	- cr�er la facture

---------------

R�gles d'affaires : 
Prix d'une location par jour pour :
	- Toyota = 17.5
	- Tesla = 33.0
	- Honda = 22.0
	- Chevrolet = 27.5
	- Autres marques = 34.0

attribut price, type double


 */
public class CalculPrix {
	
	private double price;
	
	public CalculPrix() {
		this.setPrice(0);
	}
	
	public void addTxToPrice(Taxes t) {
		this.price = getPrice() + t.addFedTx(this.price) + t.addProvTx(this.price);
	}
	
	public double getLocationPricePerDayForToyota() {
		return 17.5;
	}
	
	public double getLocationPricePerDayForTesla() {
		return 33.0;
	}
	
	public double getLocationPricePerDayForHonda() {
		return 22.0;
	}
	
	public double getLocationPricePerDayForChevrolet() {
		return 27.5;
	}
	
	public double getDefaultPrice() {
		return 34.0;
	}
	
	public double getPriceForThisCar(Voiture v) {
		switch(v.getMarque()) {
		case "Toyota" :
			return this.getLocationPricePerDayForToyota();
		case "Honda" :
			return this.getLocationPricePerDayForHonda();
		case "Tesla" :
			return this.getLocationPricePerDayForTesla();
		case "Chevrolet" :
			return this.getLocationPricePerDayForChevrolet();
		default :
			return this.getDefaultPrice();
		}
	}
	
	public void showNewBill(Location loc) {		
            double prixHT = calculPrix(loc);
            int duree = loc.dureeLocation();
            System.out.println("Le montant de la facture HORS-TAXES est de : " + prixHT+ " pour une duree de location de :" +duree+ " jours");
	}
        
        public double calculPrix(Location loc) {
		int nbJours = loc.dureeLocation();
		
		this.price = nbJours * this.getPriceForThisCar(loc.getVoiture());
		
		return this.price;
	
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
