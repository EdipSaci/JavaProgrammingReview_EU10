package week13_12_03_2022.access_modifiers.pac1;

public class Person {

    public String name; // I can reach this name from everywhere
    String lastName;
    private int id;
    static protected int age;

    public void getid(){
        System.out.println(id);
    }
}