package task_5;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {

    private static void printAllId(Identifiable[] entities) {

        for (Identifiable entity : entities) {
            System.out.println(entity.getId());
        }
    }

    private static boolean canEnrollByAll(CoursePolicy[] plcs, Course course, Student student) {
        for (int i = 0; i < plcs.length; i++) {
            if (!plcs[i].canEnroll(course, student)) {
                return false;
            }

        }

        return true;
    }

    private static void outputTime(Clock clock) {
        System.out.println(LocalDateTime.now(clock));
    }

    public static void main(String[] args) {

        Course[] courses = {new Course("Java", true, 1), new Course("Frontend", false, 2),
            new Course("SAOD", true, 3)};

        Student[] students = {new Student("Egor", 15, 1), new Student("Anton", 20, 2)};

        System.out.println("Все id курсов:");
        printAllId(courses);

        System.out.println("\nВсе id студентов:");
        printAllId(students);
        System.out.println();

        CoursePolicy[] plcs = {new AgePolicy(), new OpenCoursePolicy()};

        System.out.println(canEnrollByAll(plcs, courses[0], students[0]));
        System.out.println(canEnrollByAll(plcs, courses[1], students[1]));
        System.out.println(canEnrollByAll(plcs, courses[2], students[1]));

        ActiveFormatter frm_1 = new ActiveFormatter();
        Formatter frm_2 = new ActiveFormatter();

        System.out.println();

        System.out.println(frm_1.format(courses[0]));
        System.out.println(frm_2.format(courses[1]));

        System.out.println();
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

        Instant inst = Instant.parse("2026-10-18T10:00:00Z");

        Clock systemClock = Clock.systemDefaultZone();
        System.out.println(systemClock);

        System.out.println();
        outputTime(systemClock);
        System.out.println();

        Clock fixedClock = Clock.fixed(inst, zone);
        System.out.println(fixedClock);

        System.out.println();
        outputTime(fixedClock);

    }
}
