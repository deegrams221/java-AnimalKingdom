package kingdom;

public abstract class Kingdom 
{
    // fields
    private String name;
    private int yearDiscovered;

    // constructor
    public Kingdom(String name, int year) 
    {
        this.name = name;
        yearDiscovered = year;
    }

    // abstract methods
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
} 