public class WindChill {
    public static void main(String[] args) {
        double v = Double.parseDouble(args[0]);
        double t = Double.parseDouble(args[1]);
        System.out.println(35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16););

    }
}
