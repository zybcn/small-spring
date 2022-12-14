package cn.zybcn.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @Author 程序员小张
 * @Date 2022-12-13 20:56
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Qualifier {

    String value() default "";
}
