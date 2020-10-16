package kata;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSidesOfAnArayy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
		scan.close();
		System.out.println(findEvenIndex(input));

	}



 public static int findEvenIndex(int[] arr) {
    
    for (int i = 0; i < arr.length; i++) {
      int sumR = 0;
      int sumL = 0;
      for (int j = 0; j < i; j++) {
        sumL += arr[j];
      }
      for (int j = (i + 1); j < arr.length; j++) {
        sumR += arr[j];
      }
      if (sumL == sumR) {
        return i;
      }
    }
    return -1;
  }
}
