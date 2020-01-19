package reflex.comm;


import reflex.annotation.init.IntVal;
import reflex.annotation.init.LongVal;
import reflex.annotation.init.StrVal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @description: 对象初始化工厂
 * @author: he.l
 * @create: 2019-03-30 14:56
 **/
public class ObjectFactory {

    public static Object create(Object obj){
        try {
            // 获取User类中所有的方法（getDeclaredMethods也行）
            Method[] methods = obj.getClass().getMethods();
            Field[] fields = obj.getClass().getDeclaredFields();
            if(null!=fields && fields.length>0){
                for(Method method : methods){
                    // 判断此方法是否有该注解
                    if(method.isAnnotationPresent(IntVal.class)){
                        IntVal init = method.getAnnotation(IntVal.class);
                         method.invoke(obj,init.value());
                    }
                    if(method.isAnnotationPresent(LongVal.class)){
                        LongVal init = method.getAnnotation(LongVal.class);
                        method.invoke(obj,init.value());
                    }
                    if(method.isAnnotationPresent(StrVal.class)){
                        StrVal init = method.getAnnotation(StrVal.class);
                        method.invoke(obj,init.value());
                    }
                        // 获取参数类型

                        //cast()将一个Object类型的对象转换成Class表示的类型的对象
                       /*
                        Class[] paramTypes = method.getParameterTypes();
                        if(paramTypes[0].newInstance() instanceof String){
                            method.invoke(obj,init.value());
                        }
                        if(paramTypes[0].newInstance() instanceof Integer){
                            method.invoke(obj,Integer.parseInt(init.value()));
                        }
                        if(paramTypes[0].newInstance() instanceof Long){
                            method.invoke(obj,Long.parseLong(init.value()));
                        }*/

                }
            }

           /* if(null!=methods && methods.length>0){
                for(){

                }
            }*/

        }catch (Exception e){
            obj = null;
            e.printStackTrace();
        }
        return  obj;
    }
}
