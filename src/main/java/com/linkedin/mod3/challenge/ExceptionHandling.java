package com.linkedin.mod3.challenge;

import java.sql.SQLException;

public class ExceptionHandling {
    // The following code uses a general exception handler instead of specific handlers
    // for each exception. It also swallows exceptions without logging them.
    // Identify the problem areas and make the improvements.
    private SolidPrinciples solidPrinciples;

    public ExceptionHandling(SolidPrinciples solidPrinciples) {
        this.solidPrinciples = solidPrinciples;
    }

    public void doSomething() throws SQLException {
        try {
            solidPrinciples.doSomethingA();
            solidPrinciples.doSomethingB();
            solidPrinciples.doSomethingC();

            RemovingDeadCode removingDeadCode = new RemovingDeadCode("InitialName");
            removingDeadCode.setName("Test");
            String name = removingDeadCode.getName();

        } catch (Exception e) {
           System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
