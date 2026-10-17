package task_4.notification;

public class ConsoleSender extends AbstractNotificationSender{
    
    @Override 
    protected void doSend(String email, String text){
        System.out.println("[Console]: Адрес: " + email + "\nСообщение: " + text);
    }
}
