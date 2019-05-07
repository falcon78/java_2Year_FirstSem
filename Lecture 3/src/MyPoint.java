public class MyPoint {
    private int x;
    private int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double getR() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double getTheta() {
        double radian =  Math.atan2(this.y, this.x);
        return Math.toDegrees(radian);
    }

    public double distance(MyPoint anotherPoint) {
        double deltaX = Math.abs(this.x - anotherPoint.x);
        double deltaY = Math.abs(this.y - anotherPoint.y);
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public String toString() {
        return "a MyPoint(" + getX() + ", " + getY() + ")";
    }

}
