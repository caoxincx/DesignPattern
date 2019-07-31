package pattern.behaviour.observer.v1;

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
    // 韩非子是否在吃饭
    private boolean isHavingBreakfast = false;
    // 韩非子是否在娱乐
    private boolean isHavingFun = false;

    public void haveBreakfast() {
        System.out.println("韩非子要吃饭了。。。");
        isHavingBreakfast = true;
    }
    public void haveFun() {
        System.out.println("韩非子正在娱乐。。。");
        isHavingFun = true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
