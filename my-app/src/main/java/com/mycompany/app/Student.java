package com.mycompany.app;

public class Student {

    private int age = 24;
    private String name = "Peter";

    public void setMatricutionNumber(String matricultionNumber) {
        this.matricultionNumber = matricultionNumber;
    }

    private String matricultionNumber = "212727";

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public String getMatriculationNumber() {
        return matricultionNumber;
    }


    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    private void giveName() {
    }

    public boolean giveName(String name) {

        return false;
    }

    public boolean giveAge(int age) {

        return false;
    }

}
