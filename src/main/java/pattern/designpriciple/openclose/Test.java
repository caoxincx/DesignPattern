package it.caoxin.designpriciple.openclose;

/*
    1.开闭原则：对增加代码功能开放，对修改代码关闭
    2.使用抽象构建框架，实现扩展细节
    3.面向抽象编程
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDisCountCourse(48,"java",384d);

        JavaDisCountCourse javaDisCountCourse = (JavaDisCountCourse)iCourse;

        System.out.println("id:"+javaDisCountCourse.getId());
        System.out.println("name:"+javaDisCountCourse.getName());
        System.out.println("price:"+ javaDisCountCourse.getOriginPrice());
        System.out.println("discountprice:"+javaDisCountCourse.getPrice());


        //需求变更：现在课程打折出售

        /*
             //1.可以在接口中加一个方法
            影响：实现这个接口的所有类都需要加一个实现
         */
        /*
             //2.可以修改JavaCourse中的代码
            影响：所有打折的课程都需要修改
         */

        //需求再次变更：现在课程需要显示出原价和打折出售
        /*
             上述两种方法都不可取，那么要怎么办呢？
             继承JavaCourse
             为什么：如果修改上层代码：与此有关得代码很容易出现bug
             如果你新增一个类那么对原来的类就没有影响，程序的稳定性健壮性就高
         */

    }
}
