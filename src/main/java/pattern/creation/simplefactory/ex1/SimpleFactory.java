package pattern.creation.simplefactory.ex1;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/28
 * @修改人和其它信息
 */
public class SimpleFactory {
    public static Car CarFactory(String carName){
        if (carName.equals("BMW")) {
            return new BMW();
        } else if (carName.equals("FLL")) {
            return new FLL();
        } else if(carName.equals("JL")){
            return new JL();
        }
        return null;
    }
}
