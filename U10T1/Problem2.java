public class Problem2 {
    public static void main(String [] args) {
        System.out.println("main called");
        simpleRecursion(5);
        System.out.println("main ended");
    }

    public static void simpleRecursion(int n) {
        System.out.println("recursive call, n = " + n);
        if (n > 2) {
            simpleRecursion(n - 1);
        }
        System.out.println("recursive end, n = " + n);
    }
}

