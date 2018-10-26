package pattern.designpriciple.singleresponsibility.singleinterface;

public interface ICourse extends ICourseInfo,ICourseManager {
    @Override
    String getCourseName();

    @Override
    byte[] getCourseVideo();

    @Override
    void studyCourse();

    @Override
    void refoundCourse();
}
