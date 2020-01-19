package thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: he.l
 * @create: 2019-05-17 09:57
 **/
public class MyTread extends Thread{

    public MyTread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            for(long k=0;k<100000000;k++);
            System.out.println(this.getName()+":"+i);
            System.out.println(Thread.currentThread().getName()+"正在执行...");
        }

    }

    public static void main(String[] args) {
        MyTread tread1 = new MyTread("tread-01");
        MyTread tread2 = new MyTread("tread-02");
//
        tread1.start();
        tread2.start();
//        System.out.println("2015-08-10 00:00:00".length());
//        Date date = dateFormat("2015-08-10","yyyy-MM-dd HH:mm:ss");
//        System.out.println(DaysBetween(date,null));
    }
    public static Date dateFormat(String date, String dateFormat) {
        if (date == null)
            return null;
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        if (date != null)
            try {
                return format.parse(date);
            } catch (Exception ex) {
            }
        return null;
    }
    public static long DaysBetween(Date date1, Date date2) {
        if (date2 == null)
            date2 = new Date();
        long day = (date2.getTime() - date1.getTime()) / 86400000L;
        return day;
    }
}
