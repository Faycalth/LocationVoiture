package locationvoiture;
/**
 * 
 * @author lavoieeric
 */
public class MainController {
	
	BD bd;
	
	public MainController() {
		this.bd = new BD(); // mock bd, the program start with those data at each start
	}
	
	public void start() {
                
            //Exemple du calcul du prix de la location 0 :
            System.out.println(bd.arrLstLocation.get(0));
            System.out.println("Nombre de jours de locations = " +bd.arrLstLocation.get(0).dureeLocation());
            System.out.println("Marque de la voiture = " +bd.arrLstLocation.get(0).getVoiture().getMarque());

            CalculPrix cP = new CalculPrix();
            System.out.println("Prix de la voiture a la journee = " +cP.getPriceForThisCar(bd.arrLstLocation.get(0).getVoiture()));
            System.out.println("Prix de la location = " +cP.calculPrix(bd.arrLstLocation.get(0)));
	}
}
