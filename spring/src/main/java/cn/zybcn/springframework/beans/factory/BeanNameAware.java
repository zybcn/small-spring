package cn.zybcn.springframework.beans.factory;

/**
 * @Author 程序员小张
 * @Date 2022-12-04 11:25
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name);
}
