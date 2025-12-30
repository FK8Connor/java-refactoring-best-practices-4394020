package com.linkedin.mod4.challenges.one;

// It is part of a fictional legacy e-commerce application with a
// CheckoutController class that has a method processOrder that
// handles the checkout process, including calculating the total
// amount, applying discounts, and processing the payment.
// The method has grown too large and contains too much functionality.
// Refactor the method to make it more concise and easier to maintain.
// The actual implementation is left out for simplicity.
// The solution can also just contain comments in the extracted methods.

import com.linkedin.mod4.challenges.Order;

public class CheckoutController {

    public void processOrder(Order order) {
       double totalAmount = calculateTotalAmnt(order);
       double discountedAmount = applyDiscounts((int) totalAmount);
       processPayment(order, discountedAmount);
       sendConfirmationEmail(order);
       updateInventory(order);
       updateOrderStatus(order);

    }

    private int calculateTotalAmnt(Order amount) {
        // logic to calculate total amount
        int total = 0;
        return total;
    }

    private int applyDiscounts(int totalAmount) {
        // logic to apply discounts
        totalAmount = totalAmount - 20; // example discount
        return totalAmount;
    }

    private void processPayment(Order order, double amount) {
        // logic to process payment
    }

    private void sendConfirmationEmail(Order order) {
        // logic to send confirmation email
    }

    private void updateInventory(Order order) {
        // logic to update inventory
    }

    private void updateOrderStatus(Order order) {
        // logic to update order status
    }
}

