package ExcerciseTest.BaiTap_03;

import ExcerciseTest.BaiTap_02.CheckDate;

public abstract class Bill {
    private int id;
    private String name;
    private CheckDate date;

    public abstract void pay();

    public Bill(int id, String name, CheckDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckDate getDate() {
        return date;
    }

    public void setDate(CheckDate date) {
        this.date = date;
    }
}
