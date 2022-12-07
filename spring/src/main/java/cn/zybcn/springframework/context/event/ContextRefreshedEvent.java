package cn.zybcn.springframework.context.event;

/**
 * @Author 程序员小张
 * @Date 2022-12-06 22:31
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }


}
