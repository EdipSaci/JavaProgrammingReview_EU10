package week07_10_22_2022;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println("outer loop" + i +" inner loop: "+ j);
            }
        }

    }
}
