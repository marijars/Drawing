package drawing.model;

public class Circle {
    private Point o; //circle center
    private double r;
    private boolean selected;

    public Circle(Point o, double r) {
        this.o = o;
        this.r = r;
    }

    public Circle(Point o, double r, boolean selected) {
        this(o,r);
        this.selected = selected;
    }
    public Point getO() {
        return o;
    }

    public void setO(Point o) {
        this.o = o;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public double area() {
        return r * r * Math.PI;
    }
}
