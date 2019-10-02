package kingdom;

// Inheritance path:
//         Object -> Animal -> Birds
//                           -> Fish
//                           -> Mammals

public class Birds implements Animal
{
    private String name;
    private int yearDiscovered;

    public Birds(String name) 
    {
        this.name = name;
    }

    public Birds(int yearDiscovered) 
    {
        this.yearDiscovered = yearDiscovered;
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