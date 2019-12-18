package ExcerciseCure.Homework3;

public class Customer {
    private String type;
    private int number;
    private float unit;
    private int limit;

    public Customer(String type,int number, float unit, int limit) {
        this.number = number;
        this.unit = unit;
        this.limit = limit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getUnit() {
        return unit;
    }

    public void setUnit(float unit) {
        this.unit = unit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
