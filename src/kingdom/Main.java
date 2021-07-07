// compile commands: javac kingdom/*.java
//                   jar cvfe kingdom.jar kingdom.Main kingdom/*.class
//                   java -jar kingdom.jar

package kingdom;

import java.util.*;

public class Main 
{
    public static void printAnimals(ArrayList<Animal> animals, CheckKingdom tester) 
    {
        for (Animal a : animals) 
        {
            if (tester.test(a)) 
            {
                System.out.println(a.getName());
            }
        }
    }

    public static void main(String[] args) 
    {
        ArrayList<Animal> myAnimals = new ArrayList<Animal>();

        // Adding Birds
        myAnimals.add(new Birds("Pigeon", 1837));
        myAnimals.add(new Birds("Peacock", 1821));
        myAnimals.add(new Birds("Toucan", 1758));
        myAnimals.add(new Birds("Parrot", 1824));
        myAnimals.add(new Birds("Swan", 1758));

        // Adding Fish
        myAnimals.add(new Fish("Salmon", 1758));
        myAnimals.add(new Fish("Catfish", 1817));
        myAnimals.add(new Fish("Perch", 1758));

        // Adding Mammals
        myAnimals.add(new Mammals("Panda", 1869));
        myAnimals.add(new Mammals("Zebra", 1778));
        myAnimals.add(new Mammals("Koala", 1816));
        myAnimals.add(new Mammals("Sloth", 1804));
        myAnimals.add(new Mammals("Armadillo", 1758));
        myAnimals.add(new Mammals("Raccoon", 1758));
        myAnimals.add(new Mammals("Bigfoot", 2021));

    // Lambda Expressions

    // List all the animals in descending order by year named
        System.out.println("\n*** Print in descending order by year named ***");
        // sort
        myAnimals.sort((a1, a2) -> a1.getYearDiscovered() - a2.getYearDiscovered());
        // print
        myAnimals.forEach(a -> System.out.println("Name: " + a.getName() + " : Year Named: " + a.getYearDiscovered()));

    // List all the animals alphabetically
        System.out.println("\n*** Print alphabetically ***");
        // sort                                 ignores all case for sorting
        myAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        // print
        myAnimals.forEach(a -> System.out.println("Name: " + a.getName()));

    // List all the animals in order by how they move
        System.out.println("\n*** Print in order by how they move ***");
        // sort                             
        myAnimals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        // print
        myAnimals.forEach(a -> System.out.println("Name: " + a.getName() + " : How they move: " + a.move()));

    // List only those animals that breath with lungs
        System.out.println("\n*** Print only those animals that breath with lungs ***");
        // sort                             
        myAnimals.sort((a1, a2) -> a1.breath().compareToIgnoreCase(a2.breath()));
        // print
        myAnimals.forEach(a -> System.out.println("Name: " + a.getName() + " : How they breath: " + a.breath()));

    // List only those animals that breath with lungs and were named in 1758
        System.out.println("\n*** Print only those animals that breath with lungs and were named in 1758 ***");
        
        printAnimals(myAnimals, a -> a.breath().equals("lungs") && a.getYearDiscovered() == 1758);


    // List only those animals that lay eggs and breath with lungs
        System.out.println("\n*** Print only those animals that lay eggs and breath with lungs ***");

        printAnimals(myAnimals, a -> a.breath().equals("lungs") && a.reproduce().equals("eggs"));  


    // List alphabetically only those animals that were named in 1758 
        System.out.println("\n*** Print alphabetically only those animals that were named in 1758 ***");

        myAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(myAnimals, a -> a.getYearDiscovered() == 1758);
    }
}