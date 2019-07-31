package pattern.behaviour.observer.v4;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/7/31
 * 功能描述:
 * 修改日期:2019/7/31
 * 修改描述:
 */
public class ConcreteObserver implements Observer {
    public void update() {
        System.out.println("接受消息并进行处理。。。");
    }
}
