package pattern.behaviour.observer.v2;

/**
 * 需求编号:
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/7/31
 * 功能描述:
 * 修改日期:2019/7/31
 * 修改描述:
 */
public class HanFeizi implements IHanFeiZi {
    private LiShi liShi = new LiShi();

    public void haveBreakfast() {
        liShi.update("韩非子要吃饭了");
        System.out.println("韩非子要吃饭了。。。");

    }
    public void haveFun() {
        liShi.update("韩非子正在娱乐");
        System.out.println("韩非子正在娱乐。。。");
    }
}