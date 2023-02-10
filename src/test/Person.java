package test;
/**
 * 
 * @author AnselmeG
 * Test exercice 2
 */
public class Person {
	private String name;
	private String country;
	private String city;
	
	public Person(String name, String country, String city) {
		this.name = name;
		this.country = country;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
