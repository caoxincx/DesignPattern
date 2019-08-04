package pattern.behaviour.delegate.v1;

import java.util.HashMap;
import java.util.Map;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2019/8/5
 * 功能描述:
 * 修改日期:2019/8/5
 * 修改描述:
 */
public class TargetDelegate {
    private Map<String, ITarget> targetMap = new HashMap<>();
    public TargetDelegate() {
        targetMap.put("模块A", new TargetA());
        targetMap.put("模块B", new TargetB());
    }

    public void delegateMeToDo(String something){
        targetMap.get(something).doSomething();
    }
}
