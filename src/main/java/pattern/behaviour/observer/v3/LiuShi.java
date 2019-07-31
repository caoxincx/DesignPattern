package pattern.behaviour.observer.v3;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/7/31
 * 功能描述:
 * 修改日期:2019/7/31
 * 修改描述:
 */
public class LiuShi implements Observer {
    public void updateState(String context) {
        System.out.println("目标对象状态更新为 "+context);
    }
}
