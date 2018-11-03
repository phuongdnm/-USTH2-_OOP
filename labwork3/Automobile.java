class Automobile {
    private static double fuel;
    private static double speed;
    private static String license;

    public static void init(double f, double s, String l) {
        fuel = f;
        speed = s;
        license = l;
    }

    public static void accelerate(double v) {
        if (fuel > 0) speed += v;
    }

    public static void decelerate(double v) {
        if (fuel <= 0) speed -= v;
    }

    public static void main(String[] args) {
        init(4.5, 34, "29JAD");
        accelerate(4);
        decelerate(5);
    }

}
