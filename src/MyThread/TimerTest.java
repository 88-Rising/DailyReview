package MyThread;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("我来也");
            }
        }, 3000, 1000);//延迟三秒执行之后每间隔一秒执行一次
    }
}
