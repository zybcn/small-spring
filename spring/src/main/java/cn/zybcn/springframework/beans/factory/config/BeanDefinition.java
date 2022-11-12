package cn.zybcn.springframework.beans.factory.config;

/**
 * @Author ZhangYiBo
 * @Date 2022-07-17 23:30
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

}
