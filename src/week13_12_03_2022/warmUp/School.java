package week13_12_03_2022.warmUp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
/*
 2. create a class which is School with main method

    3. create a list of teacher in School class inside the STATIC BLOCK

    4. create a method in School class which is returning the list of teachers if the last name start with "M"

    5. create a method in School class then you will find the female teachers

    6. create a method in School class then find the teachers age smaller than 30

    7. create a method in School class then find the teachers born in 1967 year
 */

    static ArrayList<Teacher> teachers = new ArrayList<>();// this is now global. for reach  inside the another block

    static {

        Teacher teacher1 = new Teacher("Muhtar", "Abc", 'M', LocalDate.of(1985, 8, 5), 123);
        Teacher teacher2 = new Teacher("Adam", "Yak", 'M', LocalDate.of(1980, 9, 2), 124);
        Teacher teacher3 = new Teacher("Aysun", "Erol", 'M', LocalDate.of(1985, 3, 29), 124);
        Teacher teacher4 = new Teacher("Mike", "Ta", 'F', LocalDate.of(1975, 12, 30), 124);
        Teacher teacher5 = new Teacher("Sasha", "Gel", 'M', LocalDate.of(1989, 2, 25), 124);
        Teacher teacher6 = new Teacher("Aaron", "Mak", 'M', LocalDate.of(1987, 8, 8), 124);
        teachers.addAll(Arrays.asList(teacher1, teacher2, teacher3, teacher4, teacher5, teacher6));
    }

    public static void main(String[] args) {
        System.out.println(teachers);
        ArrayList<Teacher> result = getTeacherNameStartWith("Mi");
        System.out.println(result);
        ArrayList<Teacher>female=getTeachersByGender('F');
        System.out.println(female);

        ArrayList<Teacher> smaller30 =getSmallerThan30();
        System.out.println(smaller30);
    }

    private static ArrayList<Teacher> getTeachersByGender(char gender) {
        ArrayList<Teacher> result=new ArrayList<>();

        for (Teacher each : teachers) {
            if (each.gender==gender)
                result.add(each);
        }
        return result;
    }


    private static ArrayList<Teacher> getSmallerThan30(){
        ArrayList<Teacher> result=new ArrayList<>();
        for (Teacher each : teachers) {
            if (each.age<30)
                result.add(each);
        }
        return result;
    }

    private static ArrayList<Teacher> getTeacherNameStartWith(String prefix) {
        ArrayList<Teacher> result = new ArrayList<>();

        //I need to get teacher one by one
        for (Teacher each : teachers) {

            //I need to check the name if the name is starting with "M"

            if (each.name.startsWith("Mi"))
                //I will put inside result
                result.add(each);
        }

        return result;
    }
}
