package edu.mylearning.java.clean.code.solid;

/**
 * Single Responsibility Principle (SRP) - Each class should have one and only one reason to change, meaning that a class should only have one job.
 * SRP: Each operation class (e.g., Addition, Subtraction) has a single responsibility.
 * Open/Closed Principle (OCP) - Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
 * OCP: The Calculator class can work with any new operation that implements the Operation interface without modification.
 * Liskov Substitution Principle (LSP) - Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.
 * LSP: Any class that implements the Operation interface can be substituted without affecting the correctness.
 * Interface Segregation Principle (ISP) - Clients should not be forced to depend upon interfaces that they do not use.
 * ISP: The Operation interface is minimal, providing only the necessary execute method.
 * Dependency Inversion Principle (DIP) - High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces). Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.
 * DIP: The Calculator class depends on the Operation interface (an abstraction) rather than concrete classes, allowing easy swapping of implementations.
 */
public class SolidPrinciple {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation(new Addition());
        System.out.println(calculator.calculate(10, 20));
        calculator.setOperation(new Subtraction());
        System.out.println(calculator.calculate(10, 20));
    }
}

// Operation interface adhering to the OCP and ISP principles
interface Operation {
    double execute(double firstNumber, double secondNumber);
}

// Concrete implementations for each operation adhering to the SRP principle
class Addition implements Operation {

    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}

class Subtraction implements Operation {

    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}

// Calculator class adhering to the DIP principle
class Calculator {
    private Operation operation;

    // Constructor injection for dependency inversion
    public void setOperation(Operation operation){
        this.operation = operation;
    }

    public double calculate(double firstNumber, double secondNumber){
        return operation.execute(firstNumber, secondNumber);
    }
}
