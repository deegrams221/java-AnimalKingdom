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
        // Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        // Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // Mammals
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

    }
}