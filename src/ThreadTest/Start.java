package ThreadTest;

public class Start {
    /*
    * 1.进程是资源分配的单位(每个进程至少开辟一个线程称之为主线程)
    * 2.线程是执行和调度的单位(轻量级的进程)
    *   一个进程可以开辟多条线程
    * 很多线程是模拟出来的，真正的多线程是指有多个CPU即多核
    * 如果模拟出来的多线程 即一个CPU的情况下，在同一个时间点CPU只能执行一个代码 因为切换的很快所以就有同时执行的错觉
    *
    * 核心概念：
    * 1.线程就是独立的执行路径
    * 2.在程序运行时即使没有自己创建线程 后台也会存在多个线程如主线程
    * 3.main()称之为主线程是系统的入口，用于执行整个程序
    * 4.在一个进程中如果开辟了多个线程，线程的运行由调度器调度，调度器是与操作系统紧密相关的，先后顺序不能进行人为的干预
    * 5.对同一份资源进行操作时，会存在资源抢夺的问题，需要加入并发控制
    * 6.线程会带来额外的开销，如CPU调度时间，并发控制开销
    * 7.每个线程在自己的工作内存交互，加载和存储主内存控制不当会造成数据不一致
    *
    * */
    /*
    * 创建线程常用的两种方式：
    * 1.继承Thread类作为Thread子类重写run方法，调用子类对象的start方法
    * 2.实现Runnable接口的类重写run方法 然后创建一个Thread对象来调用start方法
    *
    * */

    /*
    * 线程状态：
    * 新生态——就绪态——运行态——死亡态
    *            (阻塞态)
    * 1.Thread t=new Thread();线程一旦创建 就进入到了新生态
    * 2.调用start()线程立即进入就绪状态 不代表立即调度执行
    * 3.获得cpu调度之后就会进入运行态
    * 4.当调用sleep()，wait()或同步锁定时线程进入阻塞状态，所谓阻塞状态就是代码不往下执行，
    *   在等待着，同理不保证调用以上方法就立即阻塞，阻塞事件解除后，重新进入就绪态
    *   等待CPU调度执行才进入运行态
    * 5.一旦进入死亡态，不能再调用start()方法再次启动线程
    *
    * sleep():指定当前线程阻塞的毫秒数，sleep()时间到达后线程进入就绪态 每个线程都有一个锁 sleep不会释放锁
    * join()：阻塞指定线程等待另一个线程完成之后再执行
    * yield()：1.让当前正在执行的线程暂停 不是阻塞线程，而是将其转为就绪态
    *          2.调用了yield()方法之后，如果没有其他等待执行的线程之后，此时当前线程就会马上恢复执行
    *
    * */
    /*
    * 并发：同一个对象对多个线程同时操作 比如同时操作同一账户
    * */
}
