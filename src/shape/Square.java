package shape;

public class Square extends Rectagle {
    private double edg;

    public Square(double edg) {
        super(edg, edg);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public String toString() {
        return "Square{" +
                "edg=" + edg +
                '}';
    }
}
