package it.caoxin.designpriciple.dependenceinversion;

/*
高层模块也应该依赖于接口
 */
public class GuiZi implements JiaJU {
    @Override
    public void buyJiaJu() {
        System.out.println("buy guizi。。。");
    }
}
