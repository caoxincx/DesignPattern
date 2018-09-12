package pattern.creation.abstractfactory;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/28
 * @修改人和其它信息
 */
public class PythonCourse implements CourseFactory {
    @Override
    public Vedio produceVedio() {
        return new PythonVedio().makeVedio();
    }

    @Override
    public Code produceCode() {
        return new PythonCode().makeCode();
    }
}
