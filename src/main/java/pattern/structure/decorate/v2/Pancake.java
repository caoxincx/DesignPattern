package pattern.structure.decorate.v2;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/9/12
 * @修改人和其它信息
 */
public class Pancake extends PancakeInterface {
    @Override
    public String decription() {
        return "煎饼";
    }

    @Override
    public int price() {
        return 8;
    }
}
