package pattern.structure.decorate.v1;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/9/12
 * @修改人和其它信息
 */
public class PancakeWithEggAndSausage extends Pancake {
    @Override
    public String decription() {
        return super.decription()+" 加一个鸡蛋 加一个香肠";
    }

    @Override
    public int price() {
        return super.price() + 2 + 1;
    }
}
