package otros;

import java.util.List;

import com.personas.Person;
import com.personas.Person.Sex;

public class RedSocial {
	interface CheckPerson {boolean test(Person p);}
	interface Print{void print(String a);}

	public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
		for(Person p:roster){if(low<=p.getAge()&&p.getAge()<high){p.printPerson();}}}
	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for(Person p:roster){if(p.getAge()>=age){p.printPerson();}}}
	
	public static void printPersons(List<Person> roster, CheckPerson tester) {
		for (Person p : roster) {if (tester.test(p)) {	p.printPerson();}}}
	
	
	
	public static void main(String[] args) {
		List<Person> roster;
		roster =Person.createRoster();
		class CheckPersonEligibleForSelectiveService implements CheckPerson {
			public boolean test(Person p) {
		    	return p.gender == Person.Sex.MALE &&p.getAge() >= 18 &&p.getAge() <= 25;}
	}
	printPersonsOlderThan( roster,30);
	printPersons( roster, new CheckPersonEligibleForSelectiveService());
	
	printPersons( roster,new CheckPerson() {
		        public boolean test(Person p) {
		            return p.getGender() == Person.Sex.MALE
		                && p.getAge() >= 18
		                && p.getAge() <= 25;
		        }});
	
	 Print a=(String d)->System.out.println(d);
	
 boolean a=p->p.getGender()==Person.Sex.MALE&& p.getAge()>=18&& p.getAge() <= 25;

printPersons(roster,(Person p)->p.getGender()==Person.Sex.MALE&& p.getAge()>=18&& p.getAge() <= 25);
	
	}
}
