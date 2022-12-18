package week15_12_17_2022.task1Bank;

public class Bank {
    private int capital=10000;


    public int getCapital(){
        return capital;
    }

    //How we can get the class name? -->  getClass().getSimpleName()
    public void calculateTheInterest(){
        System.out.println("Interest of the "+ getClass().getSimpleName());
    }

}
/*
Task 1:

Create a Bank class which has a functionality( calculateRateOfInterest(int capital)) that calculates the rate of interest.
However, the rate of interest varies according to banks.

class GarantiBank ----> 8%
class AkBank      ----> 7%
class INGBank     ----> 9%

rate of interest
 */