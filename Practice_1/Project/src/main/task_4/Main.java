package task_4;
import task_4.notification.*;

public class Main {
    
    public static void main(String[] args){

        AbstractNotificationSender per_1 = new ConsoleSender();
        AbstractNotificationSender per_2 = new EmailSender();

        per_1.send("Egor", "Привет, друг!");
        per_2.send("Anton", "Привет, дорогой друг!");
        per_2.send("", "Привет, дорогой друг!");
        per_2.send("Anton", "");
        per_1.send("", "");

        /*  Из-за модификатора доступа protected у методов мы как раз не может вызвать метод doSend
        напрямую, в обходов проверки из Send, но чтобы protected работал, 
        нужно их закинуть в другой пакет */

        // per_1.doSend("Egor", "Как дела?");

        /* Создать ОБЪЕКТ абстрактного класса невозможно */
        // AbstractNotificationSender per_3 = new AbstractNotificationSender();


    }
}
