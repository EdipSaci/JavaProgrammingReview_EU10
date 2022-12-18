package week15_12_17_2022.task2Animal;

public class Cow extends Animal{
    @Override
    public void move() {
        super.move();
        System.out.println("Cows are walking");
    }
}
