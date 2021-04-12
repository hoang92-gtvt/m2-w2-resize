package shape;

import resizeable.Resizeable;

public class Circle implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPrimeter(){
        return this.radius*Math.PI*2;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI/4;
    }

    @Override
    public void resize(double percent) {
        this.radius = this.getRadius()*percent;
    }




    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
