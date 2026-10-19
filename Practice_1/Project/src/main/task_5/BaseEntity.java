package task_5;

public abstract class BaseEntity implements Identifiable {

    private int id;

    public BaseEntity(int id) {
        if (id < 0) {
            return;
        }
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

}
