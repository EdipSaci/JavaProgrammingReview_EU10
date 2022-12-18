package week15_12_17_2022.task1Bank;

public class INGBank extends Bank{
    @Override
    public void calculateTheInterest() {
        System.out.println(getCapital()*9/100);
    }
}
