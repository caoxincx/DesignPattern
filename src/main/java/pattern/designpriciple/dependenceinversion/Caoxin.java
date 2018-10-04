package it.caoxin.designpriciple.dependenceinversion;

/*
什么是依赖倒置原则呢？
1.曹欣买索菲亚家居
    2.什么是变得，曹欣回变吗？不会经常变
    3.家居有什么:凳子，沙发，柜子一些，可能也会变
 */
public class Caoxin {
    //1.先来一个最简单的实现 ---底层模块直接依赖了实现
//    v1
//    public void buyDengzi(){
//        System.out.println("buy dengzi。。。");
//    }
//    public void buyShaFa(){
//        System.out.println("buy ShaFa。。。");
//    }
//    public void buyGuiZi(){
//        System.out.println("buy GuiZi");
//    }

    //底层模块应该依赖于抽象(方法叫依赖)(弱关联）
//    v2
//    public void buyJiaJu(JiaJU jiaJU){
//        jiaJU.buyJiaJu();
//    }

//    底层依赖抽签第二种方式关联
//    private JiaJU jiaJU;
//
//    public Caoxin(JiaJU jiaJU) {
//        this.jiaJU = jiaJU;
//    }
//        public void buyJiaJu(){
//        jiaJU.buyJiaJu();
//    }


//    底层依赖抽签第三种方式关联
    private JiaJU jiaJU;

    public void setJiaJu(JiaJU jiaJU){
        this.jiaJU = jiaJU;
    }

    public void buyJiaJu(){
        jiaJU.buyJiaJu();
    }

}
