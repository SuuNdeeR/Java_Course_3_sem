public class NormalCourseFormatter implements CourseFormatter {
    
    @Override 
    public String format(Course course){
        return "Это вот такой курс короче говоря с номером - " + course.id() + " по кайфовому предмету " + course.title()
        + ", всего-то ещё осталось - " + course.remainingHours() + " часов.";
    }
}
