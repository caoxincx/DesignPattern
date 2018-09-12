package pattern.creation.builder.v1;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/30
 * @修改人和其它信息
 */
public class Test {
    public static void main(String[] args) {
        /*
        建造者模式：
        1.Builder:为创建某样东西创建规则(规则一定定制下来就不常变化)，修改规则的时候回很麻烦
        2.ActualBuilder:实际的Builder
        3.Computer:实际需要创建的事物
        4.建造Computer
         */
        Boss boss = new Boss();
        boss.setActualBuilder(new ActualBuilder());
        Computer computer = boss.getComputer("I7显卡","戴尔主板","金士顿内存","长城电源","西索硬盘");
        System.out.println(computer);
    }
}
