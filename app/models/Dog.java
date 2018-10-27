package models;

public class Dog {
    private int id;
    private String name;
    private int age;
    private boolean biteable;

    public Dog() {
    }

    public Dog(int id, String name, int age, boolean biteable) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.biteable = biteable;
    }

    public Dog(int id, boolean biteable, int age, String name) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.biteable = biteable;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isBiteable() {
        return biteable;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBiteable(boolean biteable) {
        this.biteable = biteable;
    }
}
