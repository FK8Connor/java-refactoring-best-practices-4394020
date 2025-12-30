package com.linkedin.mod3.challenge;

public class SolidPrinciples {
    // The following code violates the Single Responsibility Principle
    // by doing too much in a single method.
    // Identify the problem and make the improvements.
    public void doSomethingA() {
        // some code that does A
        // some code that does B
        // some code that does C
    }

    public void doSomethingB() {
            // some code that does B
    }

    public void doSomethingC () {
            // some code that does C
    }
}
