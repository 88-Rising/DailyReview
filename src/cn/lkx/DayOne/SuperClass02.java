package cn.lkx.DayOne;


class FatherClass1{
    public FatherClass1(){//构造器的创建
        //父类也一样也会调用父类的构造方法也就是Object类的构造方法
        System.out.println("创建FatherClass");
    }
}

class ChildClass1 extends FatherClass1{
    public ChildClass1(){//构造方法的第一句总是super()来调用父类对象的构造方法，写不写都是这样
//        super();    //在静态初始化块的时候也是这样的
        System.out.println("创建ChildClass");


    }
}

public class SuperClass02 extends FatherClass1 {
    public SuperClass02(){
        System.out.println("i am cat");
    }
    public static void main(String[] args) {
        System.out.println("创建一个ChildClass对象");
        new ChildClass1();
        SuperClass02 su=new SuperClass02();
        //属性和方法的查找顺序 先查找当前类如果没有，继续向上查看每一个父类知道Object如果没有则报错
    }
}
