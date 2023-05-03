package DaySix;

public class Q23 {

    double totalAmount;
    double addAmount;
    double withdrawAmount;
    public Q23(){

    }
    public Q23(int a, int b){
        System.out.println("Private Constructors");

    }
    public Q23(int totalAmount){
        System.out.println("Current amount is "+totalAmount);
    }
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getAddAmount() {
        return addAmount;
    }

    public void setAddAmount(double addAmount) {
        this.addAmount = addAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }



}
