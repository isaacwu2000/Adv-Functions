public class Functions {
    // Defining function f
    public static double f (double a) {
        return (a);
    }
    // Defining function g
    public static double g (double b) {
        return (2*b+7);
    }

    // Finding the composition of 2 functions
    public static double funcComposition (double x) {
        return f(g(x));
    }

}
