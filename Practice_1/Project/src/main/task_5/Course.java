package task_5;

public class Course extends BaseEntity {

    private String title;
    private boolean open;

    public Course(String title, boolean open, int id) {
        super(id);
        this.title = title;
        this.open = open;
    }

    public String getTitle() {
        return title;
    }

    public boolean isOpen() {
        return open;
    }

}
