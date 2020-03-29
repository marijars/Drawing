package drawing.model;

public class Line {
    private Point a;
    private Point b;
    private boolean selected;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Line(Point a, Point b, boolean selected) {
        this(a,b);
        this.selected = selected;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public double length() {
        return a.distance(b);
    }
}
