package kingdom;

// Inheritance path:
//         Object -> Kingdom -> Birds
//                           -> Fish
//                           -> Mammals

public class Birds extends Kingdom
{
    public Birds(String name, int yearDiscovered) 
    {
        super(name, yearDiscovered);
    }

    // from Kingdom
    @Override
    public void move()
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