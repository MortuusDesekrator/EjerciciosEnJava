/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theatresquare;
import java.util.*;
public class Theatresquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int n = sc.nextInt();
      int a = sc.nextInt();
      long na = n/a;
      long ma = m/a;
      if(na*a<n) na++;
      if(ma*a<m) ma++;
       System.out.println(na * ma);
    }
    
}
