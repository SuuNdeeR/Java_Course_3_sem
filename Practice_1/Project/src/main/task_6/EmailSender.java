package task_6;

public class EmailSender extends NotificationSender {

    @Override
    public void send_1(String str_1) {
        System.out.println("Наследник_Email [String]: привет!");
    }

    /* Тут @Override нет, но сигнатура совпадает с родителем полностью,
    поэтому это всё равно переопределение и вызовется метод наследника,
    аннотация на вызов никак не влияет, она только проверяет */

    public void send_2(Object obj_1) {
        System.out.println("Наследник_Email [Object]: привет! (без @Override, но переопределился)");
    }

    /* А вот тут хотели переопределить send_3(Object) у родителя, но ошиблись и написали String,
    @Override не написали, поэтому компилятор молчит и всё компилируется,
    но это получилась ПЕРЕГРУЗКА, а не переопределение, т.к. параметры другие.
    Через переменную типа NotificationSender этот метод никогда не вызовется,
    вызовется send_3(Object) у родителя */

    public void send_3(String str_1) {
        System.out.println("Наследник_Email [String]: send_3 вызвался у НАСЛЕДНИКА");
    }

    /* Если бы написали @Override, то была бы ошибка компиляции:
    метод не переопределяет и не реализует метод из супертипа, и ошибку сразу бы увидели */

    // @Override
    // public void send_3(String str_1) {
    //     System.out.println("Наследник_Email [String]: send_3 вызвался у НАСЛЕДНИКА");
    // }

    /* Метод send_2(Object) в классе EmailSender не может переопределить метод send_2(Object) 
    в классе NotificationSender:
    попытка назначить более ограниченные права доступа (было public) */

    // @Override
    // protected/private void send_2(Object obj_1) {
    //     System.out.println("Наследник_Email [объект]: привет!");
    // }

    /* Метод переопределить не получится, так как изначальный метод у 
    родителя имеет модификатор доступа private */

    // @Override
    // public void sn() {
    //     System.out.println("Наследник_Email: Всем привет");
    // }

    /* sg() в EmailSender не может переопределить sg() в NotificationSender 
    попытка назначить более слабые права доступа; был protected 
    можно сделать его только более доступным */

    // @Override
    // private void sg() {
    //     System.out.println("Наследник_Email: Всем привет");
    // }

    /* Оставляем protected как у родителя или делаем public,
    сужать нельзя, а расширять можно */

    @Override
    public void sg() {
        System.out.println("Наследник_Email: Всем пока!");
    }

    /* У родителя он private, значит наследнику он не виден вообще,
    переопределять нечего, можно только убрать @Override и тогда это просто новый метод наследника */

    public void sn() {
        System.out.println("Наследник_Email: Всем привет! (это НОВЫЙ метод, а не переопределение)");
    }

    private void prnt() {
        System.out.println("Это не вызвать с Родителя");
    }

}
