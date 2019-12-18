package ExcerciseCure.Homework3;

import ExcerciseCure.Homework2.Date;

public class Billforeign extends Bill {
    private String national;
    private int number;
    private float unit;

    public Billforeign(String id, String name, Date date, String national, int number, float unit) {
        super(id,name,date);
        this.national = national;
        this.number = number;
        this.unit = unit;
    }

    @Override
    public void pay() {
        float sumMoney = this.getNumber() * this.getUnit();
        System.out.println("Số tiền điện của khách hàng " + super.getName() + " là: " + sumMoney);
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
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
}
