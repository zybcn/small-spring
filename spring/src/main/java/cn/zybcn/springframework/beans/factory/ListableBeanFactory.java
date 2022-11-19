package cn.zybcn.springframework.beans.factory;

import cn.zybcn.springframework.beans.BeansException;

import java.util.Map;

/**
 * @Author 程序员小张
 * @Date 2022-11-20 00:04
 * @Desc 扩展Bean工厂接口
 */
public interface ListableBeanFactory extends BeanFactory {


    /**
     * 按照类型返回 Bean 实例
     *
     * @param <T>
     * @param type
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;


    /**
     * 返回注册表中所有bean的名称
     */
    String[] getBeanDefinitionName();

}
