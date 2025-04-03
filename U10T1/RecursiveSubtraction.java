public class RecursiveSubtraction {
    public static void main(String [] args) {
      System.out.println(recursiveSubtraction(10));
    }
    
    // this non-void, recursive method returns an int
    public static int recursiveSubtraction(int num) {
      if (num > 0) {
        return num - recursiveSubtraction(num - 1);
      } else {
        return 0;
      }
    }
  }
  