public class Problem3 {
    public static void main(String [] args) {
        recursivePrinter(0);
    }

    public static void recursivePrinter(int number) {
        if (number <= 10) {
            recursivePrinter(number + 2);
        }
        System.out.println(number);
    }
}
