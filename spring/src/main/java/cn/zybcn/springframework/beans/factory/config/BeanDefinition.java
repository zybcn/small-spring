package cn.zybcn.springframework.beans.factory.config;

import cn.zybcn.springframework.beans.PropertyValues;

/**
 * @Author ZhangYiBo
 * @Date 2022-07-17 23:30
 */
public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;


    private String initMethodName;


    private String destroyMethodName;


    public String getInitMethodName() {
        return initMethodName;
    }

    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }

    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }
}
