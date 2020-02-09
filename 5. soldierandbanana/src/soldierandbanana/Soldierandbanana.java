
package soldierandbanana;

import java.util.*;
public class Soldierandbanana {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      Scanner s = new Scanner (System.in);
      int k = s.nextInt();
      int n = s.nextInt();
      int w = s.nextInt();
      int z=k*w*(w+1)/2-n;
      if(z<0) z=0;
      System.out.println(z);
    }
}