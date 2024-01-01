## Abstract Factory Pattern Task

### Task Description

You are tasked with designing an online clothing store system that sells different types of clothing items (e.g., shirts, pants) in different styles (e.g., casual, formal). Implement the Abstract Factory Pattern to create families of related clothing items based on styles. Your goal is to allow the addition of new clothing styles without modifying existing code.

### Requirements

1. Create an abstract factory interface (`ClothingFactory`) with methods for creating different types of clothing items (e.g., `createShirt`, `createPants`).

2. Implement concrete factories for each style (e.g., `CasualClothingFactory`, `FormalClothingFactory`) that extend the abstract factory and provide implementations for creating the respective clothing items.

3. Create abstract product interfaces/classes (`Shirt`, `Pants`) representing different types of clothing items.

4. Implement concrete products for each type of clothing item and style (e.g., `CasualShirt`, `FormalShirt`, `CasualPants`, `FormalPants`).

5. In the client code (online store), use the factories to create instances of clothing items without knowing the specific classes being instantiated.

### Notes

- Your design should allow for easy addition of new clothing styles and types without modifying existing code.
- Feel free to sketch out the class hierarchy and relationships between them to demonstrate your understanding of the Abstract Factory Pattern.
