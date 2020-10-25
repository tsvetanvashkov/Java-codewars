public class Dinglemouse {

  public static int peakHeight(char[][] mountain) {
    char height = '0';
    boolean moreheight = true;
    boolean thereHight = false;
    while (moreheight) {
      height++;
      moreheight = false;
      for (int i = 0; i < mountain.length; i++) {
        for (int j = 0; j < mountain[0].length; j++) {
          if (mountain[i][j] == '^') {
            thereHight = true;
            if ((i == 0) || (j == 0) || (i == mountain.length - 1) || (j == mountain[0].length - 1)) {
              mountain[i][j] = height;
            }else if ((mountain[i-1][j] != '^') && (mountain[i-1][j] != height) ||
                (mountain[i+1][j] != '^') && (mountain[i+1][j] != height) ||
                (mountain[i][j-1] != '^') && (mountain[i][j-1] != height) ||
                (mountain[i][j+1] != '^') && (mountain[i][j+1] != height)) {
              mountain[i][j] = height;
            }else {
              moreheight = true;
            }
          }
        }
      }
    }
    if (thereHight != true) {
      height = '0';
    }
    
    return (int)(height - 48);
  }

}
