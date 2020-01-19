package reflex;

import reflex.comm.ObjectFactory;

/**
 * @description: 注解测试类
 * @author: he.l
 * @create: 2019-03-30 15:36
 *  main ----> psvm
 *  sys.out.print---->sout
 *  for--->fori
 **/
public class Test {

    public static void main(String[] args) {
        Persion persion = new Persion();
        ObjectFactory.create(persion);
        System.out.println(persion);
    }

}
