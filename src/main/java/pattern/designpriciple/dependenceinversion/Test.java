package it.caoxin.designpriciple.dependenceinversion;

/*
应用层-高层
 */
public class Test {
    public static void main(String[] args) {
        //底层模块   高层模块直接依赖了底层模块
//        v1
//        Caoxin caoxin = new Caoxin();
//        caoxin.buyDengzi();
//        caoxin.buyGuiZi();
//        caoxin.buyShaFa();

//        v2
//        Caoxin caoxin = new Caoxin();
//        caoxin.buyJiaJu(new DengZi());
//        caoxin.buyJiaJu(new GuiZi());
//        caoxin.buyJiaJu(new ShaFa());

//        v3
//        Caoxin caoxin = new Caoxin(new DengZi());
//        caoxin.buyJiaJu();

//        v4
//        Caoxin caoxin = new Caoxin();
//        caoxin.setJiaJu(new DengZi());
//        caoxin.buyJiaJu();
//
//        caoxin.setJiaJu(new GuiZi());
//        caoxin.buyJiaJu();
    }
}
