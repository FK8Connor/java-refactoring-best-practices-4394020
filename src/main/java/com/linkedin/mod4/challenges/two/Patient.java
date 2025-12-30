package com.linkedin.mod4.challenges.two;

// We have a legacy healthcare application with a Patient class
// that uses primitive data types to represent patient information.
// Refactor the class to use objects instead of primitives.
// You can create a separate object for Name, Demographics, BloodType,
// and ContactInfo.

public class Patient {

    private Name firstName;
    private Name lastName;
    private Demographics age;
    private Demographics gender;
    private Demographics bloodType;
    private ContactInfo address;
    private ContactInfo phoneNumber;
}

