package pattern.creation.singleton.staticinnersingleton;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/30
 * @修改人和其它信息
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName());
    }
}
