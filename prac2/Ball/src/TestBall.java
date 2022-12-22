public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Ball ball1 = new Ball(0.0, 0.0);
        ball1.setX(10.32431);
        ball1.setY(8.4932);
        System.out.println(ball1.toString());
        ball1.setXY(0.314, 24.049);
        System.out.println();
        System.out.println(ball1.toString());
        ball1.move(32.009, 8.12095);
        System.out.println();
        System.out.println(ball1.toString());
    }
}