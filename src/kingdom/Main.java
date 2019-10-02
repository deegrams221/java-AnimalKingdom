// compile commands: javac kingdom/*.java
//                   jar cvfe kingdom.jar kingdom.Main kingdom/*.class
//                   java -jar kingdom.jar

package kingdom;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        // Interface Classes
        System.out.println("\n*** Interface Classes ***");

        Birds pigeon = new Birds(1, "Pigeon", 1837);
        Birds peacock = new Birds(2, "Peacock", 1821);
        Birds toucan = new Birds(3, "Toucan", 1758);
        Birds parrot = new Birds(4, "Parrot", 1824);
        Birds swan = new Birds(5, "Swan", 1758);
    }
}