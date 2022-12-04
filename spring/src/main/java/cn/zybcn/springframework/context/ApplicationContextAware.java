package cn.zybcn.springframework.context;

import cn.zybcn.springframework.beans.BeansException;
import cn.zybcn.springframework.beans.factory.Aware;

/**
 * @Author 程序员小张
 * @Date 2022-12-04 11:58
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
