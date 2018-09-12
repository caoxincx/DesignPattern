package pattern.creation.singleton.staticinnersingleton;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/30
 * @修改人和其它信息
 */
public class StaticInnerSingleton {
    private StaticInnerSingleton(){

    }
    //静态内部类，利用了当多个线程初始化一个类的时候，jvm保证初始化这个类是同步的
    //1.第一次时候到该类
    //2.第一次使用该类的静态程媛
    //3.第一次为该类的静态成员赋值
    //4.第一次调用该静态成员大的方法
    private static class Singleton{
        private static StaticInnerSingleton staticInnerSingleton = new StaticInnerSingleton();

    }
    public static StaticInnerSingleton getInstance(){
        return Singleton.staticInnerSingleton;
    }
}
