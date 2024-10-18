public class Functions {
    // Defining function f
    public static double f (double b) {
        return (b * b);
    }
    // Defining function g
    public static double g (double a) {
        return (2*a+7*a*a);
    }

    // Finding the composition of 2 functions
    public static double composition (double x) {
        return f(g(x));
    }
}
