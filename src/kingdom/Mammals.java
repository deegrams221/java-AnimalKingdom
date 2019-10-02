package kingdom;

// Inheritance path:
//         Object -> Kingdom -> Birds
//                           -> Fish
//                           -> Mammals

public class Mammals extends Kingdom
{
    public Mammals(String name, int yearDiscovered) 
    {
        super(name, yearDiscovered);
    }

    // from Kingdom
    @Override
    public void move()
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