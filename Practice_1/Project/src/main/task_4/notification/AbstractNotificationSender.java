package task_4.notification;

public abstract class AbstractNotificationSender {
    
    /* Публичный алгоритм делаем final, 
    чтобы потомки не смогли переопределить этот метод и не избежали проверки email и text */
    public final void send(String email, String text){
        if(email == null || email.isBlank() || text == null || text.isBlank()){
            System.out.println("Не выбран адресат!\nИЛИ\nТекст пустой\n");
            return;
        }

        System.out.println("Привет, это абстракция!");

        /* Это точка расширения, 
        именно этот метод дальше реализуют остальные классы */
        doSend(email, text);
        System.out.println();
        
    }

    protected abstract void doSend(String email, String text);

}
