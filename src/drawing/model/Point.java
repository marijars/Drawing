package drawing.model;

import org.jetbrains.annotations.NotNull;

public class Point {
    //point coordinates
    private int x;
    private int y;
    private boolean selected;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point (int x, int y, boolean selected) {
        this(x, y);
        this.selected = selected;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public double distance(@NotNull Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        double distance = Math.sqrt(dx*dx + dy*dy);
        return distance;
    }




}
