/**
 * 
 * @author AnselmeG
 * exercice 1.8
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
		
		Person nicolas = new Person ("Sarkozy", "Nicolas", 66, "Paris", new City ("Paris", "France",2000000));
		Person boris = new Person ("Johnson", "Boris", 56, "Downing Street à London", new City ("New York", "Etats-Unis"));
		Person gerard = new Person ("Depardieu", "Gerard", 72, "Moscou", new City ("Chateauroux", "France"));
		Person lenny = new Person ("Kravitz", "Lenny", 56, "Hotel Particulier à Paris", new City ("New-York", "USA"));
		Person jennifer = new Person ("Lawrence", "Jennifer", 30, "Louisville aux USA", new City ("Idan Hills", "USA"));
		
		System.out.println(manu);
		System.out.println(nicolas);
		System.out.println(boris);
		System.out.println(gerard);
		System.out.println(lenny);
		System.out.println(jennifer);
		System.out.println("----------------------------------------");
		
	}

}
