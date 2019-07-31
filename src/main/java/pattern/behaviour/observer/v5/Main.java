package pattern.behaviour.observer.v5;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/7/31
 * 功能描述:
 * 修改日期:2019/7/31
 * 修改描述:
 */
public class Main {
    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        LiShi liShi = new LiShi();
        hanFeiZi.addObserver(liShi);

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
