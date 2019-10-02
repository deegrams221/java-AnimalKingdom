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
    public String getName(String name) 
    {
        return name;
    }

    public void setName()
    {
        this.name = name;
    }

    public int getYearDiscovered(int yearDiscovered)
    {
        return yearDiscovered;
    }

    public void setYearDiscovered()
    {
        this.yearDiscovered = yearDiscovered;
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

    @Override
    public String toString()
    {
        return "Kingdom{" +
                "name='" + name + '\'' +
                ", yearDiscovered=" + yearDiscovered +
                '}';
    }
}