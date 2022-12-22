public class Ball {
    private double x;
    private double y;
    Ball(){}
    Ball(double x, double y){ this.x=x; this.y= y;}

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void move (double xDisp, double yDisp){
        this.x+=xDisp;
        this.y+=yDisp;
    }

    @Override
    public String toString() {
        return "Coords is: (" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}