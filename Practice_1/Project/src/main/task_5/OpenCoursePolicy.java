package task_5;

public class OpenCoursePolicy implements CoursePolicy {

    @Override
    public boolean canEnroll(Course course, Student student) {
        return course.isOpen();

    }

}
