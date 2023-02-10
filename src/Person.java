
/**
 * 
 * @author AnselmeG
 * exercice 1.8
 */
public class Person {

	//attributs
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private City bornCity;
	
	//Constructeurs
	public Person(String firstName, String lastName, int age, String address) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setAddress(address);
	}
	public Person(String firstName, String lastName, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setAddress("unknown");
	}
	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(0);
		setAddress("unknown");
	}
	public Person(String firstName, String lastName, int age, String address, City bornCity) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setAddress(address);
		setBornCity(bornCity);
	}
	//accensseurs
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public City getBornCity() {
		return bornCity;
	}
	public void setBornCity(City bornCity2) {
		this.bornCity = bornCity2;
	}
	//méthodes
	public String toString() {
		if (bornCity != null) {
					return "Personn [LastName=" + this.firstName +", firstName=" + this.lastName + ", age=" + this.age + ", address=" + this.address + "]" + "BornCity "+ bornCity ;
		} else {
			return "Personn [LastName=" + this.firstName +", firstName=" + this.lastName + ", age=" + this.age + ", address=" + this.address + "]";
		}
	}
}
