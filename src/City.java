/**
 * 
 * @author AnselmeG
 *
 */
public class City {
	//attributs
	private String cityName;
	private String countryName;
	private int populationNumber;
	private static int counter = 0 ;
	//constructeurs
	public City (String cityName, String countryName, int populationNumber) {
		setCityName(cityName);
		setCountryName(countryName);
		setPopulationNumber(populationNumber);
		counter ++;
	}
	public City(String cityName,  int populationNumber) {
		setCityName(cityName);
		setCountryName("unknown");
		setPopulationNumber(populationNumber);
		counter ++;
	}

	public City(String cityName, String countryName) {
		setCityName(cityName);
		setCountryName(countryName);
		setPopulationNumber(0);
		counter ++;
	}
	//accensseurs
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getPopulationNumber() {
		return populationNumber;
	}

	public void setPopulationNumber(int populationNumber) {
		if(populationNumber < 0 ) {
			System.out.println("Erreur de saisie, la population ne peux pas être ne négatif.");
		} else if (populationNumber < this.populationNumber && populationNumber > 0) {
			System.out.println("Erreur de saisie, la population ne peux pas diminuer.");
		} else {
			this.populationNumber = populationNumber;
		}
		
	}
	
	//méthodes
/*	public String toString() {
		return "Ville : " + getCityName() + "\t" + "Pays : " + getCountryName() + "\t" + "Nombre d'habitants : " + getPopulationNumber();
	}*/
	public String toString() {
		return "[Ville : " + getCityName() + "]\t" + "[Pays : " + getCountryName() + "]\t" + "[Nombre d'habitants : " + getPopulationNumber() + "]";
	}
/*	public String toString() {
		return "Ville de " + this.cityName + " en " + this.countryName + " ayant " + this.populationNumber + " habotants.";
	}*/
	public void display() {	
			System.out.println("Ville de " + this.cityName + " en " + this.countryName + " ayant " + this.populationNumber +" habitants.");
	}
	public static String displayCount() {
		return "Il y a " + counter + " ville(s)";
	}
}
