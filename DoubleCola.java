 
public class Line {
   public static String WhoIsNext(String[] names, int n)
     {
          n--;
          while (n >= names.length) {
            n = (int)Math.floor((n - names.length) / 2);
          }
          return names[n];
      }
}
 
