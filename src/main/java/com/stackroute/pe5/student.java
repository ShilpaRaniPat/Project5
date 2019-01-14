package com.stackroute.pe5;

public class student {

    private String name;
    private String ID;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public student(String Name, String ID, int age){

        this.name=Name;
        this.ID=ID;
        this.age=age;
    }

}
