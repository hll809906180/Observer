package reflex.annotation.validate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsInteger {
	
	int max() default 999999999;
	
	int min() default -999999999;
	
	boolean isNull() default false;
}
