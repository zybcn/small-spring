package cn.zybcn.springframework.beans.factory;

/**
 * @Author 程序员小张
 * @Date 2022-11-26 19:49
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}
