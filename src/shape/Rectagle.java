package shape;

import resizeable.Resizeable;

public class Rectagle implements Resizeable {
    private  double width;
    private  double height;

    public Rectagle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void resize(double percent) {

        this.width = this.getWidth()*percent;
        this.height = this.height*percent;
    }

    @Override
    public String toString() {
        return "Rectagle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
