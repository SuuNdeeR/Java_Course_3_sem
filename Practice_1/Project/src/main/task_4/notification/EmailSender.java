package task_4.notification;

public class EmailSender extends AbstractNotificationSender {
    
    // Переопределить основной метод Send не получится 
    // у наследников, так как он имеет модификатор final
    
    /* @Override 
    public void Send(String email, String text){

        System.out.println("Привет, это НЕЕЕ абстракция!");
        System.out.println();
        
    } */


    @Override
    protected void doSend(String email, String text){
        System.out.println("[Email]: Адрес: " + email + "\nСообщение: " + text);
    }

}
