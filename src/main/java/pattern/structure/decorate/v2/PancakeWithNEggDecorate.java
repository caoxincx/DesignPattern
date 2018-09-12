package pattern.structure.decorate.v2;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/9/12
 * @修改人和其它信息
 */
public class PancakeWithNEggDecorate extends PancakeDecorate{

    public PancakeWithNEggDecorate(PancakeInterface pancake) {
        super(pancake);
    }

    @Override
    public String decription() {
        return super.decription() + " 加一个鸡蛋";
    }

    @Override
    public int price() {
        return super.price() + 1;
    }
}
