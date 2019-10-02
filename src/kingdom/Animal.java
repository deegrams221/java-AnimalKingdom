package kingdom;

// interface contains methods not fields

public interface Animal
{
    // dont need public or private, by default it is protected
    String move(); 
    String breath();
    String reproduce();
}