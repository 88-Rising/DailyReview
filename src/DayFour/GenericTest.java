package DayFour;

import javax.jws.Oneway;

/*
* 泛型时JDK1.5之后增加的，可以帮助建立类型安全的集合
* 相当与在容器上贴了标签
* 泛型的本质就是 数据类型的参数化，我们可以把泛型理解成为数据类型的一个占位符（形式参数）即告诉编译器，在调用泛型时必须传入实际类型
*
*
*
* */
class MyCollection<E>{  //此时这个E相当与形参
    Object[] objs=new Object[5];

    public void set(E e,int index){
        objs[index]=e;

    }
    public E get(int index){
        return (E)objs[index];

    }

}

public class GenericTest {
    public static void main(String[] args) {
        //这个String相当于实际参数
        MyCollection<String> mc=new MyCollection<String>();

        mc.set("hah",0);
//        mc.set(1111,1);
//        Integer a=(Integer)mc.get(1);  //没有E加泛型的情况
//        String b=(String)mc.get(0);
        String b=mc.get(0);



    }
}
