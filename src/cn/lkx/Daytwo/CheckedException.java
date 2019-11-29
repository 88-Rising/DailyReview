package cn.lkx.Daytwo;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.util.logging.FileHandler;
import java.util.zip.GZIPInputStream;

/*
* 所有不是RuntimeException的异常，统称为Checked Exception
*    又被成为已检查异常，如IOException,SQLException等以及用户
*    自定义的Exception异常，这类异常在编译时就必须作出处理，否则无法通过编译
*
*捕获异常是通过三个关键词来实现的：try-catch-finally，用try来执行一段程序，如果出现异常
*  系统会抛出一个异常，可以通过他的类型来catch（捕捉）并且处理它，最后一步时通过finally语句
*  为异常处理提供一个统一的出口，finally所指定的代码都要被执行，catch语句可以有多条
*   但是finally语句最多只能有一条，可根据需要来决定
*
*
* */
public class CheckedException {


    private static GZIPInputStream reader;

    public static void main(String[] args) {

        readMyFile();
    }
    public static  void readMyFile(){
        try {
            FileReader reader = new FileReader("d:/a.txt") ;
            System.out.println("stepOne");
            char c1=(char)reader.read();
            System.out.println(c1);

        } catch (FileNotFoundException e) {
            System.out.println("stepTwo");
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            System.out.println("stepThree");
            try {
                if(reader!=null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
