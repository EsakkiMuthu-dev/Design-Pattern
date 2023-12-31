# Strategy Pattern

The Strategy Pattern is a behavioral design pattern that enables an object to alter its behavior dynamically by encapsulating different algorithms and allowing clients to choose between them at runtime.

## Problem

Sometimes, we need to implement different variations of an algorithm or behavior in an application. However, it becomes challenging to manage multiple versions of the same algorithm or behavior in a clean and maintainable way. Additionally, if the behavior needs to change dynamically at runtime, it can be even more complex.

## Solution

The Strategy Pattern suggests encapsulating each variation of an algorithm or behavior into its own class, known as a strategy. The main object, known as the context, holds a reference to the selected strategy and delegates the work to it. By doing so, the context can switch between different strategies dynamically at runtime.

## UML Diagram

The UML diagram for the Strategy Pattern consists of three main components:

1. **Context**: The main object that holds a reference to the selected strategy and delegates the work to it.

2. **Strategy**: The interface or abstract class that defines the common methods to be implemented by all concrete strategies.

3. **Concrete Strategies**: The classes that implement the strategy interface and provide different variations of the algorithm or behavior.


## Example

In this example, we have an e-commerce application that allows customers to checkout using different payment methods (Cash on Delivery, Credit Card, or UPI). We can apply the Strategy Pattern to encapsulate each payment method into its own strategy class. The context (Checkout) holds a reference to the selected strategy and delegates the payment process to it.

To run the example, you can follow these steps:

1. Clone the repository.

2. Build and run the application.

3. Follow the on-screen instructions to select a payment method and enter the amount.

4. Observe the output to see the payment process using the selected strategy.

## Benefits

The Strategy Pattern offers several benefits, including:

- Improved code maintainability: Each strategy is encapsulated in its own class, making it easier to manage and maintain different variations of the algorithm or behavior.

- Flexibility and extensibility: New strategies can be added without modifying existing code, providing flexibility to add or remove strategies at runtime.

- Improved code reusability: The strategy classes can be reused in different contexts, promoting code reusability.

## When to Use the Strategy Pattern

Consider using the Strategy Pattern in the following scenarios:

- When you have multiple variations of an algorithm or behavior and want to encapsulate each variation into its own class.

- When you need to switch between different variations of an algorithm or behavior dynamically at runtime.

- When you want to avoid code duplication by reusing strategies in different contexts.

## Conclusion

The Strategy Pattern is a powerful design pattern that allows objects to alter their behavior dynamically at runtime by encapsulating different algorithms or behaviors into separate strategy classes. By using this pattern, you can achieve cleaner, more maintainable code that is flexible and extensible.

For more information and examples, please refer to the code in this repository.
