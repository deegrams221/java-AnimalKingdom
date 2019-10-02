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

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    public void setYearDiscovered(int yearDiscovered)
    {
        this.yearDiscovered = yearDiscovered;
    }

    public String getMove() 
    {
        return "move";
    }

    public String getBreath() 
    {
        return "breath";
    }

    public String getReproduce() 
    {
        return "reproduce";
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