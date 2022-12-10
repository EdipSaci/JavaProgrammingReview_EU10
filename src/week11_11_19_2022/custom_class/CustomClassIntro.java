package week11_11_19_2022.custom_class;

public class CustomClassIntro {
    public static void main(String[] args) {

        //how to create an object

        // Class name reference = new keyword constructor
        SecondClass secondClass=new SecondClass();
        FirstClass firstObject= new FirstClass(21,"Ret",secondClass);

        //how to get attributes
        System.out.println(firstObject.a);


    }

}
