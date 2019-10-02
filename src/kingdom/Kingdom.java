package kingdom;

public abstract class Kingdom
{
    // fields
    private static int maxId = 0;
    public int id;

    private String name;
    private int yearDiscovered;

    // constructor
    public Kingdom(String name, int yearDiscovered)
    {
        id = maxId++;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    // methods
    public String getName() 
    {
        return name;
    }

    public void setName()
    {
        this.name = name;
    }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    public void setYearDiscovered()
    {
        this.yearDiscovered = yearDiscovered;
    }

    public String consume()
    {
        return "Consumes";
    }

    public String move() 
    {
        return "Moves";
    }

    public String breathe() 
    {
        return "Breathes";
    }

    public String reproduce() 
    {
        return "Reproduces";
    }
}