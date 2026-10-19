package task_5;

public class AgePolicy implements CoursePolicy {

    @Override
    public boolean canEnroll(Course course, Student student) {
        return student.getAge() >= 16 && student.getAge() <= 30;

    }
}
