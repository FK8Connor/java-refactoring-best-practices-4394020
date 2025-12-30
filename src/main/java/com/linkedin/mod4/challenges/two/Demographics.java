package com.linkedin.mod4.challenges.two;

public class Demographics {

    private int age;
    private String gender;
    private String bloodType;

    public Demographics(int age, String gender, String bloodType) {
        this.age = age;
        this.gender = gender;
        this.bloodType = bloodType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodType(){
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
