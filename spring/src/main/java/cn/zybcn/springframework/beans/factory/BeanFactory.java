package cn.zybcn.springframework.beans.factory;

import cn.zybcn.springframework.beans.BeansException;

/**
 * @Author ZhangYiBo
 * @Date 2022-07-17 23:44
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;


    Object getBean(String name, Object... args) throws BeansException;


    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
