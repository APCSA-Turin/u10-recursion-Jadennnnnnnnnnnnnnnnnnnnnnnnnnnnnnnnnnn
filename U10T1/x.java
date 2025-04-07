public class x  {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int fibRec = fibRecursive(40);
        long endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;


        startTime = System.nanoTime();
        int fibIter = fibIterative(40);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;
        System.out.println("Fibonacci(" + 40 + ")");

        System.out.println("Recursive: " + fibRecursive(40) + " | Time: " + recursiveTime / 1e6 + " ms");
        System.out.println("Iterative: " + fibIterative(40) + " | Time: " + iterativeTime / 1e6 + " ms");

    }

    private static int fibRecursive(int x) { 
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        // double recursive method call
        return fibRecursive(x - 1) + fibRecursive(x - 2);
    }

    public static int fibIterative(int n){
        if (n <= 1) {
            return n;
        }
        int one = 0; int two = 1;
        for (int i = 0; i < n - 1; i++) {
            int temp = one + two;
            one = two;
            two = temp;
        }
        return two;
    }
    
}

