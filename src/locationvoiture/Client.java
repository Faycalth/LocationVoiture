/**
CLient 
---------------

Semble �tre la classe qui va creer les objets Clients : 
	- elle va créer toutes les clients avec differentes caracteristiques 
	- avec un nombre de location  

---------------

attribut nom, type String
attribut tel, type String
attribut adresse, type String
attribut nombreDeLocation, type int

---------------

Regle d'affaires : 
	- Si un client a un nombre de locations > 5, il devient un client regulier 

 */
package locationvoiture;

public class Client {
	
	public String nom;
	public String tel;
	public String adresse;
	public int nombreDeLocation;
	
	public Client() {
		this.nom = null;
		this.tel = null;
		this.adresse = null;
		this.nombreDeLocation = 0;
	}
	
	
	//constructeur sans nb location
	public Client(String n, String t, String ad) {
		this.nom = n;
		this.tel = t;
		this.adresse = ad;
	}
	
	//constructeur avec nb location
	public Client(String n, String t, String ad, int nbL) {
		this.nom = n;
		this.tel = t;
		this.adresse = ad;
		this.nombreDeLocation = nbL;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNombreDeLocation() {
		return nombreDeLocation;
	}

	public void setNombreDeLocation(int nombreDeLocation) {
		this.nombreDeLocation = nombreDeLocation;
	}
	
	@Override
	public String toString() {
		return "Client nom=" + nom + ", tel=" + tel + ", adresse=" + adresse + ", nombreDeLocation=" + nombreDeLocation;
	}
	
}
