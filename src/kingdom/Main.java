// compile commands: javac kingdom/*.java
//                   jar cvfe kingdom.jar kingdom.Main kingdom/*.class
//                   java -jar kingdom.jar

package kingdom;

import java.util.*;

public class Main
{
    public static ArrayList<Kingdom> filteredList = new ArrayList<Kingdom>();

    public static void printKingdom(ArrayList<Kingdom> kingdoms, CheckKingdom tester) 
    {
        // clear out the filtered list
        filteredList.clear();

        // loop through the array list
        for (Kingdom k : kingdoms) 
        {
            if (tester.test(k)) 
            {
                System.out.println(k.getName());
            }
        }
    }

    public static void main(String[] args)
    {
        // ArrayList
        ArrayList<Kingdom> myKingdom = new ArrayList<Kingdom>();
        // Birds
        myKingdom.add(new Birds("Pigeon", 1837));
        myKingdom.add(new Birds("Peacock", 1821));
        myKingdom.add(new Birds("Toucan", 1758));
        myKingdom.add(new Birds("Parrot", 1824));
        myKingdom.add(new Birds("Swan", 1758));

        // Fish
        myKingdom.add(new Fish("Salmon", 1758));
        myKingdom.add(new Fish("Catfish", 1817));
        myKingdom.add(new Fish("Perch", 1758));

        // Mammals
        myKingdom.add(new Mammals("Panda", 1869));
        myKingdom.add(new Mammals("Zebra", 1778));
        myKingdom.add(new Mammals("Koala", 1816));
        myKingdom.add(new Mammals("Sloth", 1804));
        myKingdom.add(new Mammals("Armadillo", 1758));
        myKingdom.add(new Mammals("Raccoon", 1758));
        myKingdom.add(new Mammals("Bigfoot", 2021));

        // Lambda Expressions

        // List all the animals in descending order by year named
        System.out.println("\n*** Print in descending order by year named ***");


        // List all the animals alphabetically
        System.out.println("\n*** Print alphabetically ***");


        // List all the animals in order by how they move
        System.out.println("\n*** Print in order by how they move ***");


        // List only those animals the breath with lungs
        System.out.println("\n*** Print only those animals the breath with lungs ***");


        // List only those animals that breath with lungs and were named in 1758
        System.out.println("\n*** Print only those animals that breath with lungs and were named in 1758 ***");


        // List only those animals that lay eggs and breath with lungs
        System.out.println("\n*** Print only those animals that lay eggs and breath with lungsd ***");


        // List alphabetically only those animals that were named in 1758 
        System.out.println("\n*** Print alphabetically only those animals that were named in 1758 ***");

        
    }
}