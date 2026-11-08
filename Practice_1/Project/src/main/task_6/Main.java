package task_6;

public class Main {

    public static void main(String[] args) {

        NotificationSender per_email = new EmailSender();
        NotificationSender per_console = new ConsoleSender();
        NotificationSender per_notificationsender = new NotificationSender();

        per_notificationsender.sg(); // Родитель: Всем пока!
        per_email.sg(); // Наследник_Email: Всем пока!

        System.out.println("\n-----------------------");
        Object b_1 = new Object();
        per_email.send_2(b_1); // Наследник_Email [Object]: привет! (без @Override, но переопределился)

        per_console.send_1("Xdx"); // Наследник_Console [String]: Аннотация НАПИСАНА

        System.out.println("\n-----------------------");

        /* Без @Override всё скомпилировалось, но вызвался НЕ ТОТ метод.
        Хотели чтобы вызвался send_3 у EmailSender, а вызвался у родителя,
        т.к. компилятор смотрит на тип переменной NotificationSender, там есть только send_3(Object),
        а в EmailSender send_3(Object) не переопределён, там send_3(String) - это другой метод */

        per_email.send_3("Xdx"); // Родитель [объект]: send_3 вызвался у РОДИТЕЛЯ

        /* Если тип переменной сделать EmailSender, то компилятор уже видит send_3(String)
        и вызовется метод наследника, то есть результат зависит от типа переменной, так быть не должно */

        EmailSender per_email_2 = new EmailSender();
        per_email_2.send_3("Xdx"); // Наследник_Email [String]: send_3 вызвался у НАСЛЕДНИКА

        System.out.println("\n-----------------------");
        per_email_2.sn(); // Наследник_Email: Всем привет! (это НОВЫЙ метод, а не переопределение)

        /* Это не выполниться, так как тип переменной является NotificationSender 
        хоть объект и EmailSender, но возможно ли вызвать метод компилятор javac решает по типу переменной 
        в NotificationSender такого метода нет */

        // per_email.prnt();

        /* Тот же самый пример сверху, то есть в NotificationSender 
        таких методов нет, получается и вызвать их нельзя */

        // per_console.send_1(100);
        // per_console.send_1(100, 200);
    }
}
