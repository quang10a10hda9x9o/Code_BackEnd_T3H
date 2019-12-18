package ExcerciseTest.BaiTap_03;

import ExcerciseTest.BaiTap_02.CheckDate;

public class BillVietNam extends Bill {
    private Customer customer;

    @Override
    public void pay(){
        float sumMoney;
        if(this.getCustomer().getNumber() > this.getCustomer().getLimit()) {
            sumMoney =(int) (this.getCustomer().getNumber() * this.getCustomer().getUnit()
                    + (this.getCustomer().getNumber() - this.getCustomer().getLimit())*this.getCustomer().getUnit()*2.5);
            System.out.println("Tổng tiền hóa đơn của " + super.getName() + " là: " + sumMoney);
        }
    }

    public BillVietNam(int id, String name, CheckDate date, Customer customer) {
        super(id, name, date);
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
