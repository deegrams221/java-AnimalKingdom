package kingdom;

// Inheritance path:
//         Object -> Animal  -> Birds
//                           -> Fish
//                           -> Mammals

public class Mammals extends Kingdom
{
    // fields
    private String name;
    private int yearDiscovered;

    // constructor
    public Mammals(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    // from Animal
    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
}