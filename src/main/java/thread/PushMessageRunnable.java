package thread;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: he.l
 * @create: 2019-05-20 15:49
 **/
public class PushMessageRunnable implements Runnable{

    private String message;
    private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式


    public PushMessageRunnable(String message){
        this.message = message;
    }

    @Override
    public void run() {
      /*  System.out.println(Thread.currentThread().getName()+"---------->"+message+"---->时间"+df.format(new Date()));*/

        System.out.println(Thread.currentThread().getName()+"---------->"+message+"---->时间"+System.currentTimeMillis());

    }
}
