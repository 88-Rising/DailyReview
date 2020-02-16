package ThreadTest;
/*
* 线程不安全 出现相同的情况 还有负数
*
* */
public class UnSafe {
    public static void main(String[] args) {
        UnsafeWeb12306 web=new UnsafeWeb12306();

        new Thread(web,"码农").start();
        new Thread(web,"码畜").start();
        new Thread(web,"码蝗").start();

    }
    public static class UnsafeWeb12306 implements Runnable{
        private int ticketNums=99;
        private boolean flag=true;
        @Override
        public void run() {
            while(flag){
                test();
            }
        }
        public void test(){
            if(ticketNums<0){
                flag=false;
                return;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
        }
    }
}
