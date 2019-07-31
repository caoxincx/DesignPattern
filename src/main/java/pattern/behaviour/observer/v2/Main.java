package pattern.behaviour.observer.v2;

import pattern.behaviour.observer.v1.Spy;

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
        HanFeizi hanFeizi = new HanFeizi();
        hanFeizi.haveBreakfast();
        hanFeizi.haveFun();
    }
}
