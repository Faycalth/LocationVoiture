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
                
                ClientRegulier cr3 = new ClientRegulier();
		cr3.nom = "Mathias Durand";
		cr3.adresse = "99, rue des Pignons, Rimouski";
		cr3.tel = "581-555-2387";
		cr3.pointsBonClient = 18;	
		this.arrLstClientRegulier.add(cr3);
                
                ClientRegulier cr4 = new ClientRegulier();
		cr4.nom = "Kevin Durant";
		cr4.adresse = "99, rue des Pignons, Rimouski";
		cr4.tel = "581-555-2387";
		cr4.pointsBonClient = 6;	
		this.arrLstClientRegulier.add(cr4);
		
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
                
                Client c3 = new Client();
		c3.nom = "Cristiano Ronaldo";
		c3.adresse = "50, rue bergeron, Matane";
		c3.tel = "581-555-7525";
		this.arrLstClient.add(c3);
                
                Client c4 = new Client();
		c4.nom = "Kylian Mbappe";
		c4.adresse = "160 rue de la Martigue, Paris";
		c4.tel = "581-555-7525";
		this.arrLstClient.add(c4);
                
                Client c5 = new Client();
		c5.nom = "Quaresma Lokfh";
		c5.adresse = "50, rue des Oliviers, Rimouski";
		c5.tel = "581-555-7525";
		this.arrLstClient.add(c5);
                
                Client c6 = new Client();
		c6.nom = "Francois Beauchemin 2";
		c6.adresse = "50, rue des Olives, Rimouski";
		c6.tel = "581-555-7525";
		this.arrLstClient.add(c6);
		
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
		pl2.dateDebut = "2020-04-01";
		pl2.dateFin = "2020-04-03";
		
		Location l2 = new Location();
		l2.setClient(cr1);
		l2.setVoiture(v2);
		l2.setpL(pl2);
		this.arrLstLocation.add(l2);
                
                PeriodeLocation pl3 = new PeriodeLocation();
		pl3.dateDebut = "2020-03-01";
		pl3.dateFin = "2020-04-25";
                
                Location l3 = new Location();
		l3.setClient(c5);
		l3.setVoiture(v4);
		l3.setpL(pl1);
		this.arrLstLocation.add(l3);
                
                Location l4 = new Location();
		l4.setClient(cr4);
		l4.setVoiture(v4);
		l4.setpL(pl1);
		this.arrLstLocation.add(l4);
                
                Location l5 = new Location();
		l5.setClient(cr3);
		l5.setVoiture(v4);
		l5.setpL(pl1);
		this.arrLstLocation.add(l5);
                
                Location l6 = new Location();
		l6.setClient(cr3);
		l6.setVoiture(v3);
		l6.setpL(pl2);
		this.arrLstLocation.add(l6);
                
                Location l7 = new Location();
		l7.setClient(cr3);
		l7.setVoiture(v4);
		l7.setpL(pl1);
		this.arrLstLocation.add(l7);
                
                Location l8 = new Location();
		l8.setClient(cr2);
		l8.setVoiture(v2);
		l8.setpL(pl3);
		this.arrLstLocation.add(l8);
                
                
	}
	
	
}
