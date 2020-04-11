package locationvoiture;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
Location 
---------------

Semble etre la classe la plus importante : 
	- elle va creer toutes les locations, en associant les clients et les voitures 
	- en creant une periode de location   

---------------

attribut client, type Client
attribut clientRegulier, type ClientRegulier
attribut voiture, type Voiture
attribut pL, type PeriodeLocation

---------------

Regles d'affaires : 
	- Pour un client regulier : 
		Si le nombre de locations < 15 alors
			points = 1
		Si le nombre de locations < 45 alors
			points = 2
		Si le nombre de locations <= 75 alors
			points = 3

 */
public class Location {
	
	private Client client;
	private ClientRegulier clientRegulier;
	private Voiture voiture;
	private PeriodeLocation pL;
	
	public Location() {
		this.client = null;
		this.clientRegulier = null;
		this.voiture = null;
		this.setpL(null);
	}
        
        public Location(Client c, Voiture v, PeriodeLocation p){
            this.client = c;
            this.voiture = v;
            this.pL = p;
            this.client.setNombreDeLocation(client.getNombreDeLocation()+1);
            verifNbLocation();
        }
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
                this.client.setNombreDeLocation(client.getNombreDeLocation()+1);
	}

	public ClientRegulier getClientRegulier() {
		return clientRegulier;
	}

	public void setClientRegulier(ClientRegulier clientRegulier) {
		this.clientRegulier = clientRegulier;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public PeriodeLocation getpL() {
		return pL;
	}

	public void setpL(PeriodeLocation pL) {
		this.pL = pL;
	}
	
	public int getGoodPointsForRegularCustomer(int nbLocation) {
		int points = 0;
		if (nbLocation < 15) {
			points = 1;
		} else if (nbLocation < 45) {
			points = 2;
		} else if (nbLocation >= 75) {
			points = 3;
		}
		return points;
	}
	
	//https://waytolearnx.com/2018/11/calculer-le-nombre-de-jours-entre-deux-dates-java.html
	
	public int dureeLocation() {
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	   int res = 0;
	     try {
	        Date dateAvant = sdf.parse(pL.dateDebut);
	        Date dateApres = sdf.parse(pL.dateFin);
	        long diff = dateApres.getTime() - dateAvant.getTime();
	        res = (int) (diff / (1000*60*60*24));
	        return res;
	     } catch (Exception e) {
	         e.printStackTrace();
	     }
		return res;
	  }
        
        public final void verifNbLocation(){
            if (this.client.getNombreDeLocation() == 5){   
                ClientRegulier cR = new ClientRegulier(this.client);
                this.setClientRegulier(cR);
                }
        }

	@Override
	public String toString() {
		return "Location [client=" + client + ", clientRegulier=" + clientRegulier + ", voiture=" + voiture + ", pL="
				+ pL + "]";
	}
	
	

}
