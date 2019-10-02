package kingdom;

// Inheritance path:
//         Object -> Animal  -> Birds
//                           -> Fish
//                           -> Mammals

public class Mammals implements Animal
{
    private String name;
    private int yearDiscovered;

    public Mammals(String name) 
    {
        this.name = name;
    }

    public Mammals(int yearDiscovered) 
    {
        this.yearDiscovered = yearDiscovered;
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