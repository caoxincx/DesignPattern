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
public class Main {
    public static void main(String[] args) {
        HanFeizi hanFeizi = new HanFeizi();
        Observer liShi = new LiShi();
        Observer wangShi = new WangShi();
        Observer liuShi = new LiuShi();

        hanFeizi.addObserver(liShi);
        hanFeizi.addObserver(wangShi);
        hanFeizi.addObserver(liuShi);

        hanFeizi.haveBreakfast();
        hanFeizi.haveFun();
    }
}