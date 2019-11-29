package cn.lkx.DayOne;
/*
* 测试继承
* Java 中只有单继承没有多继承 Java中的接口可以多继承
* 方法的重写 指的是override 子类重写父类的方法
* overload指的是方法的重写 参数不一样
* */
class Person{
    String name;
    int height;
    public void rest(){
        System.out.println("休息");

    }

}
class Student extends  Person{

    String major;

    public void study(){
        System.out.println("学习");
    }

    @Override
    public void rest() {
        super.rest();
    }
    public Student(String name,int height,String major){
        this.name=name;
        this.major=major;
        this.height=height;

    }

    @Override
    public String toString() {
        return "Student{" +
                "height=" + height +
                '}';
    }
}
public class TestExtends {
    public static void main(String[] args) {

        Student hh= new Student("hahaa",123456,"shuxue");
        System.out.println(hh);
        System.out.println(hh instanceof Student); //判断hh属于什么类型
    }




}
