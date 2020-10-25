public class NumberZooPatrol {

    public static int findMissingNumber(int[] numbers) {
    int[] numbersSort = new int[numbers.length + 1];
    for (int i = 0; i < numbers.length; i++) {
      numbersSort[numbers[i]-1] = numbers[i];
    }
    for (int i = 0; i < numbersSort.length; i++) {
      if (numbersSort[i] == 0) {
        return i+1;
      }
    }
    return numbersSort.length+1;
  }
  
}
