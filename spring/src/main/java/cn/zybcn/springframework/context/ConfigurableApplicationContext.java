package cn.zybcn.springframework.context;

import cn.zybcn.springframework.beans.BeansException;

/**
 * @Author 程序员小张
 * @Date 2022-11-24 22:17
 */
public interface ConfigurableApplicationContext extends ApplicationContext {


    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;


    void registerShutdownHook();


    void close();

}
