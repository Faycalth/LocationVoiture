package locationvoiture;
/**
 * 
 * @author lavoieeric
 */
public class MainController {
	
	BD bd;
	
	RapportClient rClient;
	RapportLocationParClient rapportLocationParClient;
	RVoiture rVoiture;
	
	public MainController() {
		this.bd = new BD(); // mock bd, the program start with those data at each start
	}
	
	public void start() {
                System.out.println(bd.arrLstLocation.toString());
	}
}
