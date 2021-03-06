package pattern.behaviour.observer.v3;


/**
 * 需求编号:
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/7/31
 * 功能描述:
 * 修改日期:2019/7/31
 * 修改描述:
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String context);
}
