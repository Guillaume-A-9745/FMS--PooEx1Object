package test;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author AnselmeG
 * Test exercice 2
 */
public class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Macron","France","Amiens"));
		people.add(new Person("Sarkozy","France","Paris"));
		people.add(new Person("Johnson","Angleterre","London"));
		people.add(new Person("Depardieu","France","Chateauroux"));
		people.add(new Person("Kravitz","USA","New-York"));
		people.add(new Person("Lawrence","USA","Idan Hills"));
		people.add(new Person("Poutine","Russie","Moscou"));
		people.add(new Person("Biden","USA",""));
		
		List<Person> result = filterPeople(people);
		for(Person person : result) {
		System.out.println(person.getName());
		}
	}
	public static List<Person> filterPeople(List<Person> People){
		List<Person> result = new ArrayList<>();
		for(Person person : People) {
			if(person.getCountry().equals("France") || person.getCity().equals("Paris")) {
				result.add(person);
			}
		}
		return result;
	}
	
}
