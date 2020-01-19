package base;

/**
 * @description: 抽象观察者
 **/
public interface Observer {
    /**
     * 更新自身状态
     */
    void update(String type);

    /**
     * 获取观察者名称
     * */
    String getName();
}
