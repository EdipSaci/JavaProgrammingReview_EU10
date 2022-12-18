package week15_12_17_2022.task2Animal;

public class Bird extends Animal{

    @Override
    public void move() {
        super.move();
        System.out.println(getClass().getSimpleName()+ "s are flying");
    }
}
