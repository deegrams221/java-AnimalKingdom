package kingdom;

// Inheritance path:
//         Object -> Animal -> Birds
//                           -> Fish
//                           -> Mammals

public class Fish extends Animal
{
    // fields
    private String name;
    private int yearDiscovered;
    
    // constructor
    public Fish(String name, int yearDiscovered) 
    {
        super(name, yearDiscovered);
    }

    // from Animal
    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breath()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}