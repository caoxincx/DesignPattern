package pattern.creation.builder.v2;

import com.google.common.collect.ImmutableSet;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/8/30
 * @修改人和其它信息
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder().
                buildDiplayCard("索菲亚主板").
                buildMemory("恒大内存").
                buildPower("移动电源").
                buildDiplayCard("google显卡").buildComputer();
        System.out.println(computer.toString());

        ImmutableSet<String> immutableSet = new ImmutableSet.Builder<String>().add("a").add("b").build();
        System.out.println(immutableSet);
    }
}
