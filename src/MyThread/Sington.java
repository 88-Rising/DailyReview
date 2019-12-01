package MyThread;

//单例模式

import java.security.Signature;
/*
 * 多线程：安全和效率
 *volatile关键字：
 *    作用是保证共享变量的有序性和可见性
 *    对于有序性来说 具体指禁止指令冲排序（CPU和JVM都有重排序）
 *    用volatile经常用来保证共享数据的读取操作安全
 *
 *   在每一个线程，自己看自己内部的指令都是有序的 但其实JVM，cpu都是进行重排序的
 * */

public class Sington {
    //饿汉模式
    private  static  final Sington SINGTON=new Sington();
    public static Sington getInstance(){
        return SINGTON;
    }

    //懒汉模式
    private volatile static  Sington SINGTON2=null;//定义的时候加上 volatile关键字 保证它有序
    //禁止指令重排序 ，创建一个内存屏障，表示重排序不会把这条指令再重排序到其他指令之后
    public static Sington getInstance2(){
        if(SINGTON2 == null){//多个线程同时进入这行代码 都判断为null
            SINGTON2 = new Sington();

        }
        return SINGTON2;

    }
    //第一种 synchronized写法
    public synchronized static Sington getInstance3(){ //解决线程安全问题
//        synchronized (Sington.class){
//
//
//        }
        if(SINGTON2 == null){
            SINGTON2 = new Sington();

        }
        return SINGTON2;

    }
    //第二种synchronized写法
    public synchronized static Sington getInstance4(){ //解决线程安全问题
        if(SINGTON2 == null){                //DCL:double check locking 两次判断是否为空
            synchronized (Sington.class) {
                /*
                 * 可以分成三步操作 ：
                 * 1.分配对象内存空间
                 * 2.执行对象初始化
                 * 3.把对象赋给引用
                 * 可能重排序为 1.3.2的执行顺序
                 * */
                if(SINGTON2==null) { //避免无序的情况出现 或者在定义的时候加上 volatile关键字 保证它有序
                    SINGTON2 = new Sington();
                }
            }
        }
        return SINGTON2;

    }
}
/*
 A4和b1，c1同时执行，A4指令可能重排序为 1，3，2的执行顺序，此时对象还没有初始化

* */