package pattern.behaviour.observer.v5;

import java.util.Observable;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/7/31
 * 功能描述:
 * 修改日期:2019/7/31
 * 修改描述:
 */
public class HanFeiZi extends Observable implements IHanFeiZi{
    public void haveBreakfast() {
        System.out.println("韩非子开始吃早餐了。。。");
        super.setChanged();
        super.notifyObservers("having breakfast");
    }

    public void haveFun() {
        System.out.println("韩非子开始娱乐了。。。");
        super.setChanged();
        super.notifyObservers("having fun");

    }

    @Override
    public void notifyObservers(Object arg) {

    }
}
