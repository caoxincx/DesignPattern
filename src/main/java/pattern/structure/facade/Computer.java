package pattern.structure.facade;

/**
 * @描述
 * @创建人 caoxin
 * @创建时间 2018/9/12
 * @修改人和其它信息
 */
public class Computer {
    private Cpu cpu;
    private Disk disk;

    public Computer(){
        cpu = new Cpu();
        disk = new Disk();
    }

    public void open(){
        cpu.open();
        disk.open();
    }
}
