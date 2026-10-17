public class Main {
    
    public static void main(String[] args) {

        NotificationSender per_1 = new EmailSender();
        Object j_1 = new Object();
        per_1.send("ggg");  // Наследник_Email [строка]: привет!
        per_1.send(j_1);          // Наследник_Email [объект]: привет!

        System.out.println("\n-----------------------");
        NotificationSender per_2 = new ConsoleSender();
        Object j_2 = new Object();
        per_2.send("ПППП"); // Родитель [строка]: привет!
        per_2.send(j_2);          //Наследник_Console [объект]: привет!

        System.out.println("\n-----------------------");
        EmailSender per_3 = new EmailSender();
        Object j_3 = new Object();
        per_3.send("fff");  // Наследник_Email [строка]: привет!
        per_3.send(j_3);           // Наследник_Email [объект]: привет!

        System.out.println("\n-----------------------");
        ConsoleSender per_4 = new ConsoleSender();
        Object j_4 = new Object(); 
        per_4.send("fgg"); // Родитель [строка]: привет!
        per_4.send(j_4); // Наследник_Console [объект]: привет!

        System.out.println("\n-----------------------");
        EmailSender per_5 = new EmailSender();
        per_5.prnt(); // Это не вызвать с Родителя


        /* Вот эту часть кода не получится выполнить, т.к. тип переменной (NotificationSender)
        НЕ позволяет выполнить метод prnt() ведь в классе NotificationSender такого метода нет*/

        // System.out.println("\n-----------------------");
        // NotificationSender per_6 = new EmailSender();
        // per_6.prnt();

        System.out.println("\n-----------------------");
        NotificationSender per_6 = new EmailSender();
        Object j_5 = "String_1";
        per_6.send(j_5); // Наследник_Email [объект]: привет!

        System.out.println("\n-----------------------");
        NotificationSender per_7 = new ConsoleSender();
        Object j_6 = "String_2";
        per_7.send(j_6); // Наследник_Console [объект]: привет!

        System.out.println("\n-----------------------");
        NotificationSender per_8 = new EmailSender();
        Object j_7 = "String_1";
        per_8.send((String) j_7); // Наследник_Email [строка]: привет!

        System.out.println("\n-----------------------");
        NotificationSender per_9 = new ConsoleSender();
        Object j_8 = "String_2";
        per_9.send((String) j_8); // Родитель [строка]: привет!

    }
}
