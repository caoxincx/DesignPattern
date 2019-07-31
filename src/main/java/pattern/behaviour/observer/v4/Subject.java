package pattern.behaviour.observer.v4;

import java.util.Vector;

/**
 * 需求编号:
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/7/31
 * 功能描述:目标对象
 * 修改日期:2019/7/31
 * 修改描述:
 */
public abstract class Subject {
    // 定义一个观察者数组
    private Vector<Observer> observerVectors = new Vector<Observer>();

    // 增加一个观察者
    public void addObserver(Observer observer) {
        observerVectors.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerVectors.remove(observerVectors);
    }

    public void notifyObserver() {
        for (Observer observerVector : observerVectors) {
            observerVector.update();
        }
    }

}
