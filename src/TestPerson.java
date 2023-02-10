import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author AnselmeG
 * exercice 1.8 à 2
 */
public class TestPerson {

	public static void main(String[] args) {
		Person manu = new Person("Macron", "Emmanuel",43,"Elysée à Paris",new City("Amiens","France"));
		Person poutine = new Person ("Poutine", "Vladimir",68);
		Person biden = new Person ("Biden","Joe");

		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);
		System.out.println();
		
/*		Person nicolas = new Person ("Sarkozy", "Nicolas", 66, "Paris", new City ("Paris", "France",2000000));
		Person boris = new Person ("Johnson", "Boris", 56, "Downing Street à London", new City ("New York", "Etats-Unis"));
		Person gerard = new Person ("Depardieu", "Gerard", 72, "Moscou", new City ("Chateauroux", "France"));
		Person lenny = new Person ("Kravitz", "Lenny", 56, "Hotel Particulier à Paris", new City ("New-York", "USA"));
		Person jennifer = new Person ("Lawrence", "Jennifer", 30, "Louisville aux USA", new City ("Idan Hills", "USA"));
*/		
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Macron", "Emmanuel",43,"Elysée à Paris",new City("Amiens","France")));
		people.add(new Person ("Sarkozy", "Nicolas", 66, "Paris", new City ("Paris", "France",2000000)));
		people.add(new Person ("Depardieu", "Gerard", 72, "Moscou", new City ("Chateauroux", "France")));
		people.add(new Person ("Kravitz", "Lenny", 56, "Hotel Particulier à Paris", new City ("New-York", "USA")));
		people.add(new Person ("Lawrence", "Jennifer", 30, "Louisville aux USA", new City ("Idan Hills", "USA")));
		
		
		
		System.out.println("Liste des personnalités");
		for(Person person : people) {
			System.out.println(person.getFirstName() + " , " + person.getLastName() + " , " + person.getAge() + " , " + person.getAddress() + " , Ville de naissance : " + person.getBornCity() );
		}
		System.out.println("----------------------------------------");
		System.out.println("Liste après notre filtre");
		List<Person> result = filterPeople(people);
		for(Person person : result) {
			System.out.println(person.getFirstName() + " , " + person.getLastName() + " , " + person.getAge() + " , " + person.getAddress() + " , Ville de naissance : " + person.getBornCity() );
		}
	}
	public static List<Person> filterPeople(List<Person> People){
		List<Person> result = new ArrayList<>();
		for(Person person : People) {
			if(person.getBornCity().equals("France") || person.getAddress().contains("Paris")) {   
				result.add(person);
			}
		}
		return result;
	}
		
	
}
