package cn.lkx.DayOne;
/*
* 多态指的是同一个方法调用，由于对象不同可能会有不同的行为，
*   现实生活中同一个方法，具体实现会会完全不相同
*  多态的要点：1.多态是方法的多态，不是属性的多态（多态与属性无关）
*             2.多态的存在有三个必要条件：继承，方法重写，父类引用指向子类对象
*             3.父类引用指向子类对象后，用该父类引用调用子类重写的方法，此时多态就出现了
*  有了多态主要是避免写很多重载方法
*
* */
class Animal1{
    public void shout(){

        System.out.println("叫");
    }
}
class Dog extends Animal1{
    public void shout(){

        System.out.println("旺");

    }
}
class Cat extends Animal1{
    public void shout()
    {
        System.out.println("喵");
    }
}
public class TestPolym {
    public static void main(String[] args) {
        Animal1 a=new Animal1();
        animal1Cry(a);
        Dog d =new Dog();
        animal1Cry(d);//把子类对象给了父类的引用
        animal1Cry(new Cat());
    }
    static void animal1Cry(Animal1 a){
        a.shout();
    }
}
