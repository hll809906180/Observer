package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @description:
 * @author: he.l
 * @create: 2019-07-01 17:20
 **/
public class TestThread {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        List<Future> list = new ArrayList<Future>();
        for(int i=0;i<3;i++){
            Callable c = new MyCallable(i);
            Future f = pool.submit(c);
            list.add(f);
        }

        pool.shutdown();
        for(Future f: list){
            try {
                System.out.println(f.get().toString());
            }catch (Exception e){

            }

        }
    }
}
