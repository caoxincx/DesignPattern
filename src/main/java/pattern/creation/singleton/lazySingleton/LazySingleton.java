package pattern.creation.singleton.lazySingleton;

/**
 * @描述 单利模式：懒汉式+sychronized
 * @创建人 caoxin
 * @创建时间 2018/8/30
 * @修改人和其它信息
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
