package pattern.designpriciple.liskovSubstitution.Square;

public class Square implements Quadrangle {
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public Long getWidth() {
        return getSideLength();
    }

    @Override
    public Long getHeight() {
        return getSideLength();
    }
}
