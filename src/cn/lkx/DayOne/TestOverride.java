package cn.lkx.DayOne;
/*
* 测试重写 方法的重写 指的是override既是重写也是覆盖 子类重写父类的方法
*  重写要保证 参数和形参列表相同
* 返回值类型子类要小于等于父类
* 返回权限子类大于等于父类
*
*
* Object是所有Java类的根基类 也就意味着Java对象都拥有Object类的属性和方法
*
*
*/

class Vehicle{
    public void run(){
        System.out.println("跑");

    }
    public void stop(){
        System.out.println("停");
    }
    public Person ctm(){
        return new Person();
    }

}
class Horse extends Vehicle{
   public void run(){
       System.out.println("跑跑跑");
   }
    public Student ctm(){//返回值小于等于父类
        return new Student("ss",123,"yuwen");
    }

}

public class TestOverride {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.run();
    }
}
