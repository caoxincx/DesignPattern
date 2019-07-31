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
public class Main {
    public static void main(String[] args) throws InterruptedException {
        LiShi liShi = new LiShi();
        HanFeizi hanFeizi = new HanFeizi();
        Spy watchBreakfast = new Spy(hanFeizi,liShi,"breakfast");
        Spy watchHaveFun = new Spy(hanFeizi,liShi,"fun");
        watchBreakfast.start();
        watchHaveFun.start();
        Thread.sleep(2000);
        hanFeizi.haveBreakfast();

        Thread.sleep(2000);
        hanFeizi.haveFun();
    }
}
