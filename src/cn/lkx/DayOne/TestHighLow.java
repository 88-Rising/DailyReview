package cn.lkx.DayOne;
/*
* 设计程序 追求的是高内聚和低耦合
*    高内聚就是类内务数据操作细节自己完成 不允许外部干涉 封装细节，便于修改内部代码 提高可维护性
*    低耦合是仅暴漏少量的方法给外部使用 尽量方便内部调用 简化外部调用 便于调用者使用 便于扩展和协作
*  封装的具体优点 就是提高代码的安全性和复用性
*
*  private 表示私有 只有自己的类可以访问（同一个类）
*  default 表示没有修饰符修饰 只有同一个包的类才能访问
*  protected 表示可以被同一个包的类以及其他包中的子类访问
*  public 表示可以被该项目的所有包中的所有类访问
*
* 测试封装（Encapsulation）
* * */
class Human{
    private int age;   //只能在本类中访问 子类都不能访问
    String name;//同一个包中的类就可以访问
    void sayAge(){
        System.out.println(age);
    }
}
class Boy{

}
public class TestHighLow {
    public static void main(String[] args) {
        Human h=new Human();
     h.name="hah";
    }
}
