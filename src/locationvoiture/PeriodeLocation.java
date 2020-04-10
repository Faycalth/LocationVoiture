/**
PeriodeLocation 
---------------

Semble être une classe qui va représente toutes les locations de la classe Voiture

---------------

attribut dateDebut, type String
attribut dateFin, type String

 */
package locationvoiture;

public class PeriodeLocation {
	
	public String dateDebut;
	public String dateFin;
	
	public PeriodeLocation() {
		this.dateDebut = null;
		this.dateFin = null;
	}
	
	public PeriodeLocation(String debut, String fin) {
		this.dateDebut = debut;
		this.dateFin = fin;
	}
	
	

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	@Override
	public String toString() {
		return "PeriodeLocation [dateDebut=" + dateDebut + ", dateFin=" + dateFin + "]";
	}
	
	
}
