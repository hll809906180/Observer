package thread;

import java.util.concurrent.Callable;

/**
 * @description: Callable接口代表一段可以调用并返回结果的代码
 * @author: he.l
 * @create: 2019-05-16 16:57
 **/
public class MyCallable implements Callable<String>{

    private long wiatTime;

    public MyCallable(long wiatTime){
        this.wiatTime = wiatTime;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(wiatTime);
        return Thread.currentThread().getName();
    }
}
