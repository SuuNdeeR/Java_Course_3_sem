package task_5;

public class ActiveFormatter implements Formatter {

    @Override
    public String format(Course course) {
        return "Это курс с названием " + course.getTitle()
                + ", имеет вот такой ID - " + course.getId() + ". На данный курс в текущий момент записаться - "
                + (course.isOpen() ? ("Можно.") : ("Нельзя."));
    }
}
