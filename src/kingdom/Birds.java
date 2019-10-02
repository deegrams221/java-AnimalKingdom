package kingdom;

// Inheritance path:
//         Object -> Animal -> Birds
//                           -> Fish
//                           -> Mammals

public class Birds extends Animal
{
    // fields
    private String name;
    private int yearDiscovered;
    
    // constructor
    public Birds(String name, int yearDiscovered) 
    {
        super(name, yearDiscovered);
    }

    // from Animal
    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}