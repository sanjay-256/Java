import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get total number of persons
    System.out.print("Enter the total number of persons: ");
    int totalPersons = scanner.nextInt();

    // Get number of persons to get priority
    System.out.print("Enter the number of priority persons: ");
    int numPriorityPersons = scanner.nextInt();

    // Create list of persons
    ArrayList<String> persons = new ArrayList<>();
    for (int i = 0; i < totalPersons; i++) {
      System.out.print("Enter the name of person " + (i+1) + ": ");
      String personName = scanner.next();
      persons.add(personName);
    }

    // Get priority persons and add them to front of list
    ArrayList<String> priorityPersons = new ArrayList<>();
    for (int i = totalPersons - numPriorityPersons; i < totalPersons; i++) {
      String priorityPerson = persons.get(i);
      priorityPersons.add(priorityPerson);
    }
    persons.removeAll(priorityPersons);
    persons.addAll(0, priorityPersons);

    // Print final list of persons
    System.out.println("Final list of persons:");
    for (String person : persons) {
      System.out.println(person);
    }
  }
}
