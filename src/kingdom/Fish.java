package kingdom;

// Inheritance path:
//         Object -> Kingdom -> Birds
//                           -> Fish
//                           -> Mammals

public class Fish extends Kingdom
{
    public Fish(String name, int yearDiscovered) 
    {
        super(name, yearDiscovered);
    }

    // from Kingdom
    @Override
    public void move()
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