package thread;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

/**
 * @description: java 线程池
 * @author: he.l
 * @create: 2019-05-17 14:25
 **/
public class TreadPoolStudy {

    public static void fixedThread(){
        //创建固定大小的线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口  
        Thread t1 = new MyTread("t1");
        Thread t2 = new MyTread("t2");
        Thread t3 = new MyTread("t3");
        Thread t4 = new MyTread("t4");
        //将线程放到线程池执行
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        //关闭线程池
        pool.shutdown();
    }

    public static void scheduledpool(){
        //创建一个线程池，它可安排在给定延迟后运行命令或者定期地执行
       /* ThreadPoolExecutor*/
        ScheduledExecutorService scheduledpool = Executors.newScheduledThreadPool(2);
      /*  //创建一个单任务执行线程池，它可安排在给定延迟后运行命令或者定期地执行。
        ScheduledExecutorService scheduledpool = Executors.newSingleThreadScheduledExecutor();*/
        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
        Thread t1 = new MyTread("t1");
        Thread t2 = new MyTread("t2");
        Thread t3 = new MyTread("t3");
        Thread t4 = new MyTread("t4");
        //将线程放到线程池执行
        scheduledpool.execute(t1);
        scheduledpool.execute(t2);
        //使用延迟执行风格的方法
        scheduledpool.schedule(t3,5000, TimeUnit.MILLISECONDS);
        scheduledpool.schedule(t4,10000, TimeUnit.MILLISECONDS);
        //关闭线程池
        scheduledpool.shutdown();
    }

    /**
     * 以固定周期频率执行任务
     * command：执行线程
     * initialDelay：初始化延时
     * period：两次开始执行最小间隔时间
     * unit：计时单位
     */
    public static void executeFixedRate() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
        executor.scheduleAtFixedRate(
                new PushMessageRunnable("审批信息"),
                0,
                1000,
                TimeUnit.MILLISECONDS);
    }

    /**
     * 以固定延迟时间进行执行
     * 本次任务执行完成后，需要延迟设定的延迟时间，才会执行新的任务
     * command：执行线程
     * initialDelay：初始化延时
     * delay：前一次执行结束到下一次执行开始的间隔时间（间隔执行延迟时间）
     * unit：计时单位
     */
    public static void executeFixedDelay() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleWithFixedDelay(
                new PushMessageRunnable("审批信息"),
                0,
                100,
                TimeUnit.MILLISECONDS);
    }

    /**
     * 每天晚上8点执行一次
     * 每天定时安排任务进行执行
     */
    public static void executeEightAtNightPerDay() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        long oneDay = 24 * 60 * 60 * 1000;
        long initDelay  = getTimeMillis("20:00:00") - System.currentTimeMillis();
        initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;

        executor.scheduleAtFixedRate(
                new PushMessageRunnable("数据备份"),
                initDelay,
                oneDay,
                TimeUnit.MILLISECONDS);
    }

    /**
     * 获取指定时间对应的毫秒数
     * @param time "HH:mm:ss"
     * @return
     */
    private static long getTimeMillis(String time) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
            DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
            Date curDate = dateFormat.parse(dayFormat.format(new Date()) + " " + time);
            return curDate.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 自定义线程池
     *corePoolSize -池中所保存的线程数，包括空闲线程。  
     *maximumPoolSize -池中允许的最大线程数。  
     *keepAliveTime -当线程数大于核心时，此为终止前多余的空闲线程等待新任务的最长时间。  
     *unit -keepAliveTime参数的时间单位。  
     *workQueue -执行前用于保持任务的队列。此队列仅保持由execute方法提交的Runnable任务。  
     */
    public static void customizePool(){
        //创建等待队列
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<Runnable>(20);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,
                3,
                2,
                TimeUnit.MILLISECONDS,
                blockingQueue);
        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
        Thread t1 = new MyTread("t1");
        Thread t2 = new MyTread("t2");
        Thread t3 = new MyTread("t3");
        Thread t4 = new MyTread("t4");
        Thread t5 = new MyTread("t5");
        Thread t6 = new MyTread("t6");
        Thread t7 = new MyTread("t7");
        //将线程放入线程池中进行执行
        executor.execute(t1);
        executor.execute(t2);
        executor.execute(t3);
        executor.execute(t4);
        executor.execute(t5);
        executor.execute(t6);
        executor.execute(t7);
        //关闭线程池
        executor.shutdown();

    }

    /**
     * 线程池-有返回值的线程
     */
    public void callable() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
       //创建有返回值的任务
        Callable callableA = new MyTextCallable("A");
        Callable callableB = new MyTextCallable("B");
        //执行任务并获取Future对象
        Future fA = executor.submit(callableA);
        Future fB = executor.submit(callableB);
        //从Future对象上获取任务的返回值，并输出到控制台
        System.out.println("---->" + fA.get().toString());
        System.out.println("---->" + fB.get().toString());
        executor.shutdown();
    }

    public static void main(String[] args) {
        TreadPoolStudy treadPoolStudy = new TreadPoolStudy();
    //  fixedThread();
     //   scheduledpool();
      //  executeFixedRate();
        //executeEightAtNightPerDay();
        //customizePool();
        try {
            treadPoolStudy.callable();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 class MyTextCallable implements  Callable{

     private String name;

     public MyTextCallable(String name){
         this.name =name;
     }

     @Override
     public Object call() throws Exception {
         return name+"任务返回的内容";
     }
 }
}
