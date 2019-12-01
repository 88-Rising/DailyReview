package MyThread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* 测试线程池
*
* */
public class ExecutorsTest {
//主要学的是这四个API
    private  static final ExecutorService EXE= Executors.newSingleThreadExecutor();//单个线程运行
//    private  static final ExecutorService EXE= Executors.newFixedThreadPool(5);  固定大小的线程池 五个线程同时运行
//    private  static final ExecutorService EXE= Executors.newCachedThreadPool();  可以缓存的线程池（人性化）根据要执行更多的任务来创建更多的线程
//    private  static final ExecutorService EXE= Executors.newScheduledThreadPool();
     public static void main(String[] args) {
       for(int i=0;i<100;i++){
           final  int j=i;
           EXE.submit(new Runnable() {
               @Override
               public void run() {
                   System.out.println(j);
               }
           });

       }
       EXE.shutdown();//线程关闭  这样调用的话可能还没有执行完任务就关闭了


     }

}
