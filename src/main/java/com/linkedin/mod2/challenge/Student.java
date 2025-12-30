package com.linkedin.mod2.challenge;

public class Student {
    private String name;
    private int age;
    private double[] grades;

    public Student (String name, int age, double[] nrs) {
        this.name = name;
        this.age = age;
        this.grades = nrs;
    }

    public double calculateGpa() {
       double average = calculateAverageGrade();
        if (average >= 90) {
            return 4.0;
        } else if (average >= 80) {
            return 3.0;
        } else if (average >= 70) {
            return 2.0;
        } else if (average >= 60){
            return 1.0;
        } else {
            return 0.0;
        }
    }

    private double calculateAverageGrade() {
        if (grades.length == 0) {
            throw new IllegalStateException("No grades available to calculate average.");
        }
            double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getNrs() {
        return grades;
    }

    public void setNrs(double[] nrs) {
        this.grades = nrs;
    }


}

