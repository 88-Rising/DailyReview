package MyThread;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class ThreadAdvantage {
    //多线程的执行效率问题
    //数据结构和多线程结合起来才是真正的难点 map tree list
    /*
     * 集合类：
     * Collection  /----List:(基于什么数据结构实现的) 对于增删查改
     *                        ArrayList:数组
     *                        LinkedList:队列，双向链表 容易删改不容易查
     *                  Set: HashSet（基于HashMap实现）,TreeSet
     * Map        /----Map:  HashMap（数组加链表加红黑树）,TreeMap
     * */

    public static List<String> randomList() {
        char[] chars = {'a', 'b', 'c', 'z', 'A', 'Z'};
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            int random = new Random().nextInt(chars.length);
            char c = chars[random];
            list.add(String.valueOf(c));
        }
        return list;
    }
    public static void main(String[] args) {
        List<String> list =randomList();
        //创建10个线程 每个线程获取list中的10000个元素
        //时间java.util.Data,
        //jdk1.8->LocalDataTime
        long start=System.currentTimeMillis();
        //    long start=new Date(),getTime();  1971年开始执行的毫秒数
        for(int i=0;i<5;i++){
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<2000;j++) {
                        list.get(k*2000+j);
                    }
                }
            }).start();
        }
        while(Thread.activeCount()>2){  //判断现在是否还有线程在执行 如果建立的线程还没有执行完 则不使JavaMian主线程执行
            Thread.yield();  //让JavaMain先不要执行 让创建的其他线程先执行 让出时间片
            //使当前由运行态转变为就绪态
        }

//        for(Thread thread:threads){
//            thread.join();
//        }
        //join方法：当前的线程阻塞 等待调用线程执行完毕 先执行子任务之后再往下进行

        long end =System.currentTimeMillis();
        System.out.println("耗时："+(end-start)/1000+"毫秒");
    }
}

