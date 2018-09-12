package pattern.creation.simplefactory.ex2;



/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/28
 * @修改人和其它信息
 */
public class CarFactory {
    public static Car CarFactory(Class clazz){
        Class<?> getClazz = null;
        Car car = null;
        try {
            getClazz = Class.forName(clazz.getName());
            car = (Car) getClazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        if (car != null){
            return car;
        }
        return null;
    }
}
