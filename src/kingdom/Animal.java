package kingdom;

public abstract class Animal 
{
    // fields
    private String name;
    private int yearDiscovered;

    // constructor
    public Animal(String name, int yearDiscovered) 
    {
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    // methods
    public String getName() 
    {
        return name;
    }

    public int getYearDiscovered() 
    {
        return yearDiscovered;
    }

    public String move() 
    {
        return "Moves";
    }

    public String breath() 
    {
        return "Breathes";
    }

    public String reproduce() 
    {
        return "Reproduces";
    }

} 