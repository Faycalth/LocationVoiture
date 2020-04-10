package locationvoiture;
import java.util.ArrayList;


/*
 *  ** MOCK Database **
 *  This is the database when the program start.
 */


public class BD {
	
	public Taxes tx;
	public ArrayList<ClientRegulier> arrLstClientRegulier;
	public ArrayList<Client> arrLstClient;
	public ArrayList<Voiture> arrLstVoiture;
	public ArrayList<Location> arrLstLocation;
	
	public BD() {
		this.tx = new Taxes(5.0, 8.5);
		
		this.arrLstClientRegulier = new ArrayList<ClientRegulier>();
		this.arrLstClient = new ArrayList<Client>();
		this.arrLstVoiture = new ArrayList<Voiture>();
		this.arrLstLocation = new ArrayList<Location>();
		
		ClientRegulier cr1 = new ClientRegulier();
		cr1.nom = "Maxime Talbot";
		cr1.adresse = "47, avenue Royale, Rimouski";
		cr1.tel = "581-555-3456";
		cr1.pointsBonClient = 6;
		this.arrLstClientRegulier.add(cr1);
		
		ClientRegulier cr2 = new ClientRegulier();
		cr2.nom = "Johanne Tremblay";
		cr2.adresse = "99, rue des Pignons, Rimouski";
		cr2.tel = "581-555-2387";
		cr2.pointsBonClient = 15;	
		this.arrLstClientRegulier.add(cr2);
		
		Client c1 = new Client();
		c1.nom = "Melanie Charron";
		c1.adresse = "12, rue des Fauvettes, Rimouski";
		c1.tel = "581-555-8823";
		this.arrLstClient.add(c1);
		
		Client c2 = new Client();
		c2.nom = "Francois Beauchemin";
		c2.adresse = "50, rue des Oliviers, Rimouski";
		c2.tel = "581-555-7525";
		this.arrLstClient.add(c2);
		
		Voiture v1 = new Voiture();
		v1.setMarque("Chevrolet");
		v1.setModele("Bolt");
		v1.setAnnee("2018");
		this.arrLstVoiture.add(v1);
		
		Voiture v2 = new Voiture();
		v2.setMarque("Tesla");
		v2.setModele("3");
		v2.setAnnee("2019");
		this.arrLstVoiture.add(v2);
		
		Voiture v3 = new Voiture();
		v3.setMarque("Toyota");
		v3.setModele("Prius");
		v3.setAnnee("2019");
		this.arrLstVoiture.add(v3);
		
		Voiture v4 = new Voiture();
		v4.setMarque("Honda");
		v4.setModele("Civic");
		v4.setAnnee("2019");
		this.arrLstVoiture.add(v4);
		
		PeriodeLocation pl1 = new PeriodeLocation();
		pl1.dateDebut = "2020-04-01";
		pl1.dateFin = "2020-04-03";
		
		Location l1 = new Location();
		l1.setClient(c1);
		l1.setVoiture(v1);
		l1.setpL(pl1);
		this.arrLstLocation.add(l1);
		
		PeriodeLocation pl2 = new PeriodeLocation();
		pl1.dateDebut = "2020-04-01";
		pl1.dateFin = "2020-04-03";
		
		Location l2 = new Location();
		l2.setClient(cr1);
		l2.setVoiture(v2);
		l2.setpL(pl2);
		this.arrLstLocation.add(l2);
	}
	
	
}
