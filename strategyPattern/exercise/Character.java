package strategyPattern.exercise;

public class Character {
    String name;
    MovementStrategy movementStrategy;
    // Constructor
    public  Character(String name , MovementStrategy movementStrategy)
    {
        this.name = name;
        this.movementStrategy = movementStrategy;
    }
    public void move()
    {
        movementStrategy.move();
    }
}
