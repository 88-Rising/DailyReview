package cn.lkx.Daytwo;
/*
* 如果父类的方法加了final关键字之后就不能被重写了
* final 关键字修饰变量的时候 一旦给了初值 就不能被重新赋值了
* */
class Animal1{
    public void shout(){

        System.out.println("叫");
    }
}
class Dog extends Animal1{
    public void shout()
    {
        System.out.println("旺");

    }
    public void jump(){
        System.out.println("跑");
    }

}
class Cat extends Animal1{
    public void shout()
    {
        System.out.println("喵");

    }
}
public class TestCasting {

    static void animal1Cry(Animal1 a){
        a.shout();

    }

    public static void main(String[] args) {
        Animal1 d=new Dog();//自动向上转型 编译器认为d就是animal
        Dog d1=(Dog)d;  //强制向下转型
        d1.jump();
        //d.jump();  会报错
        //但是不能把猫向上转型为动物后 再向下转型为狗 因为在定义的时候它本质是猫
    }
}
