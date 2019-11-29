package cn.lkx.DayOne;
/*
* super是直接父类对象的引用，可以通过super来访问父类中被子类覆盖的方法或属性
*
*
* */
class FatherClass{
    public int value;
    public void f(){
        value=100;
        System.out.println("father.value="+value);
    }
}
class ChildClass extends FatherClass{
    public int value;
    public void f(){
        super.f();//调用父类对象的普通方法
        value=200;
        System.out.println("child.value="+value);
        System.out.println(value);
        System.out.println(super.value);//调用父类对象的成员变量
    }
}
public class SuperTest {
    public static void main(String[] args) {
           new ChildClass().f();
    }
}
