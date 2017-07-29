package today.bybus.atob;

public class Человек {
    private String секрет;
    private String настроение;

    public void поспать() {
        System.out.println("сплю ...");
        настроение = "хорошее";
    }

    public String скажиКакДела() {
        return настроение;
    }

    public void похвалить() {
        настроение = "хорошее";
    }

    public void наругать() {
        настроение = "плохое";
    }

    public void запомни(String чтоЗапомнить) {
        секрет = чтоЗапомнить;
    }

    public String расскажиСекрет() {
        return секрет;
    }
}
