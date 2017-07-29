package today.bybus.atob;

public class App {
    public static void main(String[] args) {
        Человек вильям = new Человек();
        Человек вика = new Человек();

        вильям.наругать();
        String ответ = вильям.скажиКакДела();
        вика.запомни(ответ);
        String секрет = вика.расскажиСекрет();
        System.out.println("Викин секрет: " + секрет);

        вильям.похвалить();
        ответ = вильям.скажиКакДела();
        System.out.println("Вильяма настроение в конце дня: " + ответ);
    }
}
