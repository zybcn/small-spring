package cn.zybcn.springframework.context.event;

/**
 * @Author 程序员小张
 * @Date 2022-12-06 22:30
 */
public class ContextClosedEvent extends ApplicationContextEvent {


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
