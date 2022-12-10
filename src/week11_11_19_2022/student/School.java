package week11_11_19_2022.student;

import java.time.LocalDate;
import java.util.ArrayList;

public class School {
    public static void main(String[] args) {
       ArrayList<Student> students=new ArrayList<>();
       Student student1= new Student("Recep",'M','A', LocalDate.of(2000,1,7),123);
       Student student2= new Student("Osman",'M','B', LocalDate.of(2001,7,12),124);
       Student student3= new Student("Yeliz",'F','C', LocalDate.of(2003,5,4),125);
       Student student4= new Student("Zehra",'F','A', LocalDate.of(2003,5,4),125);
       Student student5= new Student("Aygun",'F','F', LocalDate.of(2003,5,4),125);

       students.add(student1);
       students.add(student2);
       students.add(student3);
       students.add(student4);
       students.add(student5);

       ArrayList<Student> result = getStudentsNameStartsWithA(students);
        System.out.println(result);
    }

    public static ArrayList<Student> getStudentsNameStartsWithA(ArrayList<Student> students) {
        ArrayList<Student> result = new ArrayList<>();

        for (Student each : students) {
            if (each.name.startsWith("A")){
                result.add(each);
            }
        }
        return result;
    }
}
/*
2. create a class which is School with main method

3. create a list of student in School class

4. create a method in School class which is getting list of students as parameter the return the list of students if the name start with "A"
 */