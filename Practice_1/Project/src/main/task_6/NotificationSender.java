package task_6;

public class NotificationSender {

    public void send_1(String str_1) {
        System.out.println("Родитель [строка]: привет!");
    }

    public void send_2(Object obj_1) {
        System.out.println("Родитель [объект]: привет!");
    }

    public void send_3(Object obj_1) {
        System.out.println("Родитель [объект]: send_3 вызвался у РОДИТЕЛЯ");
    }

    private void sn() {
        System.out.println("Родитель: Всем привет!");
    }

    protected void sg() {
        System.out.println("Родитель: Всем пока!");
    }

}
