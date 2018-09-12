package pattern.structure.decorate.v1;

/**
 * @描述 煎饼+鸡蛋+香肠  引出    装饰器
 *  *      结构型模式
 *
 *  JDK BufferedReader BufferedWriter
 *      Mybatis Cache
 * @创建人 caoxin
 * @创建时间 2018/9/12
 * @修改人和其它信息
 */
public class Test {
    public static void main(String[] args) {

        //1.买一个煎饼加鸡蛋的
        Pancake pancakeWithEgg = new PancakeWithEgg();
        System.out.println(pancakeWithEgg.decription()+pancakeWithEgg.price()+"元");

            //2.买一个煎饼加香肠的
        Pancake pancakeWithSausage = new PancakeWithSausage();
        System.out.println(pancakeWithSausage.decription()+pancakeWithSausage.price()+"元");

        //3.买一个煎饼加鸡蛋和香肠的
        Pancake pancakeWithSausageAndEgg = new PancakeWithEggAndSausage();
        System.out.println(pancakeWithSausageAndEgg.decription()+pancakeWithSausageAndEgg.price()+"元");

        //4.当我需要一个两个鸡蛋，这样不是满足不了客户的需求了？
        //引入装饰模式v2
    }
}
