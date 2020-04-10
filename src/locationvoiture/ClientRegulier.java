package locationvoiture;
/**
 * 
 * Les clients ayant 5 locations ou plus devienne "client r�gulier" au moment de la 5e location.
 *
 * � partir de la 5e location, leur pointsBonClient = 1 (valeur de d�part), et augmente ensuite selon
 * les r�gles de la m�thode getGoodPointsForRegularCustomer.
 */
public class ClientRegulier extends Client {
	
	
	public int pointsBonClient;

	public ClientRegulier() {
		super();
		this.pointsBonClient = 1;
	}
	
	
	public ClientRegulier(Client c) {
		super(c.getNom(),c.getTel(),c.getAdresse());
		this.nombreDeLocation = 5;
	}
	
	public void addPoints(int value) {
		this.pointsBonClient += value;
	}

	public int getPointsBonClient() {
		return pointsBonClient;
	}

	public void setPointsBonClient(int pointsBonClient) {
		this.pointsBonClient = pointsBonClient;
	}

	@Override
	public String toString() {
		return "ClientRegulier [nom=" + nom + ", tel=" + tel + ", adresse=" + adresse + ", nombreDeLocation="
				+ nombreDeLocation + ", pointsBonClient=" + pointsBonClient + "]";
	}
	
	
}
