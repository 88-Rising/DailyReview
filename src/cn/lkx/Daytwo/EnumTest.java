package cn.lkx.Daytwo;
/*
* 测试枚举 在定义一组常量的时候可以使用枚举
*    enum 枚举名{
*          枚举体（常量列表）
*     }
*   枚举的实质也还是一个类，其中的每一个成员都相当于枚举的一个对象
*     并且默认都是public static final
* 尽量不要使用枚举的高级特性，高级特性事实上都可以用普通类来实现
*
* */
enum Season{
    SPRING,SUNMMER,AUTUMN,WINTER
}


public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        Season a=Season.AUTUMN;
        switch (a){
            case SPRING:
                System.out.println("春天");
              break;
            case SUNMMER:
                System.out.println("夏天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
        }
    }
}
