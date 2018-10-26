package pattern.creation.singleton;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/10/26
 * @修改人和其它信息
 */
public class TestObjectInitObject {
    static {
        System.out.println("父类static{}");
    }
    {
        System.out.println("父类{}");
    }
    public TestObjectInitObject(){
        System.out.println("父类constructor");
    }
}
