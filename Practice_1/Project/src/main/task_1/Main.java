public class Main {


    public static void main(String[] args) {
        Course course = new Course(10, "Java Fundamentals", 32); // 0
        course.completeHours(6);

        System.out.println(course.completedHours());
        System.out.println(course.remainingHours());
        System.out.println(course.isCompleted());

        System.out.println();

        CourseFormatter formatter = new CompactCourseFormatter();
        System.out.println(formatter.format(course));

        System.out.println();

        formatter = new DetailedCourseFormatter();
        System.out.println(formatter.format(course));


    }
}
