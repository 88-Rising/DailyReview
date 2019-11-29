package cn.lkx.DayOne;
/*
*在类中，用static声明的成员变量为静态成员变量，也成为类变量
*       类变量的生命周期和类相同，在整个应用程序执行期间都有效
*     static修饰的成员变量和方法，从属于类，普通变量和方法从属于对象。
*
*
* */
class Animal{
    String name;
    int age;
    public String toString(){
        return "name:"+name+"  age:"+age;
    }
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

}

public class TestObject {

    public static void main(String[] args) {
//        Object obj;
        TestObject to =new TestObject();
        System.out.println(to);
        Animal an=new Animal("haha",12);
        System.out.println(an);
    }
    public String toString(){  //重写toString方法
        return "测试Object对象";

    }

}
