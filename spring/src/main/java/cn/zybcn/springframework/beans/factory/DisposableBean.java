package cn.zybcn.springframework.beans.factory;

/**
 * @Author 程序员小张
 * @Date 2022-11-26 19:50
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
