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
       int totalAmount = calculateTotalAmnt(500);
       applyDiscounts(totalAmount);
       processPayment();
       sendConfirmationEmail();
       updateInventory();
       updateOrderStatus();

        // apply any discounts
        // process the payment
        // send confirmation emails
        // update the inventory
        // update the order status
    }

    private int calculateTotalAmnt(int amount) {
        int tax = amount * 10 / 100;
        int shipping = 5;
        int total = amount + tax + shipping;
        return total;
    }

    private int applyDiscounts(int totalAmount) {
        // logic to apply discounts
        totalAmount = totalAmount - 20; // example discount
        return totalAmount;
    }

    private void processPayment() {
        // logic to process payment
    }

    private void sendConfirmationEmail() {
        // logic to send confirmation email
    }

    private void updateInventory() {
        // logic to update inventory
    }

    private void updateOrderStatus() {
        // logic to update order status
    }
}

