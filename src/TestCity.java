/**
 * 
 * @author AnselmeG
 *
 * ExoPooJava exercice 1
 * 
 */
public class TestCity {

	public static void main(String[] args) {

		City toulouse = new City("Toulouse", "France", 450000); 
		City bayonne = new City("Bayonne", "France", 50000);
		City paris = new City("Paris", "France", 1450000); 
		City lille = new City("Lille", "France", 450000); 
		City rabat = new City("Rabat",577000);
		City rabat2 = new City("Rabat","Maroc",577000);
		
		System.out.println(toulouse);
		System.out.println(bayonne);
		System.out.println(paris);
		System.out.println(lille);
		
		//Test augmentation de la population
		toulouse.setPopulationNumber(470000);	
		System.out.println(toulouse);
		//Test population négative
		toulouse.setPopulationNumber(-300);	
		System.out.println(toulouse);
		//Test diminution de la population
		toulouse.setPopulationNumber(450000);	
		System.out.println(toulouse);
		
		System.out.println(rabat);
		System.out.println(rabat2);
		
		toulouse.display();
		System.out.println(toulouse);
	}	
}
