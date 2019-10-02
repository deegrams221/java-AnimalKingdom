package kingdom;

// Inheritance path:
//         Object -> Animal -> Birds
//                           -> Fish
//                           -> Mammals

public class Fish implements Animal
{
    private String name;
    private int yearDiscovered;

    public Fish(String name) 
    {
        this.name = name;
    }

    public Fish(int yearDiscovered) 
    {
        this.yearDiscovered = yearDiscovered;
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