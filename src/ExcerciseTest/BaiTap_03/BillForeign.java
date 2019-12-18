package ExcerciseTest.BaiTap_03;

import ExcerciseTest.BaiTap_02.CheckDate;

public class BillForeign extends Bill {
    private int number;
    private float unit;

    public BillForeign(int id, String name, CheckDate date, int number, float unit) {
        super(id, name, date);
        this.number = number;
        this.unit = unit;
    }

    @Override
    public void pay() {
        int sumMoney;
        sumMoney =(int) (this.getNumber() * this.getUnit());
        System.out.println("Tổng tiền hóa đơn của " + super.getName() + " là: " + sumMoney);
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
