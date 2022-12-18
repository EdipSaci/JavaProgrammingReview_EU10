package week15_12_17_2022.task1Bank;

public class GarantiBank extends Bank {

    @Override
    public void calculateTheInterest() {
        super.calculateTheInterest();
        System.out.println((getCapital() * 8 / 100));
    }
}
