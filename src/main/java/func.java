public class func {
    // y=arcsin(-x) + 13x
    private static double x;

    public func(double x) {
        this.x = x;
    }
    public static double function() {
        double y = 0;
        x = Math.toRadians(x);
        y = Math.toDegrees(Math.asin(-x)) + 13*x;

        return y;
    }
}
