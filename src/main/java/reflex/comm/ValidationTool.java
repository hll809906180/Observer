package reflex.comm;

import org.apache.commons.lang.StringUtils;
import reflex.annotation.validate.IsInteger;

import java.lang.reflect.Field;

/**
 * @description: 校验工具类
 * @author: he.l
 * @create: 2019-03-30 17:19
 **/
public class ValidationTool {
    /**
     * 属性校验方法
     * @param obj
     * @return
     */
    public static CodeMappingDb validationField(Object obj){
        CodeMappingDb codeMappingDb = new CodeMappingDb();
        Field[] fields = Object.class.getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            Object o = null;
            try {
                o = field.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            /**
             * 校验Integer
             */
            CodeMappingDb cd = new CodeMappingDb();
            if(field.isAnnotationPresent(IsInteger.class)){
                IsInteger isint = field.getAnnotation(IsInteger.class);
                if(!isint.isNull()){
                    if(null==o){
                        cd.setCodeNumber("参数非法");
                        cd.setCodeDesc(field.getName()+"不能为空");
                        return cd;
                    }
                }
                if(isNumber(o.toString())){
                    cd.setCodeNumber("参数非法");
                    cd.setCodeDesc(field.getName()+"不是数字");
                    return cd;
                }

            }

            }







        return codeMappingDb;

        }

    /**
     * 判断是否为数字
     *
     * @param str
     * @return
     */
    public static boolean isNumber(String str) {
        if (StringUtils.isNumeric(str))
            return true;
        return false;
    }
    }
