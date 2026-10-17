package task_3;

public class DetailedCourseFormatter implements CourseFormatter {
    
    @Override
    public String format(Course course){
        
        return "Это курс с номером - " + course.id() + " по предмету " + course.title() + ".\n"
        + "Всего курс идёт - " + course.durationHours() + " часов.\n" +
        "Завершено всего - " + course.completedHours() + " часов.\n" +
        "Осталось часов - " + course.remainingHours() + ".\n" +
        "Статус курса - " + (course.isCompleted() ? "Курс завершён!" : "Курс ещё не завершён!");
    }
}
