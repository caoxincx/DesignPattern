package pattern.creation.singleton.doubleCheck;

/**
 * @描述 优化懒汉式，性能优化并且防止指令重排序
 * @创建人 caoxin
 * @创建时间 2018/8/30
 * @修改人和其它信息
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton doubleCheckSingleton;
    private DoubleCheckSingleton(){

    }
    public static DoubleCheckSingleton getInstance(){
        if (doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                if (doubleCheckSingleton == null){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                    /*
                    new 一个对象的时候会发生三件事情：
                    1.为对象分配内存空间
                    2.初始化一个对象
                    3.将对象的内存地址指向该对象引用

                    2和3可能会发生指令重排序，发生了会是什么情况？
                    Thread0进入到第18行代码时,new的时候发生的顺序是：1,3,2在3的时候阻塞了
                    Thread1进入正常执行判断对象不为空的时候，返回并使用了该对象。所以报了空指针


                    使用volatile可以防止指令重排序
                    volatile的原理是：
                    1.每个线程都有一块cpu的缓存，当发生对内存写操作的时候，volatile禁用其他县城对该对象
                    的缓存，当其他线程进行都的时候就必须从内存中重新读取该对象的值，保证了每当其他线程
                    读取该值时，读取到的值都是内存中最新的*/
                }
            }
        }
        return doubleCheckSingleton;
    }
}
