package ThreadTest;
/*
* 创建线程的方法一
* 1.创建：继承Thread+重写run
* 2.启动：创建子类对象+start
* *  * */
public class StartThread extends Thread {
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
        StartThread st = new StartThread();
       // st.start();真正启动了一个线程 不保证立即运行 依靠CPU调度
        //st.run();不是真正的启动一个线程 只是调用了run方法所以必须是先学习才能coding
        for(int i=0;i<20;i++) {
            System.out.println("一边coding");
        }
    }

}
