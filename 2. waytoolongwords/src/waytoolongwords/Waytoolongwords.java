/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waytoolongwords;

import java.util.*;
public class Waytoolongwords {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.nextLine();
      for (int i=0; i<n; i++){
          s = sc.nextLine();
          if (s.length()<=10){
              System.out.println(s);
          }
          else{
            System.out.println(s.substring(0,1)+(s.length()-2)+s.substring(s.length()-1));  
          }
          
    }
}
}