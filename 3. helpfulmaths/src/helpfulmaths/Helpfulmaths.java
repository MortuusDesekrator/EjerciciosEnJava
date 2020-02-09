/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpfulmaths;
import java.util.*;
public class Helpfulmaths {

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
 
        List<String> list = Arrays.asList(s.split("\\+"));
        list.sort(Comparator.naturalOrder());
        for (int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i));
            if (i<list.size()-1) System.out.print("+");
        }
        System.out.println();
    }
    
}