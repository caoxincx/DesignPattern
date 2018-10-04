package pattern.designpriciple.liskovSubstitution.Square;


public class Rectange implements Quadrangle {
    private long width;
    private long height;

    @Override
    public Long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
    @Override
    public Long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }
}
