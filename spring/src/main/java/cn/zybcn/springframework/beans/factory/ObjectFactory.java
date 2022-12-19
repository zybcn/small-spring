package cn.zybcn.springframework.beans.factory;

import cn.zybcn.springframework.beans.BeansException;

/**
 * @Author 程序员小张
 * @Date 2022-12-17 14:05
 */
public interface ObjectFactory<T> {
    T getObject() throws BeansException;
}
