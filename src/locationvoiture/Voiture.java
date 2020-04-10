/**
Voiture  
---------------

Semble être la classe qui va représente toutes les voitures et leurs caractéristiques 
Elle va nous permettre de créer un nouvel objet Voiture 

---------------

attribut marque, type String
attribut annee, type String
attribut modele, type String

 */
package locationvoiture;

public class Voiture {
	
	public String marque;
	public String annee;
	public String modele;
	
	public Voiture() {
		this.marque = null;
		this.annee = null;
		this.modele = null;
	}
	
	public Voiture(String ma, String a, String mo) {
		this.marque = ma;
		this.annee = a;
		this.modele = mo;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", annee=" + annee + ", modele=" + modele + "]";
	}
	
	

}
