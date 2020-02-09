
package gravity;
import java.util.*;
public class Gravity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
     int arreglo[] = new int[n];
     int aux = 0;
     
         for (int i = 0; i < arreglo.length; i++) {
              arreglo[i] = sc.nextInt();
        }
         
      
       for (int i = 0; i < arreglo.length - 1; i++) {
              for (int j = i; j < arreglo.length; j++) {
                  if (arreglo[i]>arreglo[j]) {
                      aux = arreglo[i];
                      arreglo[i] = arreglo[j];
                      arreglo[j]= aux;
                  }
              }
        }
       
       for (int i = 0; i < arreglo.length; i++) {
              System.out.print(arreglo[i] + " ");
        }
    }
    
}