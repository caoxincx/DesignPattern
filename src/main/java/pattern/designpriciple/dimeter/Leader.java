package it.caoxin.designpriciple.dimeter;

import java.util.ArrayList;
import java.util.List;

public class Leader {
    public void checkForCourses() {
        Course course = new Course();
        List<Course> list = new ArrayList<Course>();
        for (int i = 0; i < 20; i++){
            list.add(new Course());
        }
        System.out.println(list.size());
    }
}
