package cn.zybcn.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @Author 程序员小张
 * @Date 2022-12-12 17:59
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "";
}
