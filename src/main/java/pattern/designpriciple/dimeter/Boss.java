package pattern.designpriciple.dimeter;

import java.util.ArrayList;
import java.util.List;
/*
迪米特原则：最少知道原则
业务场景：老板叫员工去看看有多少门课程
重点分清楚那些是朋友：成员变脸，方法中的入参，输出是朋友，其他都不是
迪米特原则：只和朋友交流，不和陌生人交流，看看import了什么类

 */
public class Boss {
    public void orderCheckCourse(Leader leader){
        //这里Boss和Course是陌生人，Course不该由Boss创建
//        Course course = new Course();
//        List<Course> list = new ArrayList<Course>();
//        for (int i = 0; i < 20; i++){
//            list.add(new Course());
//        }
        leader.checkForCourses();
    }
}
