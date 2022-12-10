package week12_11_26_2022;


class  Student {
    /*
  instance variables:
                  name, age, batchNumber

          static variables :
                  school
   */
    public String name ;
    public  int age;
    public  long batchNumber;

    public static String school="Cydeo";

    //1st constructor: initializes the name ONLY
    public Student(String name){
        this.name=name;
    }

    // 2nd constructor: initializes name & age
    //                        (MUST use constructor call to set the name)


    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    // 3rd Constructor: initializes name, age ,batchNumber
    //                        (MUST use constructor call to set the name & age)
    public Student(String name, int age, long batchNumber) {
        this(name,age);
        this.batchNumber = batchNumber;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", school=" + school +
                '}';
    }
}


public class StudentObject {
    public static void main(String[] args) {

        week12_11_26_2022.student.Student student1=new week12_11_26_2022.student.Student("Adam");
        System.out.println(student1);
        student1.age=25;
        student1.batchNumber=2322;

        week12_11_26_2022.student.Student student2=new week12_11_26_2022.student.Student("Edip",30);

    }
}
