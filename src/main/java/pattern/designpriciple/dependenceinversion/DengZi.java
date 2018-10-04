package pattern.designpriciple.dependenceinversion;

/*
高层模块也应该依赖于接口
 */
public class DengZi implements JiaJU {
    @Override
    public void buyJiaJu() {
        System.out.println("buy dengzi。。。");
    }
}
