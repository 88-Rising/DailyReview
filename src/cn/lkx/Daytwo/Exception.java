package cn.lkx.Daytwo;
/*
*软件在运行过程中，非常可能遇到问题，这种情况称为异常；Exception
*  异常机制的本质：就是当程序出现错误时，程序安全推出的机制
* Java采用面向对象的方式来处理异常的，处理过程：
*  1.抛出异常：在执行一个方法的时候，如果发生异常，则这个方法生成代表
*     该异常的一个对象，停止当前执行路径，并把异常对象交给JRE
*  2.捕获异常：JRE得到该异常后，寻找相应的代码来处理该异常，
*      JRE在方法的调用栈中查找，从省城异常的方法开始回溯，知道找到i相应的异常处理代码为止
*
*
*
*  */
public class Exception {
    public static void main(String[] args) {
        int a=1;
        int b=0;
//      System.out.println(a/b);  会报异常 除数为0
        if (b != 0) {
            System.out.println(a/b);
        }
//像这些运行时异常 需要我们自己来处理解决
        String str=null;//解决空指针异常，通常是增加非空判断
        if(str!=null){
            System.out.println(str.length());
        }

    }

}
