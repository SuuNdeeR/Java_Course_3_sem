package task_5;

public class Student extends BaseEntity {

    private String name;
    private int age;

    public Student(String name, int age, int id) {
        super(id);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
