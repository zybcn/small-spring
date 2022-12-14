package cn.zybcn.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @Author 程序员小张
 * @Date 2022-12-13 20:55
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {

    String value();

}
