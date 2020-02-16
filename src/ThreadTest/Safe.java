package ThreadTest;
/*
* 线程安全：在并发的时候保证数据的正确性 效率尽可能高
* synchroized
* 1.同步方法
* 2.同步代码块
* */

public class Safe {
    public static void main(String[] args) {
        safeWeb12306 web=new safeWeb12306();

        new Thread(web,"码农").start();
        new Thread(web,"码畜").start();
        new Thread(web,"码蝗").start();

    }
    public static class safeWeb12306 implements Runnable{
        private int ticketNums=99;
        private boolean flag=true;
        @Override
        public void run() {
            while(flag){
                test();
            }
        }
        public synchronized  void test(){//看似锁的时方法 实则锁的时Web对象
            if(ticketNums<=0){
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