package ExcerciseCure.Homework3;

import ExcerciseCure.Homework2.Date;

public class BillVietNam extends Bill {
    private Customer customer;

    public BillVietNam(String id, String name, Date date,Customer customer) {
        super(id,name,date);
        this.customer = customer;
    }

    @Override
    public void pay() {
        //builder:
        //this gọi đến chính nó, super gọi đến thằng cha
        float sumMoney;
        if(this.getCustomer().getNumber() < this.getCustomer().getLimit()) {
            sumMoney = this.getCustomer().getNumber() * this.getCustomer().getUnit();
            System.out.println("Số tiền điện của khách hàng " + super.getName() + " là: " + sumMoney);
        } else {
            sumMoney = (float) (this.getCustomer().getNumber() * this.getCustomer().getUnit()
                                + (this.getCustomer().getNumber()-this.getCustomer().getLimit())*this.getCustomer().getUnit() * 2.5);
            System.out.println("Số tiền điện của khách hàng " + super.getName() + " là: " + sumMoney);
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
