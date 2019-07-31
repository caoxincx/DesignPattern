package pattern.behaviour.observer.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/7/31
 * 功能描述:
 * 修改日期:2019/7/31
 * 修改描述:
 */
public class HanFeizi implements Subject,IHanFeiZi {
    private List<Observer> list = new ArrayList();
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    public void notifyObservers(String context) {
        for (Observer observer : list) {
            observer.updateState(context);
        }
    }

    public void haveBreakfast() {
        System.out.println("韩非子要吃饭了。。。");
        this.notifyObservers("吃饭");
    }
    public void haveFun() {
        System.out.println("韩非子正在娱乐。。。");
        this.notifyObservers("娱乐");
    }
}
