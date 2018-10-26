package pattern.designpriciple.liskovSubstitution.Square.methodoutput;

import java.util.Map;

public class SubClass extends Base {

    /*
    重写父类方法时，如果return值比父类还大，就保证不了重写的逻辑正确性了
     */
//    @Override
//    public Object method() {
//        return super.method();
//    }
}
