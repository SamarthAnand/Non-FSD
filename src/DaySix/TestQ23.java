package DaySix;

public class TestQ23 {

    Q23 c1 = new Q23(0);
    public void addToBank(int amount){
        c1.setTotalAmount(c1.getTotalAmount()+amount);
        System.out.println("After adding Rs. "+amount+" your final balance is : "+(c1.getTotalAmount()));
    }
    public void withdrawFromBank(int amount){
        c1.setTotalAmount(c1.getTotalAmount()-amount);
        System.out.println("After withdrawing Rs. "+amount+" your final balance is : "+(c1.getTotalAmount()));
    }
    public void displayBalance(){
        System.out.println("Your current balance is  : "+c1.getTotalAmount());

    }
    public static void main(String[] args) {


       // Q23 privateConstructor = new Q23(10,20);

        TestQ23 cust = new TestQ23();
        cust.displayBalance();
        cust.addToBank(100);
        cust.withdrawFromBank(10);
        cust.addToBank(1000);
    }

}
