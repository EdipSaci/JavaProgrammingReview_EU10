package week15_12_17_2022.task3Salary;

public class Manager extends Employee{

    @Override
    public int salary() {
        // I am getting the  base salary from parent class
        return super.salary()+ 20000;
    }
}
