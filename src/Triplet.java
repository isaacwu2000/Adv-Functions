public class Triplet {
    public double a,b,c;
    public static Double testFunction (int x) {
        Double a = (double) x;
        return a*a;
    }

    // Checking for oddness, evenness, neither, and invertibility (with horizantal line test)
    // Iterating over -10,000 to 10,000
    public static boolean isEven () {
        for (int i = 0; i <= 10000; i++) {
            if (!testFunction(i).equals(testFunction(-1 * i))) {
                return false;
            }
        }
        return true;
    }
    public static boolean isOdd () {
        for (int i = 0; i <= 10000; i++) {
            if (-1*testFunction(i) != 1*testFunction(-1 * i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isInvertible () {
        for (int i = -10000; i<= 10000; i++) {
            for (int j = -10000; j<=10000; j++) {
                if (testFunction(i).equals(testFunction(j)) && i != j) {
                    return false;
                }
            }
        }
        return true;
    }
}
