package ocasinavsorulari.Q057;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
	String name;
	int age;
	public Person (String n, int a) {
		name = n;
		age =a;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Test {
	public static void checkAge(List<Person> list, Predicate<Person> predicate) {
		for (Person p : list) {
			if (predicate.test(p)) {
				System.out.println(p.name + " ");
			}
		}
	}
	public static void main(String[] args) {
		List<Person> iList =
				Arrays.asList(new Person("Hank",  45),
					          new Person("Charlie", 40),
							  new Person("Smith", 38));
		// Line n1
		checkAge (iList, p-> p.getAge() > 30);
// Which code fragment, when inserted at line n1, enables the code to print Hank?
		
//		checkAge (iList, () -> p.getAge() > 40);
//		checkAge (iList, Person p -> p.getAge() > 40);
//		checkAge (iList, p-> p.getAge() > 40);
//		checkAge (iList, (Person p) -> {p.getAge() > 40});
		

	}

}
