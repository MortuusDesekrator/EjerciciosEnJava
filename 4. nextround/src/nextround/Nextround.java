
package nextround;

import java.util.*;
public class Nextround {

   public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ai[] = new int[n];
        int i;
        for (i=0; i<n; i++)
        {
            ai[i] = sc.nextInt();
        }
        for (i=0; i<n; i++)
        {
            if (ai[i] <= 0) 
            {
                break;
            }
            if (ai[i] < ai[k-1]) 
            {
                break;
            }
        }
        System.out.println(i);
    }
    
}