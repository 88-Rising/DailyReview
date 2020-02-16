package ThreadTest;


/*
 * 线程不安全：取钱
 *
 * */
public class Unsafe01 {
    public static void main(String[] args) {
        Account account=new Account(1000,"结婚礼金");
        Drawing you =new Drawing(account, 80,"可悲的你");
        Drawing wife =new Drawing(account,90,"可悲的你");
        you.start();
        wife.start();

    }
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
        test();

    }
    /*
    * 同步代码块 synchronized(obj){}  obj称为同步监视器
    *
    * */
    public  void test() {
        if(account.money<=0){//提高性能
            return;
        }
        synchronized (account) {
            if (account.money - drawingMoney < 0) {
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.money -= drawingMoney;
            packetTotal += drawingMoney;
            System.out.println(this.getName() + "-->账户余额：" + account.money);
            System.out.println(this.getName() + "-->口袋里的钱：" + packetTotal);
        }
    }
}