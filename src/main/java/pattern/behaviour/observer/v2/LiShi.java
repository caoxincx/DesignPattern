package pattern.behaviour.observer.v2;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/7/31
 * 功能描述:
 * 修改日期:2019/7/31
 * 修改描述:
 */
public class LiShi implements ILiShi {

    public void update(String context) {
        System.out.println("李斯观察到韩非子活动，开始向老板汇报。。。");
        reportToQinShiHuang(context);
        System.out.println("李斯汇报完毕。。。");
    }

    private void reportToQinShiHuang(String context) {
        System.out.println("李斯：报告秦始皇韩非子有活动---->"+context);
    }
}
