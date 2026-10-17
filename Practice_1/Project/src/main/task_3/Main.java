package task_3;

public class Main {

    /*  Вынес цикл в отдельный метод со static, можно сделать static, 
    потому что методу не нужен объект Main всё с чем он работает приходит через параметры */ 
    public static void printAllFormats(CourseFormatter[] formatters, Course course){
        for(int i = 0; i < formatters.length; i++) {
            System.out.println(formatters[i].format(course));
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Course course = new Course(10, "Java Fundamentals", 32); // 0
        course.completeHours(6);

        System.out.println(course.completedHours());
        System.out.println(course.remainingHours());
        System.out.println(course.isCompleted());

        System.out.println();

        CourseFormatter[] formatters = {new CompactCourseFormatter(), new DetailedCourseFormatter(),
            new NormalCourseFormatter()
        };

        Main.printAllFormats(formatters, course);

    }
}
