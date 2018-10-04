package pattern.designpriciple.openclose;

public class JavaDisCountCourse extends JavaCourse {
    public JavaDisCountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }
}
