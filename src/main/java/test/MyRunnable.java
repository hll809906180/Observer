package test;

public class MyRunnable implements Runnable{

    private String name;

    public int count = 10;

    public MyRunnable(String name){
        this.name=name;
    }

    @Override
    public synchronized void run() {
        while(count>0){
            System.out.println(name+":"+count);
            count--;
        }
    }
}
