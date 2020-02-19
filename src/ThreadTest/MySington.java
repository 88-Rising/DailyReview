package ThreadTest;


import sun.font.EAttribute;

//饿汉模式
//当类加载的时候instance会被初始化 此时类的构造函数会被调用
class EagerSington{
    private static final EagerSington instance=new EagerSington();
    private EagerSington(){

    }
    public static EagerSington getInstance(){
        return instance;
    }

}
//懒汉模式
//双重校验锁避免指令重排序导致创建多个不必要的对象
//不是在类加载的时候就创建对象 而是在调用getInstance方法后再创建对象
//加了synchronized锁之后保证线程安全性
class LazySington{
    private volatile static LazySington instance=null;
    private LazySington(){

    }
    public static LazySington getInstance(){
        if(instance==null){
            synchronized (LazySington.class){
                if(instance==null) {
                    instance = new LazySington();
                }
            }

        }
        return instance;
    }

}
public class MySington {
}
