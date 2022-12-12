package cn.zybcn.springframework.steretype;

import java.lang.annotation.*;

/**
 * @Author 程序员小张
 * @Date 2022-12-12 18:01
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {
    String value() default "";
}
