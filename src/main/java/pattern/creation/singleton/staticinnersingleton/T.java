package pattern.creation.singleton.staticinnersingleton;

import pattern.creation.singleton.lazySingleton.LazySingleton;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/30
 * @修改人和其它信息
 */
public class T implements Runnable {
    @Override
    public void run() {
        StaticInnerSingleton instance = StaticInnerSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+instance);
    }
}
