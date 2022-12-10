package week13_12_03_2022.encapsulation;

public class Teacher {

    private String name;
    private int id;

    public Teacher(String name, int id) {
       setName(name);
       setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("xxxx")){
            System.out.println("You can not use it");
        }else this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<0){
            System.out.println("You can not use it");
        }else this.id = id;
        this.id = id;
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
