public class ConsoleSender extends NotificationSender {

    @Override
    public void send(Object obj_1){
        System.out.println("Наследник_Console [объект]: привет!");
    }
}
