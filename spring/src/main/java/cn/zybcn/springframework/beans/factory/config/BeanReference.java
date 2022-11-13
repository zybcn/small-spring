package cn.zybcn.springframework.beans.factory.config;

/**
 * @Author 程序员小张
 * @Date 2022-11-13 14:32
 */
public class BeanReference {
    private String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
