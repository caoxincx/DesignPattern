package pattern.behaviour.delegate.v1;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/8/5
 * 功能描述:
 * 修改日期:2019/8/5
 * 修改描述:
 */
public class TargetA implements ITarget {
    @Override
    public void doSomething() {
        System.out.println("开发模块A");
    }
}
