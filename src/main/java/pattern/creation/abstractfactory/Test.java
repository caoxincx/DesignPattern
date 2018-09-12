package pattern.creation.abstractfactory;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/28
 * @修改人和其它信息
 */
public class Test {
    /*
    抽象工厂关注与产品族，在这个例子中，java产品有 javaVedio 和 javaCode
                                        python产品有pythonVedio  和  pythonCode

                                        产品族有：Vedio 和  Code

                                        抽象工厂主要依赖产品族的对象创建问题

                                        同品牌叫的不同产品叫产品族
                                        不同品牌的同一个产品叫产品线

     */
    public static void main(String[] args) {
        CourseFactory javaCourse = new JavaFactory();
        javaCourse.produceCode();
        javaCourse.produceVedio();


        CourseFactory python = new PythonCourse();
        python.produceVedio();
        python.produceCode();
    }
}
