package pattern.behaviour.observer.v5;

import java.util.Observable;
import java.util.Observer;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/7/31
 * 功能描述:
 * 修改日期:2019/7/31
 * 修改描述:
 */
public class LiShi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
        reportToQinShiWang(arg);
    }

    private void reportToQinShiWang(Object arg) {
        System.out.println("报告秦始王韩非子正在"+arg.toString());
    }
}
