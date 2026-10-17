package task_1;

public class CompactCourseFormatter implements CourseFormatter {

    @Override
    public String format(Course course){
        
        return "Это курс с номером - " + course.id() + " по предмету " + course.title()
        + ", всего осталось - " + course.remainingHours() + " часов.";
    }
}
