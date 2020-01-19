package thread;

/**
 * @description:
 * @author: he.l
 * @create: 2019-05-17 10:13
 **/
public class MyRunnable implements Runnable{


    private  String name;

    public MyRunnable(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(3);
                System.out.println(this.name+":"+i);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        Thread tread1 = new Thread(new MyRunnable("tread-01"));
        Thread tread2 = new Thread(new MyRunnable("tread-02"));

        tread1.start();
        tread2.start();
    }
}
