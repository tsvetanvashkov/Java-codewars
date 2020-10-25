public class Kata {
  public static int nextHigher(int n) {
    String binary = Integer.toBinaryString(n);
    if(binary.charAt(0) == '1') {
      binary = "0" + binary;
    }
    int[] binaryArray = new int[binary.length()];
    for (int i = 0; i < binaryArray.length; i++) {
      binaryArray[i] = (int)binary.charAt(i) - 48;
    }
    for (int i = binaryArray.length - 1; i >= 0 ; i--) {
      if (binaryArray[i] == 1) {
        for (int j = (i - 1); j >= 0; j--, i--) {
          if (binaryArray[j] == 0) {
            binaryArray[i] = binaryArray[i] ^ binaryArray[j];
            binaryArray[j] = binaryArray[i] ^ binaryArray[j];
            binaryArray[i] = binaryArray[i] ^ binaryArray[j];
            break;
          }
        }
        break;
      }
      
    }
    String output = "";
    for (int i = 0; i < binaryArray.length; i++) {
      output += binaryArray[i];
    }
    
    return Integer.parseInt(output, 2);
  }
}
