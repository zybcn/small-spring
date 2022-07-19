package cn.zybcn.springframework.beans;

/**
 * @Author ZhangYiBo
 * @Date 2022-07-17 23:28
 */
public class BeansException extends RuntimeException{

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
