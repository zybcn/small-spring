package cn.zybcn.springframework.beans.factory;

/**
 * @Author 程序员小张
 * @Date 2022-12-04 11:33
 */
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);
}
