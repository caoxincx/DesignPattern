package pattern.creation.abstractfactory;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/28
 * @修改人和其它信息
 */
public class JavaCode implements Code {
    @Override
    public Code makeCode() {
        System.out.println("java code...");
        return new JavaCode();
    }
}
