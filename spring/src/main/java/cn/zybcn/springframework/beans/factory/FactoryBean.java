package cn.zybcn.springframework.beans.factory;

/**
 * @Author 程序员小张
 * @Date 2022-12-04 21:06
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;


    Class<?> getObjectType();


    boolean isSingleton();

}
