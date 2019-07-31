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
public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer concreteObserver = new ConcreteObserver();
        // 将观察者放入目标对象
        concreteSubject.addObserver(concreteObserver);
        // 目标对象开始改变，观察者自动行动
        concreteSubject.doSomething();

    }
}
