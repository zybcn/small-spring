package cn.zybcn.springframework.core.io;

/**
 * @Author 程序员小张
 * @Date 2022-11-19 23:17
 */
public interface ResourceLoader {


    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
