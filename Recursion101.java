 
class Solution{
    public static int [] solve(int a, int b){
         return zeroArrayRule(a, b);
    }
  public static int[] zeroArrayRule(int a, int b) {
        if (a == 0 || b == 0) {
            return new int[]{a, b};
        } else {
            return secondRule(a, b);
        }
    }

    public static int[] secondRule(int a, int b) {
        if (a >= 2 * b) {
            a = a - 2 * b;
            return zeroArrayRule(a, b);
        } else {
            return thirdStep(a, b);
        }
    }

    private static int[] thirdStep(int a, int b) {
        if (b >= 2 * a) {
            b = b - 2 * a;
            return zeroArrayRule(a, b);
        } else {
            return new int[]{a, b};
        }
    }
  
}
