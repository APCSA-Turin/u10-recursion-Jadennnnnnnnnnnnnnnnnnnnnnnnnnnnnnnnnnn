public class Problem1 {
    public static void main(String [] args) {
        System.out.println("main method called");
        recursiveMethod(1);
        System.out.println("main method ended");
    }

    public static void recursiveMethod(int n) {
        System.out.println("recursive called, n = " + n);
        if (n < 4) {
            recursiveMethod(n + 1);
        }
        System.out.println("recursive ended, n = " + n);
    }
}
