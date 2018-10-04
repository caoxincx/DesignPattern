package pattern.designpriciple.singleresponsibility.singleinterface;

public interface Course {
    /*
        一个接口中接口中定义的功能职责不单一，可以将接口进行单一化处理
     */
    //获取课程信息的接口
    String getCourseName();
    byte[] getCourseVideo();


    //课程管理的接口
    void studyCourse();
    void refoundCourse();
}
