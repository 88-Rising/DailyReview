package cn.lkx.DayOne;

import java.util.Objects;

/*
*  ==代表的时双方是否相同，如果时基本类行则表示值相同
*     如果是引用类型则表示地址相同则是同一个对象
*  equlas :Object类中定义有:public boolean equals(Object obj)方法
*       提供定义对象内容相等的逻辑
*
* */
class User{
    int id;
    String name;
    String pwd;
    public User(int id,String name,String pwd){
        this.id=id;
        this.name=name;
        this.pwd=pwd;
    }
    @Override
    public boolean equals(Object o) {//重写Equals方法
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                name.equals(user.name) &&
                pwd.equals(user.pwd);
    }
    public boolean equals1(Object o){//只对Id进行判断
        User user=(User) o;
       if(id==user.id){
           return true;
       }

       return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, pwd);
    }
}
public class EqualsTest {
    public static void main(String[] args) {
        Object obj;
        String str;

        User u1= new User(1000,"haha","123");
        User u2= new User(1000,"haha","123");
        User u3= new User(1001,"haha","123");
        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));
        System.out.println(u1.equals1(u3));
        System.out.println(u3.equals1(u3));
    }

}
