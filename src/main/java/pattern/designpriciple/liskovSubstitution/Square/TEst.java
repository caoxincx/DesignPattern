package it.caoxin.designpriciple.liskovSubstitution.Square;

/*
里氏替换原则：
    在程序中：如果在执行A(),父类能保证能执行，则将父类替换成子类也能执行。
    下面的例子，父类能执行成功resize()方法，但子类不能执行，说明了违反了里氏替换原则。
 */
public class TEst {
    public static void resize(Rectange rectange){
        while (rectange.getWidth() <= rectange.getHeight()){
            rectange.setWidth(rectange.getWidth()+1);
            System.out.println(rectange.getWidth()+":"+rectange.getHeight());
        }
    }

    public static void main(String[] args) {
//        Rectange rectange = new Rectange();
//        rectange.setWidth(10L);
//        rectange.setHeight(20L);
//
//        resize(rectange);

        //这里运行报错，Square不再试Rectangle的子类，防止了继承的泛滥
//        Square square = new Square();
//        square.setSideLength(10L);
//        resize(square);

    }
}
