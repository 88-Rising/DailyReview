package ThreadTest;
/*
* 线程不安全：取钱
*
* */
public class Unsafe02 {
}
class Account{
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
class Drawing extends Thread{
    Account account;//取钱的账户
    int drawingMoney;//取钱的钱数
    int packetTotal;//取钱的总数

    public Drawing( Account account, int drawingMoney,String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        account.money-=drawingMoney;
        packetTotal+=drawingMoney;
        System.out.println(this.getName()+"-->账户余额："+account.money);
        System.out.println(this.getName()+"-->口袋里的钱："+packetTotal);

    }
}