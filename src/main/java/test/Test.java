package test;

public class Test {

    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable("thread-01");
//        Thread thread1 = new Thread(myRunnable);
//        Thread thread2 = new Thread(myRunnable);
//        thread1.start();
//        thread2.start();

        MyThread thread1 = new MyThread("thread-01");
        MyThread thread2 = new MyThread("thread-01");
        thread1.start();
        thread2.start();
    }
}
