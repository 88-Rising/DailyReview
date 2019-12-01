package MyThread;

/*
 * 实现线程安全的入队列和出队列
 * 1.循环式队列
 * 2.链表式队列
 *
 * 接下来使用循环队列来演示线程安全的入队列和出队列
 * */


import java.util.Random;

public class MyBlockingQueue<E> {
    //队列元素
    private Object[] elements;

    //添加元素的位置
    private int addIndex;
    //取出元素的位置
    private int takeIndex;
    //队列大小
    private int size;

    public MyBlockingQueue(int capacity) {//传入队列的大小
        elements = new Object[capacity];


    }

    public synchronized E poll() {//取出元素
        E element = null;
        try {
            while (size == 0) {
                wait();

            }
            element = (E) elements[takeIndex];
            takeIndex = (takeIndex + 1) % elements.length;
            size--;
            notifyAll();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return element;

    }

    //锁的式同步实例方法 this对象 在超出容量时进行等待
    public synchronized void offer(E element) {//插入元素
        try {
            while (size == elements.length) {
                wait();

            }
            elements[addIndex] = element;
            addIndex = (addIndex + 1) % elements.length;//避免超出队列容量
            size++;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        MyBlockingQueue queue = new MyBlockingQueue(10);
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        int num = new Random().nextInt(100) + 1;
                        System.out.println(num);
                        queue.offer(num);//随机取1-100

                    }
                }
            }).start();
            for (int k = 0; k < 100; k++) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int j = 0; j < 1000; j++) {

                            System.out.println(queue.poll());

                        }
                    }
                }).start();

            }
        }
    }
}