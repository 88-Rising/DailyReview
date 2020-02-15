package ThreadTest;

/*
 * 创建线程的方法一
 * 1.创建：实现Runnable+重写run
 * 2.启动：创建实现类对象+Thread对象+start
 * *  * */
public class StartRun implements Runnable {
    /*
     *线程入口点
     */
    @Override
    public void run() {

        for(int i=0;i<20;i++){
            System.out.println("一边学习");

        }
    }

    public static void main(String[] args) {
        StartRun sr=new StartRun();
        Thread t=new Thread(sr);
        t.start();

        for(int i=0;i<20;i++) {
            System.out.println("一边coding");
        }
    }

}