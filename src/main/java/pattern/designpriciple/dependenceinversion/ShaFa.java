package pattern.designpriciple.dependenceinversion;

import pattern.designpriciple.dependenceinversion.JiaJU;

/*
高层模块也应该依赖于接口
 */
public class ShaFa implements JiaJU {
    @Override
    public void buyJiaJu() {
        System.out.println("buy ShaFa。。。");
    }
}
