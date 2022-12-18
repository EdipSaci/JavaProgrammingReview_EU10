package week15_12_17_2022.task2Animal;

public class Fish extends Animal{
    @Override
    public void move() {
        super.move();
        System.out.println(getClass().getSimpleName()+" are swimming");
    }
}
