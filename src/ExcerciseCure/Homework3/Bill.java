package ExcerciseCure.Homework3;

import ExcerciseCure.Homework2.Date;
//Các thuộc tính chung thì xây dựng đối tượng chung
//Các phương thức chung thì xây dụng interface chung
public abstract class Bill {
    private String id;
    private String name;
    //Kiểu đối tượng
    private Date date;

    public abstract void pay();

    public Bill(String id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
