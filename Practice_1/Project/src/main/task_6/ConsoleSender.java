package task_6;

public class ConsoleSender extends NotificationSender {

    public void send_1(int int_1) {
        System.out.println("Наследник_Console [" + int_1 + "]: привет!");
    }

    public void send_1(int int_1, int int_2) {
        System.out.println("Наследник_Console[" + int_1 + " " + int_2 + "]: привет!");
    }

    /* Данный метод нельзя переопределить так как параметры не совпадают с теми, которые у родителя,
    без @Override это скомпилировалось бы как перегрузка, с @Override будет ошибка */

    // @Override
    // public void send_1(long long_1) {
    //     System.out.println("Наследник_Console [Long]: привет!");
    // }

    /* Исправление для обоих случаев (и для long, и для String с возвращаемым типом String):
    параметр String и возвращаемый тип void как у родителя, тогда @Override не ругается */

    @Override
    public void send_1(String str_1) {
        System.out.println("Наследник_Console [String]: Аннотация НАПИСАНА");
    }


    /* Метод send_1(String) в классе ConsoleSender не может переопределить метод send_1(String) 
    в классе NotificationSender:
    тип возвращаемого значения String несовместим с void */

    // @Override
    // public String send_1(String str_1) {
    //     return "Наследник_Console [String]: привет!";
    // }
    
    @Override
    public void send_2(Object obj_1) {
        System.out.println("Наследник_Console [Object]: Аннотация НАПИСАНА");
    }

}
