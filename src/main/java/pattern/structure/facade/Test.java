package pattern.structure.facade;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/9/12
 * @修改人和其它信息
 */
public class Test {
    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        Disk disk = new Disk();

        cpu.open();
        disk.open();
    }
}
