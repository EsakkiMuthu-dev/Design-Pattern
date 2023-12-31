# Strategy Pattern Design Task

## Scenario:

You are designing a simulation system for a game where characters need to have different movement strategies. Each character should be able to exhibit various movement behaviors such as walking, running, and flying.

## Task:

Design a system using the Strategy Pattern to implement different movement strategies for game characters.

### Requirements:

1. Define a `MovementStrategy` interface with a method `move()` that represents the movement behavior.
2. Implement concrete classes (`WalkStrategy`, `RunStrategy`, `FlyStrategy`, etc.) that implement the `MovementStrategy` interface.
3. Create a `Character` class that can be configured with different movement strategies.
4. Allow a character to change its movement strategy dynamically during the game.
5. Write client code to demonstrate the flexibility of changing movement strategies for different characters.

### Instructions:

- Organize your solution with clear separation of concerns using appropriate classes and interfaces.
- Ensure that your design adheres to the principles of the Strategy Pattern.
- Write a client code example that showcases the flexibility of your system in handling different movement behaviors for game characters.

### Submission:

Submit your solution as a well-structured and documented codebase along with a brief explanation of your design choices and any trade-offs made.

**Note:** Feel free to use any programming language of your choice.
