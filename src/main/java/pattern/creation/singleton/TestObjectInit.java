package pattern.creation.singleton;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/10/26
 * @修改人和其它信息
 */
public class TestObjectInit extends  TestObjectInitObject{
    static {
        System.out.println("子类static{}");
    }
    {
        System.out.println("子类{}");
    }
    public TestObjectInit(){
        System.out.println("子类constructor");
    }

    public static void main(String[] args) {
        new TestObjectInit();
    }
}
