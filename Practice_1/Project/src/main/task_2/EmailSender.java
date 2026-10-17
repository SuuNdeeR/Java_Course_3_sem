public class EmailSender extends NotificationSender {
    
    @Override
    public void send(String str_1){
        System.out.println("Наследник_Email [строка]: привет!");
    }

    @Override
    public void send(Object obj_1){
        System.out.println("Наследник_Email [объект]: привет!");
    }

    public void prnt(){
        System.out.println("Это не вызвать с Родителя");
    }

}
